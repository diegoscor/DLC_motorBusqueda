/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import beans.DocumentoBean;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author cami
 */
@Remote
public interface DocumentoInterfazRemote 
{

    List<DocumentoBean> listarDocumentos();
    
    String listarDocumentosString();
    
    
    
}
