package codigo;

public class CampoTiro extends Quartel {
	
	@Override
	public UnidadeMilitar criarUnidade() {
	 
		return new Arqueiro();
     
	}
 
}