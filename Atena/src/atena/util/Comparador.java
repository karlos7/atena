/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.util;

import atena.respostas.Respostas;
import java.util.Comparator;

/**
 *
 * @author Karlos
 */
public class Comparador implements Comparator<Respostas>{

    public static final int POR_TOTAL_PONTOS = 1;
    public static final int POR_REDACAO = 2;
    int tipoComparacao;

    public Comparador(int tipoComparacao) {
        this.tipoComparacao = tipoComparacao;
    }

    @Override
    public int compare(Respostas objeto1, Respostas objeto2) {
        int retorno = 0;
        switch (this.tipoComparacao) {
            case POR_TOTAL_PONTOS:
                retorno = objeto1.getTotalPontos().compareTo(objeto2.getTotalPontos());
                break;
            case POR_REDACAO:
                retorno = objeto1.getNotaRedacao().compareTo(objeto2.getNotaRedacao());
                break;
            default:
                throw new RuntimeException("opcao inválida");
        }
        return retorno;
    }

}
