/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.respostas;

import atena.processoseletivo.ProcessoSeletivo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Karlos
 */
@Entity
public class Respostas {
    
    @Id
    @GeneratedValue
    private int idRespostas;
    private ProcessoSeletivo processoSeletivo;
    private List<String> gabarito;

    public int getIdRespostas() {
        return idRespostas;
    }

    public void setIdRespostas(int idRespostas) {
        this.idRespostas = idRespostas;
    }

    public ProcessoSeletivo getProcessoSeletivo() {
        return processoSeletivo;
    }

    public void setProcessoSeletivo(ProcessoSeletivo processoSeletivo) {
        this.processoSeletivo = processoSeletivo;
    }
    
    public List<String> getGabarito() {
        return gabarito;
    }

    public void setGabarito(List<String> gabarito) {
        this.gabarito = gabarito;
    }
    
}
