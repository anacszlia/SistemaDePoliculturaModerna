class Fazenda:
    def __init__(self):
        self.nome = None
        self.localizacao = None
        self.tamanho_hectares = 0
        self.animais = []
        self.plantas = []
        self.energia = 0

    def iniciar_producao(self):
        print(f"Produção iniciada na fazenda {self.nome} localizada em {self.localizacao}")

    def get_energia(self):
        return self.energia

    def set_energia(self, energia):
        self.energia = energia

    def fazer_manutencao(self):
        print(f"Manutenção geral sendo realizada na fazenda {self.nome}")

    def emitir_relatorio_geral(self):
        print("Relatório Geral da Fazenda:")
        print(f"Nome: {self.nome}")
        print(f"Localização: {self.localizacao}")
        print(f"Tamanho: {self.tamanho_hectares} hectares")
        print(f"Total de energia gerada {self.energia}")

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_localizacao(self):
        return self.localizacao

    def set_localizacao(self, localizacao):
        self.localizacao = localizacao

    def get_tamanho_hectares(self):
        return self.tamanho_hectares

    def set_tamanho_hectares(self, tamanho_hectares):
        self.tamanho_hectares = tamanho_hectares

    def conta_animais(self):
        return len(self.animais)

    def contar_animais_alimentados(self):
        return sum(1 for a in self.animais if a.is_alimentado())

    def contar_animais_hidratados(self):
        return sum(1 for a in self.animais if a.is_hidratado())

    def contar_plantas_irrigadas(self):
        return sum(1 for p in self.plantas if p.is_hidratada())

    def conta_plantas(self):
        return len(self.plantas)

    def adicionar_animal(self, animal):
        if animal not in self.animais:
            self.animais.append(animal)

    def remover_animal(self, animal):
        if animal in self.animais:
            self.animais.remove(animal)

    def adicionar_planta(self, planta):
        self.plantas.append(planta)