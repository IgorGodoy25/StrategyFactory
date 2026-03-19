package codigo;

//Essa classe define a estratégia de Flanqueamento, que seria a de cercar o inimigo pelos lados para ganhar vantagem

public class EstrategiaFlanqueamento implements Estrategia {
	
	/** Este método executa o flanqueamento e recebe o nome da unidade escolhida para
	realizar o movimento depois mostrando no console que o ataque está acontecendo
    **/
    public void executar(String unidade) {
        System.out.println(unidade + " flanqueia o inimigo!");
    }
    
    // Esse método retorna o nome da tática
    public String nome() {
        return "Flanqueamento";
    }
}