/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author anacs
 */
public class SistemaIrrigacao {
    
    private boolean ligado;
    private double pressaoAgua;
    private String tipoIrrigacao;
    
    public SistemaIrrigacao(String tipoIrrigacao) {
        this.tipoIrrigacao = tipoIrrigacao;
        this.ligado = false;
        this.pressaoAgua = 0.0;
    }

    public void ligarIrrigacao() {
        ligado = true;
        pressaoAgua = 2.5;
        System.out.println("Sistema de irrigação " + tipoIrrigacao + " ligado.");
    }

    public void desligarIrrigacao() {
        ligado = false;
        pressaoAgua = 0.0;
        System.out.println("Sistema de irrigação " + tipoIrrigacao + " desligado.");
    }
    
    public boolean isLigado() {
        return ligado;
    }
    
    public double getPressaoAgua() {
        return pressaoAgua;
    }
    
    public String getTipoIrrigacao() {
        return tipoIrrigacao;
    }
    
}
