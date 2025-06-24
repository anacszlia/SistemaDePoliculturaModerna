class MaquinaAgricola:
    def __init__(self, tipo, modelo):
        self.tipo = tipo
        self.modelo = modelo
        self.ligada = False
        self.combustivel = 100.0

    def ligar(self):
        if self.combustivel > 0:
            self.ligada = True
            print(f"Máquina {self.tipo} ligada.")
        else:
            print("Sem combustível para ligar a máquina.")

    def desligar(self):
        self.ligada = False
        print(f"Máquina {self.tipo} desligada.")

    def operar(self):
        if self.ligada and self.combustivel > 0:
            self.combustivel -= 10
            print(f"Operando {self.tipo}. Combustível restante: {self.combustivel}%")
        else:
            print("Máquina não pode operar.")

    def get_tipo(self):
        return self.tipo

    def set_tipo(self, tipo):
        self.tipo = tipo

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def is_ligada(self):
        return self.ligada

    def get_combustivel(self):
        return self.combustivel

    def set_combustivel(self, combustivel):
        self.combustivel = combustivel