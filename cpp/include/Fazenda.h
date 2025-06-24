#ifndef FAZENDA_H
#define FAZENDA_H

#include <string>
#include <vector>
#include <algorithm>

class Animal;
class Planta;

class Fazenda {
private:
    std::string nome;
    std::string localizacao;
    double tamanhoHectares;
    std::vector<Animal*> animais;
    std::vector<Planta*> plantas;
    double energia = 0;

public:
    void iniciarProducao();
    void fazerManutencao();
    void emitirRelatorioGeral();
    void adicionarAnimal(Animal* a);
    void removerAnimal(Animal* a);
    void adicionarPlanta(Planta* p);
    
    int contaAnimais() const { return animais.size(); }
    int contaPlantas() const { return plantas.size(); }
    int contarAnimaisAlimentados() const;
    int contarAnimaisHidratados() const;
    int contarPlantasIrrigadas() const;
    
    std::string getNome() const { return nome; }
    void setNome(const std::string& n) { nome = n; }
    std::string getLocalizacao() const { return localizacao; }
    void setLocalizacao(const std::string& l) { localizacao = l; }
    double getTamanhoHectares() const { return tamanhoHectares; }
    void setTamanhoHectares(double t) { tamanhoHectares = t; }
    double getEnergia() const { return energia; }
    void setEnergia(double e) { energia = e; }
};

#endif