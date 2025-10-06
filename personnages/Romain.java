package personnages;
public class Romain {
private String nom;
private int force;
public Romain(String nom, int force) {
this.nom = nom;
this.force = force;
}
public String getNom() {
return nom;
}
void recevoirCoup(int forceCoup)
{
    if(force>0)
    this.force-=forceCoup;

    if(force==0){
        System.out.println("jabandonne");
    }

}
public void parler(String texte) {
System.out.println(prendreParole() + "\"" + texte + "\"");
}
private String prendreParole() {
return "Le romain " + nom + " : ";
}
}
