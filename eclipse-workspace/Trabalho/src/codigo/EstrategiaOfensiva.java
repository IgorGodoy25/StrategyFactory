package codigo;

//Essa classe define a estratégia Ofensiva, em que a unidade se prepara para receber um ataque e minimizar os danos
public class EstrategiaOfensiva implements Estrategia {
	// Esse método avisa que a unidade está atacando
    public void executar(String unidade) {
        System.out.println(unidade + " ataca de forma agressiva!");
    }
    
    // Esse método retorna o nome da tática.
    public String nome() {
        return "Agressiva";
    }
}