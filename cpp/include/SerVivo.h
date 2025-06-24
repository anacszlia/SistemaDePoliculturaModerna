#ifndef SERVIVO_H
#define SERVIVO_H

#include <string>
#include <vector>
#include "Tratamento.h"

using namespace std;
class SerVivo {
protected:
    string nome;
    string especie;
    int idade;
    string estadoSaude;
    string identificacao;
    vector<Tratamento> tratamentos;

public:
    SerVivo();
    SerVivo(const string& e);
    SerVivo(const string& nome, const string& especie, int idade, const string& estadoSaude);
    virtual ~SerVivo() = default;
    
    void adicionarTratamento(const Tratamento& tratamento);
    virtual void manejar() = 0;
    
    string getIdentificacao() const { return identificacao; }
    void setIdentificacao(const std::string& id) { identificacao = id; }
    string getNome() const { return nome; }
    void setNome(const std::string& n) { nome = n; }
    string getEspecie() const { return especie; }
    void setEspecie(const string& e) { especie = e; }
    int getIdade() const { return idade; }
    void setIdade(int i) { idade = i; }
    string getEstadoSaude() const { return estadoSaude; }
    void setEstadoSaude(const string& estado) { estadoSaude = estado; }
    vector<Tratamento> getTratamentos() const { return tratamentos; }
};

#endif