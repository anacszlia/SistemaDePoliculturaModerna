/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author anacs
 */
public abstract class Animal extends SerVivo {
    private String raca;
    private boolean alimentacao=false;
    private boolean hidratacao=false;
    private float peso;
    private float producaoMensal;
    private Fazenda fazenda;
    static int totalAnimais=0;

    public Animal(String raca, float peso){
        this.raca = raca;
        this.peso = peso;
        totalAnimais++;
    }
    
    public Animal(){
        totalAnimais++;
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void alimenta() {
        alimentacao=true;
    }
    public boolean isAlimentado() {
       return alimentacao;
   }


    public void hidratar() {
        hidratacao = true;
    }
    public boolean isHidratado() {
        return hidratacao;
    }


    public float getProducaoMensal() {
        return producaoMensal;
    }

    public void setProducaoMensal(float producaoMensal) {
        this.producaoMensal = producaoMensal;
    }
    
    public Fazenda getFazenda(){
        return fazenda;
    }
    //o set de fazenda
    public void moverAnimal(Fazenda f){
        if(fazenda != null){
            fazenda.removerAnimal(this);
        }
        fazenda=f;
        f.adicionarAnimal(this);
        System.out.println("Animal movido para a fazenda "+ fazenda.getNome()+ "\n");  
    }
    
    
    //achar a media de produtividade
    public abstract int totalFerteis();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   
    
    
}
