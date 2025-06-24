from datetime import date

class Tratamento:
    def __init__(self, data, tipo, produto):
        self.data = data
        self.tipo = tipo
        self.produto = produto

    def get_data(self):
        return self.data

    def set_data(self, data):
        self.data = data

    def get_tipo(self):
        return self.tipo

    def set_tipo(self, tipo):
        self.tipo = tipo

    def get_produto(self):
        return self.produto

    def set_produto(self, produto):
        self.produto = produto