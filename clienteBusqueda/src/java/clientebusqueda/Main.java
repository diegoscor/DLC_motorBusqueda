/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientebusqueda;

import ejb.DocumentoInterfazRemote;
import javax.ejb.EJB;

/**
 *
 * @author cami
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    @EJB
    private static DocumentoInterfazRemote doc;

    public static void main(String[] args) {
        
        System.out.println("resultados: "+doc.listarDocumentosString());
    }
    
}
