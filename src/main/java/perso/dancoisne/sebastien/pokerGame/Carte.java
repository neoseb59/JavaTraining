package perso.dancoisne.sebastien.pokerGame;

public class Carte {
    private final Couleur couleur;

    private final Valeur valeur;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur=" + couleur +
                ", valeur=" + valeur +
                '}';
    }
}
