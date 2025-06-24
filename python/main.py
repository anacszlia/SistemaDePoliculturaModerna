from datetime import date
from tratamento import Tratamento
from fazenda import Fazenda
from aves import Aves
from gado_leiteiro import GadoLeiteiro
from controle_aves import ControleAves
from controle_bovinos import ControleBovinos
from energia_solar import EnergiaSolar
from energia_biogas import EnergiaBiogas
from maquina_agricola import MaquinaAgricola

def main():
    print("=== TESTE PYTHON - SISTEMA FAZENDA ===")
    
    # Criar fazenda
    fazenda = Fazenda()
    fazenda.set_nome("Fazenda Python")
    fazenda.set_localizacao("Interior")
    fazenda.set_tamanho_hectares(150.5)
    
    # Criar animais
    galinha = Aves("G001", 2)
    galinha.set_producao_mensal(25.0)
    galinha.alimenta()
    galinha.hidratar()
    
    vaca = GadoLeiteiro("V001", 5)
    vaca.set_producao_mensal(300.0)
    vaca.alimenta()
    vaca.hidratar()
    
    # Adicionar tratamentos
    hoje = date.today()
    trat_galinha = Tratamento(hoje, "Vacina", "Anti-viral")
    galinha.adicionar_tratamento(trat_galinha)
    
    trat_vaca = Tratamento(hoje, "Vermífugo", "Ivermectina")
    vaca.adicionar_tratamento(trat_vaca)
    
    # Mover animais para fazenda
    galinha.mover_animal(fazenda)
    vaca.mover_animal(fazenda)
    
    # Testar funcionalidades
    fazenda.emitir_relatorio_geral()
    print(f"Total de animais: {fazenda.conta_animais()}")
    print(f"Animais alimentados: {fazenda.contar_animais_alimentados()}")
    print(f"Animais hidratados: {fazenda.contar_animais_hidratados()}")
    
    # Testar manejo
    galinha.manejar()
    vaca.manejar()
    
    print(f"Galinha fértil: {galinha.total_ferteis()}")
    print(f"Vaca fértil: {vaca.total_ferteis()}")
    
    # Testar controles
    galinhas = [galinha]
    vacas = [vaca]
    
    print(f"Aves férteis: {ControleAves.contar_aves_ferteis(galinhas)}")
    print(f"Vacas férteis: {ControleBovinos.contar_vacas_ferteis(vacas)}")
    
    # Testar energia
    solar = EnergiaSolar()
    solar.set_capacidade_kw(10.0)
    solar.calcular_energia_gerada()
    
    biogas = EnergiaBiogas()
    biogas.set_capacidade_kw(8.0)
    biogas.calcular_energia_gerada()
    
    # Testar máquina
    trator = MaquinaAgricola("Trator", "John Deere")
    trator.ligar()
    trator.operar()
    trator.desligar()
    
    print("=== TESTE CONCLUÍDO ===")

if __name__ == "__main__":
    main()