/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author anacs
 */
public class ControleAves {
     
    
    //pegar a media de ovos por galinha em idade fertil
    //tratar as galinhas com menos ovos
    //qual a galinha que poe mais ovos
    public static int contarAvesFerteis(ArrayList<Aves> galinhas) {
        int total = 0;
        for (Aves g : galinhas) {
            total += g.totalFerteis();
        }
        return total;
    }

    public static double calcularMediaOvos(ArrayList<Aves> galinhas) {
        int totalOvos = 0;
        for (Aves g : galinhas) {
            totalOvos += g.getProducaoMensal();
        }
        return galinhas.isEmpty() ? 0 : (double) totalOvos / galinhas.size();
    }

    public static void tratarGalinhasComPoucosOvos(ArrayList<Aves> galinhas, int limiteMinimo) {
        for (Aves g : galinhas) {
            if (g.getProducaoMensal() < limiteMinimo) {
                System.out.println("Tratando galinha " + g.getIdentificacao() + " com apenas " + g.getProducaoMensal() + " ovos.");
            }
        }
    }

    public static Aves aveComMaisOvos(ArrayList<Aves> galinhas) {
        if (galinhas.isEmpty()) {
            return null;
        }
        Aves maior = galinhas.get(0);
        for (Aves g : galinhas) {
            if (g.getProducaoMensal() > maior.getProducaoMensal()) {
                maior = g;
            }
        }
        return maior;
    }
}
