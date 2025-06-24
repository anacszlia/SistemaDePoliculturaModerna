#ifndef GADOLEITEIRO_H
#define GADOLEITEIRO_H

#include "Animal.h"

class GadoLeiteiro : public Animal {
public:
    GadoLeiteiro(const std::string& identificacao, int idade);
    
    int totalFerteis() override;
    void manejar() override;
};

#endif