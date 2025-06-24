#ifndef ANIMAL_H
#define ANIMAL_H

#include "SerVivo.h"

class Fazenda;

class Animal : public SerVivo {
private:
    std::string raca;
    bool alimentacao = false;
    bool hidratacao = false;
    float peso;
    float producaoMensal;
    Fazenda* fazenda = nullptr;
    static int totalAnimais;

public:
    Animal();
    Animal(const std::string& raca, float peso);
    virtual ~Animal() = default;
    
    virtual int totalFerteis() = 0;
    
    void alimenta() { alimentacao = true; }
    bool isAlimentado() const { return alimentacao; }
    void hidratar() { hidratacao = true; }
    bool isHidratado() const { return hidratacao; }
    void moverAnimal(Fazenda* f);
    
    std::string getRaca() const { return raca; }
    void setRaca(const std::string& r) { raca = r; }
    float getPeso() const { return peso; }
    void setPeso(float p) { peso = p; }
    float getProducaoMensal() const { return producaoMensal; }
    void setProducaoMensal(float p) { producaoMensal = p; }
    Fazenda* getFazenda() const { return fazenda; }
    static int getTotalAnimais() { return totalAnimais; }
};

#endif