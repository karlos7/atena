/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.processoseletivo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos
 */
public class ProcessoSeletivoTableModel extends AbstractTableModel{
    
    private List<ProcessoSeletivo> processoSeletivos = new ArrayList<>();
    private String[] colunas = {"Código", "Processo Seletivo"};

    public ProcessoSeletivoTableModel(List<ProcessoSeletivo> processoSeletivos) {
        this.processoSeletivos = processoSeletivos;
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
        ProcessoSeletivo rocessoSeletivo = processoSeletivos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rocessoSeletivo.getIdProcessoSeletivo();
            case 1:
                return rocessoSeletivo.getProcessoSeletivo();

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
