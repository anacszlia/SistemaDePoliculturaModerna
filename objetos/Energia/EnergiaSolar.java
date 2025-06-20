/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.Energia;

/**
 *
 * @author anacs
 */
public class EnergiaSolar {
    private double capacidadeKw;
    private double energiaGeradaDia;
    private boolean bateriaCheia;

    public double calcularEnergiaGerada() {
        energiaGeradaDia = capacidadeKw * 3.0;
        System.out.println("Energia solar gerada hoje: " + energiaGeradaDia + " kWh.");
        return energiaGeradaDia;
    }

    public boolean verificarBateriaCheia() {
        bateriaCheia = energiaGeradaDia > 100;
        System.out.println("Bateria cheia: " + bateriaCheia);
        return bateriaCheia;
    }

    public double getCapacidadeKw() {
        return capacidadeKw;
    }

    public void setCapacidadeKw(double capacidadeKw) {
        this.capacidadeKw = capacidadeKw;
    }

    public double getEnergiaGeradaDia() {
        return energiaGeradaDia;
    }

    public void setEnergiaGeradaDia(double energiaGeradaDia) {
        this.energiaGeradaDia = energiaGeradaDia;
    }

    public boolean isBateriaCheia() {
        return bateriaCheia;
    }

    public void setBateriaCheia(boolean bateriaCheia) {
        this.bateriaCheia = bateriaCheia;
    }
    
}