package perso.dancoisne.sebastien.pokerGame;

public class Poker {
    private final Paquet joueur1;
    private final Paquet joueur2;

    public Paquet getJoueur1() {
        return joueur1;
    }

    public Paquet getJoueur2() {
        return joueur2;
    }

    public Poker(Paquet paquet) {
        paquet.getShuffled();
        try {
            joueur1 = new Paquet(paquet.getNCartes(5));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            joueur2 = new Paquet(paquet.getNCartes(5));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String whoWon() {
        System.out.println(getHandOfPlayer(getJoueur1()));
        System.out.println(getHandOfPlayer(getJoueur2()));
        if (getHandOfPlayer(getJoueur1()).compareTo(getHandOfPlayer(getJoueur2())) > 0) {
            return "Joueur 1";
        } else {
            return "Joueur 2";
        }
    }

    public TypeOfHand getHandOfPlayer(Paquet paquet) {
        if (paquet.isSuccessive() && paquet.isSameColor()) {
            return TypeOfHand.ROYAL_FLUSH;
        } else if (paquet.isSameColor()) {
            return TypeOfHand.COULEUR;
        } else if (paquet.isSuccessive()) {
            return TypeOfHand.FLUSH;
        } else if (paquet.getMaxNumberOfSameValue() == 3) {
            return TypeOfHand.BRELAN;
        } else if (paquet.getMaxNumberOfSameValue() == 2) {
            return TypeOfHand.PAIR;
        } else {
            return TypeOfHand.ONE_CARD;
        }
    }

    @Override
    public String toString() {
        return "Poker{" +
                "joueur1=" + joueur1 +
                ", joueur2=" + joueur2 +
                '}';
    }
}
