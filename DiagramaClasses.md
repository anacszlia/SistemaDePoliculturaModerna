# Diagrama de Classes - Sistema de Fazenda

## Hierarquia de Classes e Relacionamentos

```mermaid
classDiagram
    %% Classes Abstratas
    class SerVivo {
        <<abstract>>
        #String nome
        #String especie
        #int idade
        #String estadoSaude
        #String identificacao
        #List~Tratamento~ tratamentos
        +manejar()* abstract
        +adicionarTratamento(Tratamento)
        +getters/setters()
    }

    class Animal {
        <<abstract>>
        -String raca
        -boolean alimentacao
        -boolean hidratacao
        -float peso
        -float producaoMensal
        -Fazenda fazenda
        -static int totalAnimais
        +alimenta()
        +hidratar()
        +moverAnimal(Fazenda)
        +totalFerteis()* abstract
        +getters/setters()
    }

    %% Classes Concretas - Animais
    class Aves {
        +Aves(String, int)
        +totalFerteis() int
        +manejar()
        +contarAvesFerteis(ArrayList~Aves~) int
        +calcularMediaOvos(ArrayList~Aves~) double
        +tratarGalinhasComPoucosOvos(ArrayList~Aves~, int)
        +aveComMaisOvos(ArrayList~Aves~) Aves
    }

    class GadoLeiteiro {
        +GadoLeiteiro(String, int)
        +totalFerteis() int
        +manejar()
        +contarVacasFerteis(ArrayList~GadoLeiteiro~) int
        +calcularMediaLeite(ArrayList~GadoLeiteiro~) double
        +tratarVacasComPoucoLeite(ArrayList~GadoLeiteiro~, float)
        +caracteristicasDasVacasComMaisLeite(ArrayList~GadoLeiteiro~)
    }

    %% Classes Concretas - Plantas
    class Planta {
        -String tipoSolo
        -String cicloVida
        +manejar()
        +verificaReprodutividade()
        +getters/setters()
    }

    class Gramineas {
        +Gramineas(String, int)
        +manejar()
    }

    %% Classe Principal
    class Fazenda {
        -String nome
        -String localizacao
        -double tamanhoHectares
        -ArrayList~Animal~ animais
        -ArrayList~Planta~ plantas
        +iniciarProducao()
        +fazerManutencao()
        +emitirRelatorioGeral()
        +adicionarAnimal(Animal)
        +adicionarPlanta(Planta)
        +contaAnimais() int
        +contaPlantas() int
        +getters/setters()
    }

    %% Classes de Apoio
    class Tratamento {
        -String data
        -String tipo
        -String produto
        +Tratamento(String, String, String)
        +getters/setters()
    }

    class MaquinaAgricola {
        -String tipo
        -String modelo
        -boolean ligada
        -double combustivel
        +ligar()
        +desligar()
        +operar()
        +getters/setters()
    }

    class SistemaIrrigacao {
        -boolean ligado
        -double pressaoAgua
        -String tipoIrrigacao
        +ligarIrrigacao()
        +desligarIrrigacao()
        +getters/setters()
    }

    %% Classes de Energia
    class EnergiaSolar {
        -double capacidadeKw
        -double energiaGeradaDia
        -boolean bateriaCheia
        +calcularEnergiaGerada() double
        +verificarBateriaCheia() boolean
        +getters/setters()
    }

    class EnergiaBiogas {
        -double capacidadeKw
        -double energiaGeradaDia
        -boolean bateriaCheia
        +calcularEnergiaGerada() double
        +verificarBateriaCheia() boolean
        +getters/setters()
    }

    %% Relacionamentos de Herança
    SerVivo <|-- Animal
    SerVivo <|-- Planta
    Animal <|-- Aves
    Animal <|-- GadoLeiteiro
    Planta <|-- Gramineas

    %% Relacionamentos de Composição/Agregação
    Fazenda *-- Animal : contém
    Fazenda *-- Planta : contém
    Animal --> Fazenda : pertence a
    SerVivo *-- Tratamento : possui
```

## Os 4 Pilares da Orientação a Objetos

### 1. **ENCAPSULAMENTO** 🔒
- **Atributos privados** com acesso controlado via getters/setters
- **Exemplos:**
  - `Animal`: atributos privados (`raca`, `peso`, `producaoMensal`)
  - `Fazenda`: listas privadas de animais e plantas
  - `MaquinaAgricola`: estado interno protegido (`ligada`, `combustivel`)

### 2. **HERANÇA** 🌳
- **Hierarquia bem definida:**
  ```
  SerVivo (abstract)
  ├── Animal (abstract)
  │   ├── Aves
  │   └── GadoLeiteiro
  └── Planta
      └── Gramineas
  ```
- **Reutilização de código** através da herança de atributos e métodos

### 3. **POLIMORFISMO** 🎭
- **Métodos abstratos** implementados diferentemente:
  - `manejar()`: cada classe tem sua implementação específica
  - `totalFerteis()`: lógica diferente para Aves e GadoLeiteiro
- **Sobrescrita de métodos** para comportamentos específicos

### 4. **ABSTRAÇÃO** 🎯
- **Classes abstratas:**
  - `SerVivo`: define estrutura comum para todos os seres vivos
  - `Animal`: especializa SerVivo para animais
- **Métodos abstratos** que devem ser implementados pelas subclasses
- **Interface comum** para diferentes tipos de objetos

## Relacionamentos Entre Classes

### **Composição** (tem-um forte)
- `Fazenda` **contém** `Animal` e `Planta`
- `SerVivo` **possui** `Tratamento`

### **Agregação** (tem-um fraco)
- `Animal` **pertence a** `Fazenda`

### **Herança** (é-um)
- `Aves` **é um** `Animal`
- `GadoLeiteiro` **é um** `Animal`
- `Gramineas` **é uma** `Planta`
- `Animal` **é um** `SerVivo`
- `Planta` **é um** `SerVivo`

### **Dependência** (usa)
- Classes utilizam `ArrayList` para coleções
- Métodos recebem objetos como parâmetros

## Funcionalidades Principais

### **Gestão de Animais**
- Controle de fertilidade e produção
- Manejo específico por tipo
- Análise de produtividade

### **Gestão de Plantas**
- Verificação de reprodutividade
- Manejo especializado

### **Infraestrutura**
- Sistemas de irrigação
- Máquinas agrícolas
- Geração de energia (solar/biogás)

### **Administração**
- Relatórios gerais
- Controle de tratamentos
- Gestão da fazenda
