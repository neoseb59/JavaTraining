package perso.dancoisne.sebastien.pokerGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Carte> cartes = new ArrayList<>();

        Stream.of(Couleur.values())
                .forEach(couleur -> Stream.of(Valeur.values())
                        .forEach(
                            valeur -> cartes.add(new Carte(couleur, valeur)
                        )));


        Paquet paquet = new Paquet(cartes);
        Poker poker = new Poker(paquet);

        System.out.println(paquet.getCardsByColor());
        System.out.println(paquet.getCardsByValeur());
        System.out.println(paquet.getShuffled());
        System.out.println(paquet.cartes());
        System.out.println(poker);
        System.out.println(poker.whoWon());
    }
}
