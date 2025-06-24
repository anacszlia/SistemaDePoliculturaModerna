class SistemaIrrigacao:
    def __init__(self, tipo_irrigacao):
        self.tipo_irrigacao = tipo_irrigacao
        self.ligado = False
        self.pressao_agua = 0.0

    def ligar_irrigacao(self):
        self.ligado = True
        self.pressao_agua = 2.5
        print(f"Sistema de irrigação {self.tipo_irrigacao} ligado.")

    def desligar_irrigacao(self):
        self.ligado = False
        self.pressao_agua = 0.0
        print(f"Sistema de irrigação {self.tipo_irrigacao} desligado.")

    def is_ligado(self):
        return self.ligado

    def get_pressao_agua(self):
        return self.pressao_agua

    def get_tipo_irrigacao(self):
        return self.tipo_irrigacao