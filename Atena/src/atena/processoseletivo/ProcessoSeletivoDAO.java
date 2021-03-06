/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.processoseletivo;

import atena.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos
 */
public class ProcessoSeletivoDAO extends GenericDAO<ProcessoSeletivo> {

    public ProcessoSeletivoDAO() {
        super(ProcessoSeletivo.class);
    }

    public void salvar(ProcessoSeletivo processoSeletivo) {
        Object[] options = {"Sim", "Não"};
        if (processoSeletivo.getIdProcessoSeletivo() == 0) {
            if (adicionar(processoSeletivo)) {
                JOptionPane.showMessageDialog(null, "Processo seletivo " + processoSeletivo.getProcessoSeletivo() + "\n"
                        + "de " + processoSeletivo.getChamada() + " cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(processoSeletivo)) {
                JOptionPane.showMessageDialog(null, "Processo seletivo " + processoSeletivo.getProcessoSeletivo() + "\n"
                        + "de " + processoSeletivo.getChamada() + " editado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

}
