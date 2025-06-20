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
public abstract class SerVivo {
    protected String nome;
    protected String especie;
    protected int idade;
    protected String estadoSaude;
    String identificacao;
    protected List<Tratamento> tratamentos;

    
    //construtores
    public SerVivo(String e){
        especie=e;
    }
    
    public SerVivo(){
        this.tratamentos = new ArrayList<>();
    }
    public SerVivo(String nome, String especie, int idade, String estadoSaude) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.estadoSaude = estadoSaude;
        this.tratamentos = new ArrayList<>();
    }
    public SerVivo(String nome, int idade, String estadoSaude) {
        this.nome = nome;
        this.idade = idade;
        this.estadoSaude = estadoSaude;
        this.tratamentos = new ArrayList<>();
    }

    public void adicionarTratamento(Tratamento tratamento) {
        tratamentos.add(tratamento);
    }

    //metodo abstrato que estará contido em todos os filhos
    public abstract void manejar();

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }
    
}
