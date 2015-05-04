/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.DocumentoEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cami
 */
public class DocumentoDao 
{
    @PersistenceContext(name = "Buscador-ejbPU")
    
    private EntityManager entityManager;
    public List<DocumentoEntity> findAll() {
        List<DocumentoEntity> resp = entityManager.createNamedQuery("DocumentoEntity.findAll").getResultList();        
        return resp;
    }
    
}
