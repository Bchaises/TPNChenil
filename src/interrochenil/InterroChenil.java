/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrochenil;

import java.util.ArrayList;

/**
 *
 * @author bthouverez
 */
public class InterroChenil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Exemple de programme principal de départ
        // ContratPension pension = new ContratPension(1, 50, 15);
        // System.out.println(pension);
        // System.out.println(pension.prixTotal());
        
        
        // Exemple de programme principal final
        // Quand vous avez terminé et si vous avez respecté les noms des attributs et méthodes,
        // ce programme devrait fonctionner
        ArrayList<Contrat> contrats = new ArrayList<>();
        
        ContratPension pension = new ContratPension(50, 15);
        contrats.add(pension);
        
        ContratDressage dressage = new ContratDressage(125, 10,5);
        contrats.add(dressage);
        
        ContratInsemination insemination = new ContratInsemination(350, "Berger allemand");
        contrats.add(insemination);
        
        for(Contrat c: contrats) {
            System.out.println(c);
            System.out.println("Prix total : " + c.prixTotal() + "€");
            System.out.println();
        }
    }
}
