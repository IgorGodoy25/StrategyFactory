package codigo;

// PRODUTO CONCRETO

public class Mago implements UnidadeMilitar {
	
	Estrategia estrategia;
	
	int ATKBase = 2;
	int DEFBase = 2;
	int INTBase = 7;
	int DEFMBase = 5;
	int SORBase = 3;
	
	
	 @Override
	 public void atacar() {
		if (estrategia != null) {
			estrategia.executar("Mago");
		} else {
		     System.out.println("Mago conjura feitiços!");
		}

	 }
	 
	 @Override
	 public void mover() {
	     System.out.println("Mago caminha até o destino.");
	 }
	 
	 public void lista() {
		 System.out.println("Mago \n\nAções disponíveis: \n---Atacar\n---Mover");
	 }
	 
	 public void stats() {
		 System.out.println("\n=== ATRIBUTOS DO MAGO === \nAtaque Base: " + ATKBase + "\nDefesa Base: " + DEFBase + "\nInteligência Base: " + INTBase + "\nDefesa Mágica Base: " + DEFMBase + "\nSorte Base: " + SORBase);
	 }

	 public void setEstrategia(Estrategia estrategia) {
	 		this.estrategia = estrategia;
 	}

 	public Estrategia getEstrategia() {
 		return estrategia;
 	}
}