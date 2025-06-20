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
public class ControleBovinos {
     public static int contarVacasFerteis(ArrayList<GadoLeiteiro> listaVacas) {
        int total = 0;
        for (GadoLeiteiro vaca : listaVacas) {
            total += vaca.totalFerteis();
        }
        return total;
    }
    
    //pegar a media de litros de leite em idade fertil
    //tratar as vacas que dao menos leite
    //verificar as caracteristicas das vacas com mais leite
    
    
public static double calcularMediaLeite(ArrayList<GadoLeiteiro> vacas) {
        float totalLeite = 0;
        int totalFerteis = 0;

        for (GadoLeiteiro v : vacas) {
            if (v.totalFerteis() == 1) {
                totalLeite += v.getProducaoMensal();
                totalFerteis++;
            }
        }

        return totalFerteis == 0 ? 0 : totalLeite / totalFerteis;
    }

    public static void tratarVacasComPoucoLeite(ArrayList<GadoLeiteiro> vacas, float limiteMinimo) {
        for (GadoLeiteiro v : vacas) {
            if (v.getProducaoMensal() < limiteMinimo) {
                System.out.println("Tratando vaca " + v.identificacao + " com apenas " + v.getProducaoMensal() + " litros de leite.");
            }
        }
    }

    public static void caracteristicasDasVacasComMaisLeite(ArrayList<GadoLeiteiro> vacas) {
        float maiorProducao = 0;

        for (GadoLeiteiro v : vacas) {
            if (v.getProducaoMensal() > maiorProducao) {
                maiorProducao = v.getProducaoMensal();
            }
        }

        for (GadoLeiteiro v : vacas) {
            if (v.getProducaoMensal() == maiorProducao) {
                System.out.println("Vaca com mais leite:");
                System.out.println("- Identificação: " + v.identificacao);
                System.out.println("- Idade: " + v.idade);
                System.out.println("- Peso: " + v.getPeso());
                System.out.println("- Produção mensal: " + v.getProducaoMensal() + " litros.");
            }
        }
    }
    
}
