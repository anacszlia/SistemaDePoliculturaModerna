#ifndef AVES_H
#define AVES_H

#include "Animal.h"

class Aves : public Animal {
public:
    Aves(const std::string& identificacao, int idade);
    
    int totalFerteis() override;
    void manejar() override;
};

#endif