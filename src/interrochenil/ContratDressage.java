/**
 * CE FICHIER EST A RENDRE
 */

package interrochenil;

/**
 * Lorsqu'un client souhaite faire dresser son chien, il passe un contrat 
 * de dressage auprès du chenil. Le chien est alors dressé tous les jours
 * par un maître formateur. Comme le contrat le pensionnat, le contrat de dressage
 * dispose d'un numéro l'identifiant. Le prix du dressage est fixé par jour et 
 * le contrat est fixé pour une durée donnée. Le chien ayant besoin de repos, il y a des 
 * jours où il ne sera pas dressé. Ces jours sont retenus et ne sont pas comptabilisés
 * dans le prix total du contrat.
 */
public class ContratDressage extends Contrat{

    // attributs
    private int nbJoursRepos;
    
    // constructeur
    public ContratDressage(){
        super();
        this.nbJoursRepos = 0;
    }

    public ContratDressage(int pj, int nj, int jr){
        super(pj,nj);
        this.nbJoursRepos = jr;
    }

    // getters & setters
    public int getNbJoursRepos() { return this.nbJoursRepos; }

    public void setNbJoursRepos(int jr) { this.nbJoursRepos = jr; }
    
    // toString
    @Override
    public String toString() {
        String res = "[Contrat de dressage n°" + numContrat +  " | Prix : " + getPrixJour() + "€ | Nombre de jours : " + getNbJours() + " | Nombre de jours de repos : " + getNbJoursRepos() + "]";
        return res;
    }
    
    
    // prixTotal : calcul le prix total du contrat en fonction du prix par jour, 
    // du nombre de jours et des jours de repos du chien

    @Override
    public int prixTotal() {
        return (getNbJours() - getNbJoursRepos()) * getPrixJour();
    }
}
