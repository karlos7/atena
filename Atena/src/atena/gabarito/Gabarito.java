/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.gabarito;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Karlos
 */
@Entity
public class Gabarito {
    
    @Id
    @GeneratedValue
    private int idGabarito;
    private String processoSeletivo;
    private List<String> gabarito;

    public int getIdGabarito() {
        return idGabarito;
    }

    public void setIdGabarito(int idGabarito) {
        this.idGabarito = idGabarito;
    }

    public String getProcessoSeletivo() {
        return processoSeletivo;
    }

    public void setProcessoSeletivo(String processoSeletivo) {
        this.processoSeletivo = processoSeletivo;
    }
    
    public List<String> getGabarito() {
        return gabarito;
    }

    public void setGabarito(List<String> gabarito) {
        this.gabarito = gabarito;
    }
    
}
