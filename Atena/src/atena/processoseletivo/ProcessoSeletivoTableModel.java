/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.processoseletivo;

import atena.curso.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos
 */
public class ProcessoSeletivoTableModel extends AbstractTableModel{
    
    private List<ProcessoSeletivo> processoSeletivos = new ArrayList<>();
    private String[] colunas = {"Código", "Curso"};

    public ProcessoSeletivoTableModel(List<ProcessoSeletivo> processoSeletivo) {
        this.processoSeletivos = processoSeletivo;
    }

    @Override
    public int getRowCount() {
        return processoSeletivos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProcessoSeletivo processoSeletivo = processoSeletivos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return processoSeletivo.getIdProcessoSeletivo();
            case 1:
                return processoSeletivo.getProcessoSeletivo();

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
