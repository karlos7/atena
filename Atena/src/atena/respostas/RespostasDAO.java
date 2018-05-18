/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.respostas;

import atena.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos
 */
public class RespostasDAO extends GenericDAO<Respostas>{
    
    public RespostasDAO() {
        super(Respostas.class);
    }

    public void salvar(Respostas respostas) {
        Object[] options = {"Sim", "Não"};
        if (respostas.getIdRespostas() == 0) {
            if (adicionar(respostas)) {
                JOptionPane.showMessageDialog(null, "Respostas cadastradas com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(respostas)) {
                JOptionPane.showMessageDialog(null, "Respostas editadas com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(Respostas respostas) {
        Object[] options = {"Sim", "Não"};
        if (respostas.getIdRespostas() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir as respostas"
                    + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(respostas)) {
                    JOptionPane.showMessageDialog(null, "Respostas excluídas com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir as respostas",
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
