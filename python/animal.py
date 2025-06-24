from abc import abstractmethod
from ser_vivo import SerVivo

class Animal(SerVivo):
    total_animais = 0

    def __init__(self, raca=None, peso=None):
        super().__init__()
        self.raca = raca
        self.alimentacao = False
        self.hidratacao = False
        self.peso = peso
        self.producao_mensal = 0
        self.fazenda = None
        Animal.total_animais += 1

    def get_raca(self):
        return self.raca

    def set_raca(self, raca):
        self.raca = raca

    def alimenta(self):
        self.alimentacao = True

    def is_alimentado(self):
        return self.alimentacao

    def hidratar(self):
        self.hidratacao = True

    def is_hidratado(self):
        return self.hidratacao

    def get_producao_mensal(self):
        return self.producao_mensal

    def set_producao_mensal(self, producao_mensal):
        self.producao_mensal = producao_mensal

    def get_fazenda(self):
        return self.fazenda

    def mover_animal(self, fazenda):
        if self.fazenda is not None:
            self.fazenda.remover_animal(self)
        self.fazenda = fazenda
        fazenda.adicionar_animal(self)
        print(f"Animal movido para a fazenda {fazenda.get_nome()}")

    @abstractmethod
    def total_ferteis(self):
        pass

    def get_peso(self):
        return self.peso

    def set_peso(self, peso):
        self.peso = peso