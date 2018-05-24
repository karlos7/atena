/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.gabarito;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karlos
 */
public class GabaritoTableModel extends AbstractTableModel{
    
    private List<Gabarito> gabarito = new ArrayList<>();
    private String[] colunas = {"Código", "Processo Seletivo", "Chamada"};

    public GabaritoTableModel(List<Gabarito> gabarito) {
        this.gabarito = gabarito;
    }

    @Override
    public int getRowCount() {
        return gabarito.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Gabarito gabaritos = gabarito.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return gabaritos.getIdGabarito();
            case 1:
                return gabaritos.getProcessoSeletivo().getProcessoSeletivo();
            case 2:
                return gabaritos.getChamada();

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
            case 2:
                return colunas[2];
        }
        return null;
    }
    
}
