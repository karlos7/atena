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
public class ProcessoSeletivoDAO extends GenericDAO<ProcessoSeletivo>{
    
    public ProcessoSeletivoDAO() {
        super(ProcessoSeletivo.class);
    }

    public void salvar(ProcessoSeletivo processoSeletivo) {
        Object[] options = {"Sim", "Não"};
        if (processoSeletivo.getIdProcessoSeletivo() == 0) {
            if (adicionar(processoSeletivo)) {
                JOptionPane.showMessageDialog(null, "Processo seletivo cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(processoSeletivo)) {
                JOptionPane.showMessageDialog(null, "Processo seletivo editado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(ProcessoSeletivo processoSeletivo) {
        Object[] options = {"Sim", "Não"};
        if (processoSeletivo.getIdProcessoSeletivo() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o processo seletivo" + processoSeletivo.getProcessoSeletivo()
                    + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(processoSeletivo)) {
                    JOptionPane.showMessageDialog(null, "Processo seletivo excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o processo seletivo" + processoSeletivo.getProcessoSeletivo(),
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "A exclusão foi cancelada!");
            }
        }
        return true;
    }
    
}
