package codigo;

public class Estabulo extends Quartel {
	
    @Override
    public UnidadeMilitar criarUnidade() {
    	
        return new Cavaleiro();
        
    }
    
}