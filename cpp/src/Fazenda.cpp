#include "../include/Fazenda.h"
#include "../include/Animal.h"
#include <iostream>

void Fazenda::iniciarProducao() {
    std::cout << "Produção iniciada na fazenda " << nome << " localizada em " << localizacao << std::endl;
}

void Fazenda::fazerManutencao() {
    std::cout << "Manutenção geral sendo realizada na fazenda " << nome << std::endl;
}

void Fazenda::emitirRelatorioGeral() {
    std::cout << "Relatório Geral da Fazenda:" << std::endl;
    std::cout << "Nome: " << nome << std::endl;
    std::cout << "Localização: " << localizacao << std::endl;
    std::cout << "Tamanho: " << tamanhoHectares << " hectares" << std::endl;
    std::cout << "Total de energia gerada " << energia << std::endl;
}

void Fazenda::adicionarAnimal(Animal* a) {
    if (std::find(animais.begin(), animais.end(), a) == animais.end()) {
        animais.push_back(a);
    }
}

void Fazenda::removerAnimal(Animal* a) {
    animais.erase(std::remove(animais.begin(), animais.end(), a), animais.end());
}

void Fazenda::adicionarPlanta(Planta* p) {
    plantas.push_back(p);
}

int Fazenda::contarAnimaisAlimentados() const {
    int total = 0;
    for (const auto& a : animais) {
        if (a->isAlimentado()) {
            total++;
        }
    }
    return total;
}

int Fazenda::contarAnimaisHidratados() const {
    int total = 0;
    for (const auto& a : animais) {
        if (a->isHidratado()) {
            total++;
        }
    }
    return total;
}