#include "../include/SerVivo.h"
using namespace std;
SerVivo::SerVivo() {
}

SerVivo::SerVivo(const std::string& e) : especie(e) {
}

SerVivo::SerVivo(const std::string& nome, const std::string& especie, int idade, const std::string& estadoSaude)
    : nome(nome), especie(especie), idade(idade), estadoSaude(estadoSaude) {
}

void SerVivo::adicionarTratamento(const Tratamento& tratamento) {
    tratamentos.push_back(tratamento);
}