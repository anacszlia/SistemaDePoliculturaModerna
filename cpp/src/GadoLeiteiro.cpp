#include "../include/GadoLeiteiro.h"
#include <iostream>

GadoLeiteiro::GadoLeiteiro(const std::string& identificacao, int idade) {
    this->identificacao = identificacao;
    this->idade = idade;
}

int GadoLeiteiro::totalFerteis() {
    return (idade > 1 && idade < 10) ? 1 : 0;
}

void GadoLeiteiro::manejar() {
    std::cout << "Manejo específico das vacas." << std::endl;
    for (const auto& t : tratamentos) {
        std::cout << "- Data: " << t.getData() << ", Tipo: " << t.getTipo() 
                  << ", Produto: " << t.getProduto() << std::endl;
    }
    std::cout << std::endl;
}