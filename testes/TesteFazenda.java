package testes;

import java.time.LocalDate;
import java.util.ArrayList;
//import objetos.Aves;
import objetos.Energia.EnergiaBiogas;
import objetos.Energia.EnergiaSolar;
//import objetos.Fazenda;
//import objetos.GadoLeiteiro;
//import objetos.Gramineas;
//import objetos.MaquinaAgricola;
//import objetos.SistemaIrrigacao;
//import objetos.Tratamento;

import objetos.*;


public class TesteFazenda {
    public static void main(String[] args) {
        //criar fazenda
        Fazenda fazenda = new Fazenda();
        fazenda.setNome("Fazenda Ana Claudia");
        fazenda.setLocalizacao("Interior de Maximiliano de Almeida 99890-000");
        fazenda.setTamanhoHectares(150.5);
        EnergiaBiogas eb=new EnergiaBiogas();
        EnergiaSolar es=new EnergiaSolar();
        eb.setCapacidadeKw(120);
        eb.setEnergiaGeradaDia(550);
        es.setEnergiaGeradaDia(550.9);
        es.setCapacidadeKw(150);
        double totalE=eb.calcularEnergiaGerada() + es.calcularEnergiaGerada();
        fazenda.setEnergia(totalE);
        // Criar listas para testes
        ArrayList<GadoLeiteiro> vacas = new ArrayList<>();
        ArrayList<Aves> galinhas = new ArrayList<>();
        
        // === TESTE GADO LEITEIRO ===
        System.out.println("--- TESTE GADO LEITEIRO ---");
        GadoLeiteiro vaca1 = new GadoLeiteiro("V001", 3);
        GadoLeiteiro vaca4 = new GadoLeiteiro("V004", 1);
        GadoLeiteiro vaca2 = new GadoLeiteiro("V002", 5);
        GadoLeiteiro vaca3 = new GadoLeiteiro("V003", 12);
        
        // metodos de animal -abstrato
        vaca1.setRaca("Holandesa");
        vaca1.setPeso(450.5f);
        vaca1.setProducaoMensal(280f);
        vaca1.alimenta();
        vaca1.hidratar();
        
        vaca2.setRaca("Jersey");
        vaca2.setPeso(380.2f);
        vaca2.setProducaoMensal(620f);
        vaca2.alimenta();
        vaca2.hidratar();
        
        vaca3.setRaca("Gir");
        vaca3.setPeso(420.0f);
        vaca3.setProducaoMensal(150f);
        
        vaca4.setRaca("Angus");
        vaca4.setPeso(250.0f);
        // Métodos da classe SerVivo
        vaca1.setNome("Mimosa");
        vaca1.setEspecie("Bos taurus");
        vaca1.setEstadoSaude("Saudável");
        
        Tratamento tratVaca = new Tratamento(LocalDate.of(2025, 1, 15), "Vacina", "Anti-aftosa");
        vaca1.adicionarTratamento(tratVaca);
        
        //adiciona na lista de vacas
        vacas.add(vaca1);
        vacas.add(vaca2);
        vacas.add(vaca3);
        vacas.add(vaca4);
        
        // Métodos específicos do GadoLeiteiro
        System.out.println("Total férteis: "  + ControleBovinos.contarVacasFerteis(vacas));
        System.out.println("Média de leite: " + ControleBovinos.calcularMediaLeite(vacas) + " litros");
        
        ControleBovinos.tratarVacasComPoucoLeite(vacas, 450f);
        ControleBovinos.caracteristicasDasVacasComMaisLeite(vacas);
        
        vaca1.manejar();
        
        // === TESTE AVES ===
        System.out.println("\n--- TESTE AVES ---");
        Aves galinha1 = new Aves("G001", 2);
        Aves galinha2 = new Aves("G002", 1);
        Aves galinha3 = new Aves("G003", 4);
        
        // Métodos da classe Animal
        galinha1.setRaca("Rhode Island");
        galinha1.setPeso(2.5f);
        galinha1.setProducaoMensal(25f);
        galinha1.alimenta();
        galinha1.hidratar();
        
        galinha2.setRaca("Leghorn");
        galinha2.setPeso(2.2f);
        galinha2.setProducaoMensal(28f);
        galinha2.alimenta();
        galinha2.hidratar();
        
        galinha3.setRaca("Caipira");
        galinha3.setPeso(2.8f);
        galinha3.setProducaoMensal(30f);
        
        // Métodos da classe SerVivo
        galinha1.setNome("Pintadinha");
        galinha1.setEspecie("Gallus gallus");
        galinha1.setEstadoSaude("Saudável");
        
        Tratamento tratGalinha = new Tratamento(LocalDate.of(2025, 1, 10), "Vermífugo", "Ivermectina");
        galinha1.adicionarTratamento(tratGalinha);
        
        galinhas.add(galinha1);
        galinhas.add(galinha2);
        galinhas.add(galinha3);
        
        System.out.println("Total férteis: "  + ControleAves.contarAvesFerteis(galinhas));
        System.out.println("Média de ovos mensais: " + ControleAves.calcularMediaOvos(galinhas) + " ovos");
        
        ControleAves.aveComMaisOvos(galinhas);
        ControleAves.tratarGalinhasComPoucosOvos(galinhas, 20);
        
        
        galinha1.manejar();
        
        // === TESTE PLANTAS ===
        System.out.println("\n--- TESTE PLANTAS ---");
        Gramineas capim1 = new Gramineas("verão");
        Gramineas capim2 = new Gramineas("inverno");
        
        // Métodos da classe SerVivo
        capim1.setNome("Capim Tanzânia");
        capim1.setEspecie("Panicum maximum");
        capim1.setIdade(6);
        capim1.setEstadoSaude("Saudável");
        
        capim2.setNome("Capim Azevém");
        capim2.setEspecie("Lolium multiflorum");
        capim2.setIdade(3);
        capim2.setEstadoSaude("Bom");
        
        // Métodos específicos da Planta
        capim1.setTipoSolo("Argiloso");
        capim1.setCicloVida("adulto");
        capim1.adubar();
        
        capim2.setTipoSolo("Arenoso");
        capim2.setCicloVida("jovem");
        
        Tratamento tratPlanta = new Tratamento(LocalDate.of(2025, 1, 5), "Fertilizante", "NPK 20-05-20");
        capim1.adicionarTratamento(tratPlanta);
        
        // Testando métodos
        System.out.println("Tipo solo capim1: " + capim1.getTipoSolo());
        System.out.println("Ciclo vida capim1: " + capim1.getCicloVida());
        System.out.println("Capim1 adubado: " + capim1.isAdubado());
        System.out.println("Capim2 adubado: " + capim2.isAdubado());
        
        capim1.verificaReprodutividade();
        capim2.verificaReprodutividade();
        
        capim1.manejar();
        capim2.manejar();
        
        // === TESTE MOVIMENTAÇÃO DE ANIMAIS ===
        System.out.println("\n--- TESTE MOVIMENTAÇÃO ---");
        Fazenda fazenda1 = new Fazenda();
        fazenda1.setNome("fazenda feliz");
        
        vaca1.moverAnimal(fazenda1);
        galinha1.moverAnimal(fazenda1);
        
        
        System.out.println("Fazenda da vaca1: " + vaca1.getFazenda().getNome());
        System.out.println("Fazenda da galinha1: " + galinha1.getFazenda().getNome());

        
        
        //criar plantas
        Gramineas capim = new Gramineas("inverno");
        fazenda.adicionarPlanta(capim);
        capim.setNome("capim");
        //testar funcionalidades
        fazenda.emitirRelatorioGeral();
        System.out.println("Total de animais: " + fazenda.contaAnimais());
        System.out.println("Total de plantas: " + fazenda.contaPlantas());
        
        //testar manejo
        galinha1.manejar();
        vaca1.manejar();
        capim.manejar();
        
        //testar sistemas
        SistemaIrrigacao irrigacao = new SistemaIrrigacao("Gotejamento");
        irrigacao.ligarIrrigacao();
        
        MaquinaAgricola trator = new MaquinaAgricola("Trator", "John Deere 5075E");
        trator.ligar();
        trator.operar();
        MaquinaAgricola drone = new MaquinaAgricola("pulverizador", "dji");
        drone.ligar();
        drone.operar();
    }
}