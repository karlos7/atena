/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.curso;

import atena.usuario.Usuario;
import atena.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos
 */
public class CursoDAO extends GenericDAO<Curso>{
    
    public CursoDAO() {
        super(Curso.class);
    }

    public void salvar(Curso curso) {
        Object[] options = {"Sim", "Não"};
        if (curso.getIdCurso() == 0) {
            if (adicionar(curso)) {
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(curso)) {
                JOptionPane.showMessageDialog(null, "Curso editado com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public boolean excluir(Curso curso) {
        Object[] options = {"Sim", "Não"};
        if (curso.getIdCurso() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Curso" + curso.getNomeCurso()
                    + "?", "Atena", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
                if (remover(curso)) {
                    JOptionPane.showMessageDialog(null, "Curso excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Curso" + curso.getNomeCurso(),
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
