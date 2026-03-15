package codigo;

// PRODUTO CONCRETO

public class Cavaleiro implements UnidadeMilitar {
	
	int ATKBase = 6;
	int DEFBase = 5;
	int INTBase = 2;
	int DEFMBase = 5;
	int SORBase = 2;
	
    @Override
    public void atacar() {
        System.out.println("Cavaleiro investe com sua lança!");
    }
    
    @Override
    public void mover() {
        System.out.println("Cavaleiro galopa rapidamente!");
    }
    
	public void lista() {
		 System.out.println("Cavaleiro \n\nAções disponíveis: \n---Atacar\n---Mover");
	}
	 
	public void stats() {
		 System.out.println("\n=== ATRIBUTOS DO CAVALEIRO === \nAtaque Base: " + ATKBase + "\nDefesa Base: " + DEFBase + "\nInteligência Base: " + INTBase + "\nDefesa Mágica Base: " + DEFMBase + "\nSorte Base: " + SORBase);
	}
	 
}