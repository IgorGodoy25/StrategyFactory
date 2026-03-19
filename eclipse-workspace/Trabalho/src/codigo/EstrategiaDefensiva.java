package codigo;

// Essa classe define a estratégia Defensiva, em que a unidade se prepara para receber um ataque e minimizar os danos
public class EstrategiaDefensiva implements Estrategia {
	
	// Esse método avisa que a unidade agora está em posição de guarda
    public void executar(String unidade) {
        System.out.println(unidade + "inicia formação defensiva");
    }
    
    // Esse método retorna o nome da tática.
    public String nome() {
        return "Defensiva";
    }
}