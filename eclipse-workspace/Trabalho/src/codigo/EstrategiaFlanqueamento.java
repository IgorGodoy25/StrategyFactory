package codigo;

public class EstrategiaFlanqueamento implements Estrategia {
	
    public void executar(String unidade) {
        System.out.println(unidade + " flanqueia o inimigo!");
    }

    public String nome() {
        return "Flanqueamento";
    }
}