from planta import Planta

class Gramineas(Planta):
    def __init__(self, epoca):
        super().__init__()
        self.epoca = epoca
        self.especie = "Gramínea"