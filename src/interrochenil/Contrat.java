package interrochenil;

public abstract class Contrat {

    // attributs
    protected static int numContrat;
    protected  int prixJour;
    protected int nbJours;

    // constructeur
    public Contrat(){
        this.prixJour = 0;
        this.nbJours = 0;
    }

    public Contrat(int p, int n){
        this.prixJour = p;
        this.nbJours = n;
        numContrat++;
    }

    // getter et setter
    public int getPrixJour() { return this.prixJour; }
    public int getNbJours() { return this.nbJours; }

    public void setPrixJour(int p) { this.prixJour = p; }
    public void setNbJours(int n) { this.nbJours = n; }

    // méthodes
    public abstract int prixTotal();
}
