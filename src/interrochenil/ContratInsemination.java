package interrochenil;

public class ContratInsemination extends Contrat{

    // attribut
    private String race;

    // constructeur
    public ContratInsemination(int pj, String r){
        super(pj, 1);
        this.race = r;
    }

    // getter et setter
    public String getRace() { return this.race; }

    public void setRace(String r) { this.race = r; }

    // méthodes
    @Override
    public int prixTotal() {
        return getPrixJour();
    }

    @Override
    public String toString() {
        String res = "[Contrat d'inséminination n°" + numContrat + " | Race : " + getRace() + "]";
        return res;
    }
}
