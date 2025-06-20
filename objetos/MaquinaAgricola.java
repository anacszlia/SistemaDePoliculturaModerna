/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author anacs
 */
public class MaquinaAgricola {
    private String tipo;
    private String modelo;
    private boolean ligada;
    private double combustivel;
    
    public MaquinaAgricola(String tipo, String modelo) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.ligada = false;
        this.combustivel = 100.0;
    }
    
    public void ligar() {
        if (combustivel > 0) {
            ligada = true;
            System.out.println("Máquina " + tipo + " ligada.");
        } else {
            System.out.println("Sem combustível para ligar a máquina.");
        }
    }
    
    public void desligar() {
        ligada = false;
        System.out.println("Máquina " + tipo + " desligada.");
    }
    
    public void operar() {
        if (ligada && combustivel > 0) {
            combustivel -= 10;
            System.out.println("Operando " + tipo + ". Combustível restante: " + combustivel + "%");
        } else {
            System.out.println("Máquina não pode operar.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
}