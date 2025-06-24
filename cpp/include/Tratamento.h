#ifndef TRATAMENTO_H
#define TRATAMENTO_H

#include <string>

class Tratamento {
private:
    std::string data;
    std::string tipo;
    std::string produto;

public:
    Tratamento(const std::string& data, const std::string& tipo, const std::string& produto);
    
    std::string getData() const { return data; }
    void setData(const std::string& d) { data = d; }
    std::string getTipo() const { return tipo; }
    void setTipo(const std::string& t) { tipo = t; }
    std::string getProduto() const { return produto; }
    void setProduto(const std::string& p) { produto = p; }
};

#endif