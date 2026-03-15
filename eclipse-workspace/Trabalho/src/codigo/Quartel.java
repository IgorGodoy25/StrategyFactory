package codigo;

// FABRICA ABSTRATA

public abstract class Quartel {
	
	public abstract UnidadeMilitar criarUnidade();

    public void posicionarUnidade() {
        UnidadeMilitar unidade = criarUnidade();
        System.out.println("Nova unidade selecionada: ");
        unidade.lista();
        unidade.stats();
    }
    
}