class EnergiaBiogas:
    def __init__(self):
        self.capacidade_kw = 0
        self.energia_gerada_dia = 0
        self.bateria_cheia = False

    def calcular_energia_gerada(self):
        self.energia_gerada_dia = self.capacidade_kw * 5.0
        print(f"Biogás gerado hoje: {self.energia_gerada_dia} kWh.")
        return self.energia_gerada_dia

    def verificar_bateria_cheia(self):
        self.bateria_cheia = self.energia_gerada_dia > 100
        print(f"Bateria cheia: {self.bateria_cheia}")
        return self.bateria_cheia

    def get_capacidade_kw(self):
        return self.capacidade_kw

    def set_capacidade_kw(self, capacidade_kw):
        self.capacidade_kw = capacidade_kw

    def get_energia_gerada_dia(self):
        return self.energia_gerada_dia

    def set_energia_gerada_dia(self, energia_gerada_dia):
        self.energia_gerada_dia = energia_gerada_dia

    def is_bateria_cheia(self):
        return self.bateria_cheia

    def set_bateria_cheia(self, bateria_cheia):
        self.bateria_cheia = bateria_cheia