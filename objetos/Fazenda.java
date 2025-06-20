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
public class Fazenda {
    private String nome;
    private String localizacao;
    private double tamanhoHectares;
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Planta> plantas = new ArrayList<>();
    private double energia=0;
    
    public void iniciarProducao() {
        System.out.println("Produção iniciada na fazenda " + nome + " localizada em " + localizacao);
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
    

    public void fazerManutencao() {
        System.out.println("Manutenção geral sendo realizada na fazenda " + nome);
    }

    public void emitirRelatorioGeral() {
        System.out.println("Relatório Geral da Fazenda:");
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanhoHectares + " hectares");
        System.out.println("Total de energia gerada "+ energia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTamanhoHectares() {
        return tamanhoHectares;
    }

    public void setTamanhoHectares(double tamanhoHectares) {
        this.tamanhoHectares = tamanhoHectares;
    }

    public int contaAnimais() {
        return animais.size();
    }
    public int contarAnimaisAlimentados() {
     int total = 0;
        for (Animal a : animais) {
            if (a.isAlimentado()) {
                total++;
            }
        }
    return total;
    }
    public int contarAnimaisHidratados() {
    int total = 0;
    for (Animal a : animais) {
        if (a.isHidratado()) {
            total++;
        }
    }
    return total;
}
    
   public int contarPlantasIrrigadas() {
    int total = 0;
    for (Planta p : plantas) {
        if (p.isHidratada()) {
            total++;
        }
    }
    return total;
}

    public int contaPlantas() {
        return plantas.size();
    }

    public void adicionarAnimal(Animal a) {
        if(!animais.contains(a)){
            animais.add(a);
        }
    }
    
    public void removerAnimal(Animal a) {
        animais.remove(a);
    }

    public void adicionarPlanta(Planta c) {
        plantas.add(c);
    }
}
