from abc import abstractmethod
from ser_vivo import SerVivo

class Planta(SerVivo):
    def __init__(self):
        super().__init__()
        self.tipo_solo = None
        self.ciclo_vida = None
        self.si = None
        self.adubacao = False

    def manejar(self):
        print(f"Realizando manejo geral de planta: {self.nome}")
        for t in self.tratamentos:
            print(f"- Data: {t.get_data()}, Tipo: {t.get_tipo()}, Produto: {t.get_produto()}")
        print()

    def verifica_reprodutividade(self):
        if self.ciclo_vida == "adulto":
            print(f"Planta {self.nome} está em fase reprodutiva.")
        else:
            print(f"Planta {self.nome} não está em fase reprodutiva.")

    def get_tipo_solo(self):
        return self.tipo_solo

    def set_tipo_solo(self, tipo_solo):
        self.tipo_solo = tipo_solo

    def get_ciclo_vida(self):
        return self.ciclo_vida

    def set_ciclo_vida(self, ciclo_vida):
        self.ciclo_vida = ciclo_vida

    def adubar(self):
        self.adubacao = True

    def is_hidratada(self):
        return self.si.is_ligado() if self.si else False

    def is_adubado(self):
        return self.adubacao