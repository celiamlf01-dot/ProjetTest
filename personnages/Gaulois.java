package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private Village village; // lien vers le village

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public String getNom() {
        return nom;
    }

    public void sePresenter() {
        if (village == null) {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
                               ". Je voyage de villages en villages.\"");
        } else if (this == village.getChef()) {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
                               ". Je suis le chef du village " + village.getNom() + ".\"");
        } else {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom +
                               ". J'habite le village " + village.getNom() + ".\"");
        }
    }

    @Override
    public String toString() {
        return nom;
    }
}
