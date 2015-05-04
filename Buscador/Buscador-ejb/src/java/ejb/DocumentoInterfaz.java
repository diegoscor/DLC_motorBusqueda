/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import beans.DocumentoBean;
import daos.DocumentoDao;
import entities.DocumentoEntity;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import negocio.Documento;

/**
 *
 * @author cami
 */
@Stateless
public class DocumentoInterfaz implements DocumentoInterfazRemote 
{
    @Inject
    DocumentoDao docDao;

    @Override
    public List<DocumentoBean> listarDocumentos() 
    {
               
         List<DocumentoEntity> entidades = docDao.findAll();
         LinkedList<DocumentoBean> beans = new LinkedList<>();//esto lo hacemos porque queremos obtener un objeto de negocio
                                                              //no una entity como la que devuelve la consulta (debido al jpa)    
         entitiesToBeans(entidades, beans); 
         return beans;
     }
    
    //usamos este metodo para convertir las entities que obtenemos de la BD a beans, que son los que podemos maniuplar
     private void entitiesToBeans(List<DocumentoEntity> entidades, LinkedList<DocumentoBean> beans) {
         for (DocumentoEntity entidad : entidades) {
             beans.add(new Documento(entidad).getBean()); //por cada entity que tenemos creamos un objeto de la clase
         }                                                //intermedia y la insertamos en la linkedlist de beans  
     }                                                    //RECORDEMOS QUE LA CLASE DOCUMENTO TIENE UN METODO GETBEAN
                                                          //QUE LO QUE HACE ES DEVOLVERNOS EL BEAN QUE NOSOTROS QUEREMOS
                                                          //ES DECIR, EL OBJETO DE NEGOCIO EL CUAL MANIPULAMOS      

     // Add business logic below. (Right-click in editor and choose
     // "Insert Code > Add Business Method")
     
     //@Override
     public String listarDocumentosString() 
     {
         StringBuilder st = new StringBuilder();
         List<DocumentoEntity> entidades = docDao.findAll();
         for (DocumentoEntity e : entidades) {
             st.append(e.toString()).append("\n");

         }
         return st.toString();
     }
     
}



