package perso.dancoisne.sebastien.pokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public record Paquet(List<Carte> cartes) {

    @Override
    public String toString() {
        return "Paquet{" +
                "cartes=" + cartes +
                '}';
    }

    public List<Carte> getCardsByColor() {
        cartes().sort(Comparator.comparing(Carte::getCouleur));
        return cartes();
    }

    public List<Carte> getCardsByValeur() {
        cartes().sort(Comparator.comparing(Carte::getValeur));
        return cartes();
    }

    public List<Carte> getShuffled() {
        Collections.shuffle(cartes());
        return cartes();
    }

    public boolean isSameColor() {
        Couleur first_couleur = cartes().get(0).getCouleur();
        List<Carte> list = cartes()
                .stream()
                .filter(carte -> !carte.getCouleur().equals(first_couleur))
                .toList();
        return list.size() == 5;
    }

    public boolean isSuccessive() {
        List<Carte> ordered = getCardsByValeur();
        for (int i = 0; i < ordered.size() - 1; i++) {
            if (ordered.get(i).getValeur().compareTo(ordered.get(i + 1).getValeur()) != 1)
                return false;
        }
        return true;
    }

    public int getMaxNumberOfSameValue() {
        return cartes()
                .stream()
                .collect(groupingBy(Carte::getValeur))
                .values()
                .stream()
                .map(List::size)
                .max(Integer::compare)
                .get();
    }

    public ArrayList<Carte> getNCartes(int n) throws Exception {
        if (cartes().size() < n) {
            throw new Exception("Not enough element");
        }
        cartes().subList(0, n).clear();
        return cartes().stream().limit(n).collect(Collectors.toCollection(ArrayList::new));
    }
}
