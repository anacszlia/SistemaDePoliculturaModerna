class ControleAves:
    @staticmethod
    def contar_aves_ferteis(galinhas):
        return sum(g.total_ferteis() for g in galinhas)

    @staticmethod
    def calcular_media_ovos(galinhas):
        if not galinhas:
            return 0
        total_ovos = sum(g.get_producao_mensal() for g in galinhas)
        return total_ovos / len(galinhas)

    @staticmethod
    def tratar_galinhas_com_poucos_ovos(galinhas, limite_minimo):
        for g in galinhas:
            if g.get_producao_mensal() < limite_minimo:
                print(f"Tratando galinha {g.get_identificacao()} com apenas {g.get_producao_mensal()} ovos.")

    @staticmethod
    def ave_com_mais_ovos(galinhas):
        if not galinhas:
            return None
        return max(galinhas, key=lambda g: g.get_producao_mensal())