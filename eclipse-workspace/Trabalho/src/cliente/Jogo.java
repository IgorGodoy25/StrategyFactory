package cliente;

import java.util.*;

import codigo.CampoTiro;
import codigo.Estabulo;
import codigo.Quartel;
import codigo.ColegioMagia;
import codigo.UnidadeMilitar;
import codigo.Estrategia;
import codigo.EstrategiaAgressiva;
import codigo.EstrategiaDefensiva;
import codigo.EstrategiaFlanqueamento;


public class Jogo {
	
	static final int LIMITE = 10; 
	
    public static void main(String[] args) {
    	
    	List<UnidadeMilitar> exercito = new ArrayList<>();

        int op = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (op != 0) {
        	
        	menuPrincipal();

        	op = scanner.nextInt();
        	
        	if (op == 1) criarUnidade(scanner, exercito);
        	
        	else if (op == 2) acaoUnidade(scanner, exercito);
        		
        	else if (op == 3) mudarEstrategia(scanner, exercito);
        	
        	else if (op == 4) listarUnidades(exercito);
        		
        	else if (op == 0) System.out.println("Saindo...");
        		
        	else System.out.println("Escolha uma opção válida!");
        	
        }
        
        scanner.close();

    }
    
    
    private static void criarUnidade(Scanner scanner, List<UnidadeMilitar> exercito) {
    	
        if (exercito.size() == LIMITE) {
        	
        	System.out.println("Limite de unidades alcançado!");
        	return;
        }
    	    	
    	System.out.println("Escolha uma das seguintes unidades para criar:\n 1) Arqueiro\n 2) Cavaleiro\n 3) Mago");
    	  
        int tipo = scanner.nextInt();
        Quartel fabrica = null;

        if (tipo == 1) fabrica = new CampoTiro();
        
        else if (tipo == 2) fabrica = new Estabulo();
        
        else if (tipo == 3) fabrica = new ColegioMagia();
        
        else System.out.println("Escolha uma opção válida de unidade!");

        if (fabrica != null && exercito.size() < LIMITE) {

        	UnidadeMilitar novaUnidade = fabrica.criarUnidade(); 
            exercito.add(novaUnidade);
            
            System.out.println("Unidade recrutada com sucesso! ID da Unidade: " + exercito.size());
        }
    }
    
    private static void acaoUnidade(Scanner scanner, List<UnidadeMilitar> exercito) {
    	
    	if (exercito.isEmpty()) {
            System.out.println("Seu exército está vazio!");
        } else {
            System.out.println("Qual unidade deve agir? (Digite o número de 0 a " + exercito.size() + ")");
            
            for (int i = 0; i < exercito.size(); i++) {
                System.out.println((i + 1) + ") " + exercito.get(i).getClass().getSimpleName());
            }
            
            int index = scanner.nextInt();
            index--;
            if (index >= 0 && index < exercito.size()) {
            	
                UnidadeMilitar unidade = exercito.get(index);
                
                System.out.println("\nEscolha uma das seguintes ações: \n1) Atacar \n2) Mover \n3) Atributos");
                int acao = scanner.nextInt();
                
                if (acao == 1) unidade.atacar();
                else if (acao == 2) unidade.mover();
                else if (acao == 3) unidade.stats();
                else System.out.println("Ação inválida");
                
            } else System.out.println("Índice inválido!");
        }
    	
    }
    
    private static void listarUnidades(List<UnidadeMilitar> exercito) {

        if (exercito.isEmpty()) {
            System.out.println("Seu exército está vazio!");
            return;
        }

        System.out.println("\n===== UNIDADES DO EXÉRCITO ===\n");

        for (int i = 0; i < exercito.size(); i++) {

            UnidadeMilitar u = exercito.get(i);

            String estrategia = "Neutra";

            if (u.getEstrategia() != null) {
                estrategia = u.getEstrategia().nome();
            }

            System.out.println((i + 1) + ") " +
                    u.getClass().getSimpleName() +
                    " (" + estrategia + ")");
        }
    }
    
    private static void mudarEstrategia(Scanner scanner, List<UnidadeMilitar> exercito) {

        if (exercito.isEmpty()) {
            System.out.println("Seu exército está vazio!");
            return;
        }

        System.out.println("Escolha a unidade:");

        for (int i = 0; i < exercito.size(); i++) {
            System.out.println((i + 1) + ") " + exercito.get(i).getClass().getSimpleName());
        }

        int index = scanner.nextInt();
        index--;

        if (index < 0 || index >= exercito.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        UnidadeMilitar unidade = exercito.get(index);

        System.out.println("\nEscolha a estratégia:");
        System.out.println("1) Ofensiva");
        System.out.println("2) Defensiva");
        System.out.println("3) Flanqueamento");

        int tipo = scanner.nextInt();

        Estrategia estrategia = null;

        if (tipo == 1) estrategia = new EstrategiaAgressiva();
        else if (tipo == 2) estrategia = new EstrategiaDefensiva();
        else if (tipo == 3) estrategia = new EstrategiaFlanqueamento();
        else {
            System.out.println("Estratégia inválida!");
            return;
        }

        unidade.setEstrategia(estrategia);

        System.out.println("Estratégia alterada para: " + estrategia.nome());
    }
    
    private static void menuPrincipal() {
    	
    	System.out.println("\n\nBem-vindo(a) ao fronte! Escolha umas das seguintes ações: \n 1) Criar unidade\n 2) Realizar ação de unidade\n 3) Mudar estratégia de unidade\n 4) Listar unidades disponíveis\n 0) Sair do programa\n");
    	System.out.println("Resposta:  ");
    	
    }
}

