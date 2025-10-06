package personnages;

public class Gaulois {
    private String nom;
    private int force;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }
    public void frapper(Romain romain) {
        String nomRomain = romain.getNom();
        
        System.out.println(nom + "envoie un grand coup dans la mâchoirede " + nomRomain);
        int forceCoup = force / 3;

        romain.recevoirCoup(forceCoup);
    
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    public String toString()
    {
        return "le goulois" +nom +":"+force;
    }

    public static void main(String[] var0) {
      Gaulois var1 = new Gaulois("Astérix", 8);
      Gaulois var2 = new Gaulois("Obélix", 16);
      System.out.println(var1);
      System.out.println("hello");
    }
}
