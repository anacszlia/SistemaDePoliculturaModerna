/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anacs
 */
public class Aves extends Animal{
    
    
   // private List<Tratamento> tratamento=new ArrayList<>();
    
    public Aves(String identificacao, int idade) {
        super();
        this.identificacao = identificacao;
        this.idade = idade;
    }

    @Override
    public int totalFerteis() {
        if (idade > 1 && idade < 3) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void manejar() {
        System.out.println("Manejo específico das aves.\n");
        for (Tratamento t : tratamentos) {
            System.out.println("- Data: " + t.getData() + ", Tipo: " + t.getTipo() + ", Produto: " + t.getProduto());
        }
        System.out.println();
        
    }
    
    
   

}
