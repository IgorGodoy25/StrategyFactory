package codigo;

// PRODUTO CONCRETO

public class Arqueiro implements UnidadeMilitar {
	
	int ATKBase = 5;
	int DEFBase = 3;
	int INTBase = 2;
	int DEFMBase = 2;
	int SORBase = 4;
	
	@Override
 	public void atacar() {
	 	System.out.println("Arqueiro dispara suas flechas!");
 	}
 
	@Override
 	public void mover() {
	 	System.out.println("Arqueiro move-se silenciosamente...");
 	}
 
 	public void lista() {
 		System.out.println("Arqueiro\n\n Ações disponíveis: \n---Atacar\n---Mover");
 	}
 
 	public void stats() {
 		System.out.println("\n=== ATRIBUTOS DO ARQUEIRO === \nAtaque Base: " + ATKBase + "\nDefesa Base: " + DEFBase + "\nInteligência Base: " + INTBase + "\nDefesa Mágica Base: " + DEFMBase + "\nSorte Base: " + SORBase);
 	}
 	
}