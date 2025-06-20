/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.List;
import objetos.Tratamento;

/**
 *
 * @author anacs
 */
public abstract class Planta extends SerVivo {
    private String tipoSolo;
    private String cicloVida;
    private SistemaIrrigacao si;
    private boolean adubacao=false;


    
    @Override
    public void manejar() {
        System.out.println("Realizando manejo geral de planta: " + nome );
         for (Tratamento t : tratamentos) {
            System.out.println("- Data: " + t.getData() + ", Tipo: " + t.getTipo() + ", Produto: " + t.getProduto());
        }
        System.out.println();
    }
    
    public void verificaReprodutividade(){
        if("adulto".equals(cicloVida)){
            System.out.println("Planta " + nome + " está em fase reprodutiva.");
        } else {
            System.out.println("Planta " + nome + " não está em fase reprodutiva.");
        }
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public String getCicloVida() {
        return cicloVida;
    }

    public void setCicloVida(String cicloVida) {
        this.cicloVida = cicloVida;
    }
    
    public void adubar(){
        adubacao=true;
    }
    public boolean isHidratada() {
        return si.isLigado();
    }
    public boolean isAdubado() {
        return adubacao;
    }

}
