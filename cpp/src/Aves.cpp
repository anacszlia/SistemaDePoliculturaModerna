#include "../include/Aves.h"
#include <iostream>

Aves::Aves(const std::string& identificacao, int idade) {
    this->identificacao = identificacao;
    this->idade = idade;
}

int Aves::totalFerteis() {
    return (idade > 1 && idade < 3) ? 1 : 0;
}

void Aves::manejar() {
    std::cout << "Manejo específico das aves." << std::endl;
    for (const auto& t : tratamentos) {
        std::cout << "- Data: " << t.getData() << ", Tipo: " << t.getTipo() 
                  << ", Produto: " << t.getProduto() << std::endl;
    }
    std::cout << std::endl;
}