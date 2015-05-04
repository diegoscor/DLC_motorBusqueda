/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cami
 */
@Entity
@Table(name = "documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoEntity.findAll", query = "SELECT d FROM DocumentoEntity d"),
    @NamedQuery(name = "DocumentoEntity.findByIddocumento", query = "SELECT d FROM DocumentoEntity d WHERE d.iddocumento = :iddocumento"),
    @NamedQuery(name = "DocumentoEntity.findByNombreDocumento", query = "SELECT d FROM DocumentoEntity d WHERE d.nombreDocumento = :nombreDocumento"),
    @NamedQuery(name = "DocumentoEntity.findByUrl", query = "SELECT d FROM DocumentoEntity d WHERE d.url = :url"),
    @NamedQuery(name = "DocumentoEntity.findByEliminado", query = "SELECT d FROM DocumentoEntity d WHERE d.eliminado = :eliminado")})
public class DocumentoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddocumento")
    private Integer iddocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombreDocumento")
    private String nombreDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "eliminado")
    private String eliminado;

    public DocumentoEntity() {
    }

    public DocumentoEntity(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public DocumentoEntity(Integer iddocumento, String nombreDocumento, String url, String eliminado) {
        this.iddocumento = iddocumento;
        this.nombreDocumento = nombreDocumento;
        this.url = url;
        this.eliminado = eliminado;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddocumento != null ? iddocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoEntity)) {
            return false;
        }
        DocumentoEntity other = (DocumentoEntity) object;
        if ((this.iddocumento == null && other.iddocumento != null) || (this.iddocumento != null && !this.iddocumento.equals(other.iddocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DocumentoEntity[ iddocumento=" + iddocumento + " ]";
    }
    
}
