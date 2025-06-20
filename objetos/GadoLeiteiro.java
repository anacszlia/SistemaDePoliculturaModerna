/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;
/**
 *
 * @author anacs
 */
public class GadoLeiteiro extends Animal{
    
    public GadoLeiteiro(String identificacao, int idade) {
        super();
        this.identificacao = identificacao;
        this.idade = idade;
    }

    @Override
    public int totalFerteis() {
        if (idade > 1 && idade < 10) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void manejar() {
        System.out.println("Manejo específico das vacas.\n");
        for (Tratamento t : tratamentos) {
            System.out.println("- Data: " + t.getData() + ", Tipo: " + t.getTipo() + ", Produto: " + t.getProduto());
        }
        System.out.println();
    }
    
    
   
    //modificar os metodos manejar
}
