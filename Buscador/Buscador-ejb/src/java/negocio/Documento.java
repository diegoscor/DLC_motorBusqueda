/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import beans.DocumentoBean;
import entities.DocumentoEntity;

/**
 *
 * @author cami
 */
public class Documento 
{
    DocumentoEntity entidad;

    public Documento(DocumentoEntity entidad) {
        this.entidad = entidad;
    }

    public Documento()
    {
        this.entidad= new DocumentoEntity();
    }
    
    public Documento(DocumentoBean documento)
    {
        this();
        if(documento.getId()!=0)
        {
            this.entidad.setIddocumento(documento.getId());
        }
        this.entidad.setNombreDocumento(documento.getNombreDocumento());
        
    }
    public int getId(){
        return this.entidad.getIddocumento();
    }
    public String getNombreDocumento(){
        return this.entidad.getNombreDocumento();
    }
    public String getUrl()
    {
        return this.entidad.getUrl();
    }
    public void setId(int id){
        this.entidad.setIddocumento(id);
    }
    public void setNombreDocumento(String nombre){
        this.entidad.setNombreDocumento(nombre);
    }    
    public void setUrl(String url)
    {
        this.entidad.setUrl(url);
    }
    
     public DocumentoBean getBean() {
        DocumentoBean resp=new DocumentoBean();
        resp.setId(getId());
        resp.setNombreDocumento(getNombreDocumento());
        resp.setUrl(getUrl());
        return resp;
    }
    
}
