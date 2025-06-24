#include "../include/Animal.h"
#include "../include/Fazenda.h"
#include <iostream>

int Animal::totalAnimais = 0;

Animal::Animal() {
    totalAnimais++;
}

Animal::Animal(const std::string& raca, float peso) : raca(raca), peso(peso) {
    totalAnimais++;
}

void Animal::moverAnimal(Fazenda* f) {
    if (fazenda != nullptr) {
        fazenda->removerAnimal(this);
    }
    fazenda = f;
    f->adicionarAnimal(this);
    std::cout << "Animal movido para a fazenda " << fazenda->getNome() << std::endl;
}