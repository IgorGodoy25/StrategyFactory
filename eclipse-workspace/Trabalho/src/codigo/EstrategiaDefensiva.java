package codigo;

public class EstrategiaDefensiva implements Estrategia {

    public void executar(String unidade) {
        System.out.println(unidade + " inicia formação defensiva!");
    }

    public String nome() {
        return "Defensiva";
    }
}