/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.processoseletivo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Karlos
 */
@Entity
public class ProcessoSeletivo {
    
    @Id
    @GeneratedValue
    private int idProcessoSeletivo;
    @Column(length = 100, nullable = false)
    private String processoSeletivo;

    public int getIdProcessoSeletivo() {
        return idProcessoSeletivo;
    }

    public void setIdProcessoSeletivo(int idProcessoSeletivo) {
        this.idProcessoSeletivo = idProcessoSeletivo;
    }

    public String getProcessoSeletivo() {
        return processoSeletivo;
    }

    public void setProcessoSeletivo(String processoSeletivo) {
        this.processoSeletivo = processoSeletivo;
    }
        
}
