/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.respostas;

import atena.processoseletivo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos
 */
public class RespostasTableModel extends AbstractTableModel{
    
    private List<Respostas> respostas = new ArrayList<>();
    private String[] colunas = {"Código", "Processo Seletivo"};

    public RespostasTableModel(List<Respostas> resposta) {
        this.respostas = resposta;
    }

    @Override
    public int getRowCount() {
        return respostas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Respostas resposta = respostas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return resposta.getIdRespostas();
            case 1:
                return resposta.getProcessoSeletivo().getProcessoSeletivo();

        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
        }
        return null;
    }
    
}
