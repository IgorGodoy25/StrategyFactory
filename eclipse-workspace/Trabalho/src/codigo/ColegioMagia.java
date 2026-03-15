package codigo;

public class ColegioMagia extends Quartel {

	@Override
	public UnidadeMilitar criarUnidade() {
		
		return new Mago();
		
	}
	
}
