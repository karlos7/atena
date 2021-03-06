/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.gabarito;

import atena.curso.*;
import atena.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos
 */
public class GabaritoDAO extends GenericDAO<Gabarito> {

    public GabaritoDAO() {
        super(Gabarito.class);
    }

    public void salvar(Gabarito gabarito) {
        Object[] options = {"Sim", "Não"};
        if (gabarito.getIdGabarito() == 0) {
            if (adicionar(gabarito)) {
                JOptionPane.showMessageDialog(null, "Gabarito " + gabarito.getProcessoSeletivo().getProcessoSeletivo() + " da " + gabarito.getProcessoSeletivo().getChamada() + " cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(gabarito)) {
                JOptionPane.showMessageDialog(null, "Gabarito " + gabarito.getProcessoSeletivo().getProcessoSeletivo() + " editado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }


}
