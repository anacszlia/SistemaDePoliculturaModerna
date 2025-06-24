from abc import ABC, abstractmethod

class SerVivo(ABC):
    def __init__(self, especie=None, nome=None, idade=None, estado_saude=None):
        self.nome = nome
        self.especie = especie
        self.idade = idade
        self.estado_saude = estado_saude
        self.identificacao = None
        self.tratamentos = []

    def adicionar_tratamento(self, tratamento):
        self.tratamentos.append(tratamento)

    @abstractmethod
    def manejar(self):
        pass

    def get_identificacao(self):
        return self.identificacao

    def set_identificacao(self, identificacao):
        self.identificacao = identificacao

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_especie(self):
        return self.especie

    def set_especie(self, especie):
        self.especie = especie

    def get_idade(self):
        return self.idade

    def set_idade(self, idade):
        self.idade = idade

    def get_estado_saude(self):
        return self.estado_saude

    def set_estado_saude(self, estado_saude):
        self.estado_saude = estado_saude

    def get_tratamentos(self):
        return self.tratamentos

    def set_tratamentos(self, tratamentos):
        self.tratamentos = tratamentos