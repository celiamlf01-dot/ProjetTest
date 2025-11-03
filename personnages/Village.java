package personnages;
public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, int nbMaxVillageois, Gaulois chef) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[nbMaxVillageois];
        chef.setVillage(this); // le chef appartient au village
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois g) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois++] = g;
            g.setVillage(this);
        }
    }

    public Gaulois trouverVillageois(int numero) {
        if (numero <= 0 || numero > nbVillageois) {
            System.out.println("Il n’y a pas autant d’habitants dans notre village !");
            return null;
        }
        return villageois[numero - 1];
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (Gaulois g : villageois) {
            if (g != null) System.out.println("- " + g.getNom());
        }
    }

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);

        Gaulois gaulois = village.trouverVillageois(30); // test

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        System.out.println(village.trouverVillageois(1));
        System.out.println(village.trouverVillageois(2));

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();

        Gaulois doublepolemix = new Gaulois("Doublepolémix", 4);
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublepolemix.sePresenter();
    }
}
