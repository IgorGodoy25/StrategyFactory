package codigo;

public class EstrategiaAgressiva implements Estrategia {

    public void executar(String unidade) {
        System.out.println(unidade + " atacou de forma agressiva!");
    }

    public String nome() {
        return "Agressiva";
    }
}