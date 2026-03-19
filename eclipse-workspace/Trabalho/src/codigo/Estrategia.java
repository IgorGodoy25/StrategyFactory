package codigo;

// Esta interface é a base para as demais estratégias do jogo
public interface Estrategia {

    void executar(String unidade);

    String nome();
}