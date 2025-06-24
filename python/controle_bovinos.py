class ControleBovinos:
    @staticmethod
    def contar_vacas_ferteis(lista_vacas):
        return sum(vaca.total_ferteis() for vaca in lista_vacas)

    @staticmethod
    def calcular_media_leite(vacas):
        vacas_ferteis = [v for v in vacas if v.total_ferteis() == 1]
        if not vacas_ferteis:
            return 0
        total_leite = sum(v.get_producao_mensal() for v in vacas_ferteis)
        return total_leite / len(vacas_ferteis)

    @staticmethod
    def tratar_vacas_com_pouco_leite(vacas, limite_minimo):
        for v in vacas:
            if v.get_producao_mensal() < limite_minimo:
                print(f"Tratando vaca {v.identificacao} com apenas {v.get_producao_mensal()} litros de leite.")

    @staticmethod
    def caracteristicas_das_vacas_com_mais_leite(vacas):
        if not vacas:
            return
        maior_producao = max(v.get_producao_mensal() for v in vacas)
        for v in vacas:
            if v.get_producao_mensal() == maior_producao:
                print("Vaca com mais leite:")
                print(f"- Identificação: {v.identificacao}")
                print(f"- Idade: {v.idade}")
                print(f"- Peso: {v.get_peso()}")
                print(f"- Produção mensal: {v.get_producao_mensal()} litros.")