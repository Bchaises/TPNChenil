/**
 * CE FICHIER EST A RENDRE
 */

package interrochenil;

/**
 * Lorsqu'un client souhaite mettre son chien en pension, il passe un contrat 
 * de pension auprès de chenil. Le chien est gardé et nourri pendant la période
 * donnée. Un contrat de" pensionnat dispose d'un noméro qui l'identifie. 
 * Le prix du pensionnat est fixé par jour, le prix total du contrat
 * dépend donc du prix par jour et du nombre de jours.
 */
public class ContratPension extends Contrat{
    
    // Unique constructeur de la classe
    public ContratPension( int pj, int nj) {
        super(pj, nj);
    }

    // méthodes
    @Override
    public String toString() {
        return "[Contrat de pension n°" + numContrat + " | Prix par jour : " + getPrixJour() + "€ | Duree : " + getNbJours() + "]";
    }
    
    // Calcule le prix total du contrat : prix du jour x nombre de jours
    @Override
    public int prixTotal() {
        return getNbJours() * getPrixJour();
    }
}
