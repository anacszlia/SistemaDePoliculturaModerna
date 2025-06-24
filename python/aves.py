from animal import Animal

class Aves(Animal):
    def __init__(self, identificacao, idade):
        super().__init__()
        self.identificacao = identificacao
        self.idade = idade

    def total_ferteis(self):
        if 1 < self.idade < 3:
            return 1
        else:
            return 0

    def manejar(self):
        print("Manejo específico das aves.")
        for t in self.tratamentos:
            print(f"- Data: {t.get_data()}, Tipo: {t.get_tipo()}, Produto: {t.get_produto()}")
        print()