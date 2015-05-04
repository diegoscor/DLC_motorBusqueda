/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author cami
 */
public class DocumentoBean implements Serializable{
    private static final long serialVersionUID = 1L;
    int id;
    String nombreDocumento;
    String url;

    public DocumentoBean(int id, String nombreDocumento, String url) {
        this.id = id;
        this.nombreDocumento = nombreDocumento;
        this.url = url;
    }

    public DocumentoBean() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public void setUrl(String url) {
        this.url = url;
    }

   
    public int getId() {
        return id;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "DocumentoBean{" + "id=" + id + ", nombreDocumento=" + nombreDocumento + ", url=" + url + '}';
    }
    
    
    
    
    
}
