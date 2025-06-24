#include "../include/Fazenda.h"
#include "../include/Aves.h"
#include "../include/GadoLeiteiro.h"
#include "../include/Tratamento.h"
#include <iostream>
using namespace std;
int main() {
    cout << "=== TESTE C++ - SISTEMA FAZENDA ===" << endl;
    
    // Criar fazenda
    Fazenda fazenda;
    fazenda.setNome("Fazenda C++");
    fazenda.setLocalizacao("Interior");
    fazenda.setTamanhoHectares(150.5);
    
    // Criar animais
    Aves galinha("G001", 2);
    galinha.setRaca("Rhode Island");
    galinha.setPeso(2.5f);
    galinha.setProducaoMensal(25.0f);
    galinha.alimenta();
    galinha.hidratar();
    
    GadoLeiteiro vaca("V001", 5);
    vaca.setRaca("Holandesa");
    vaca.setPeso(450.0f);
    vaca.setProducaoMensal(300.0f);
    vaca.alimenta();
    vaca.hidratar();
    
    // Adicionar tratamentos
    Tratamento tratGalinha("2025-01-15", "Vacina", "Anti-viral");
    galinha.adicionarTratamento(tratGalinha);
    
    Tratamento tratVaca("2025-01-10", "Vermífugo", "Ivermectina");
    vaca.adicionarTratamento(tratVaca);
    
    // Mover animais para fazenda
    galinha.moverAnimal(&fazenda);
    vaca.moverAnimal(&fazenda);
    
    // Testar funcionalidades
    fazenda.emitirRelatorioGeral();
    cout << "Total de animais: " << fazenda.contaAnimais() << endl;
    cout << "Animais alimentados: " << fazenda.contarAnimaisAlimentados() << endl;
    cout << "Animais hidratados: " << fazenda.contarAnimaisHidratados() << endl;
    
    // Testar manejo
    galinha.manejar();
    vaca.manejar();
    
    cout << "Galinha fértil: " << galinha.totalFerteis() << endl;
    cout << "Vaca fértil: " << vaca.totalFerteis() << endl;
    
    return 0;
}