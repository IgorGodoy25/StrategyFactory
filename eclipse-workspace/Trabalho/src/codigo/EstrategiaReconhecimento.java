package codigo;
import java.util.Random;

public class EstrategiaReconhecimento implements Estrategia {
    @Override
    public void executar(String unidade) {
        String[] taticasInimigas = {
            "Goblins em Emboscada nas árvores!", 
            "Goblins em Formação Defensiva com escudos!", 
            "Goblins inimigos recuando para a caverna!",
            "Golbins se preparando para uma investida!"
        };
        String taticaAtual = taticasInimigas[new Random().nextInt(taticasInimigas.length)];

        System.out.println("\n[RELATÓRIO DE RECONHECIMENTO]");
        System.out.println(unidade + " subiu em uma torre e avistou: " + taticaAtual);
    }

    @Override
    public String nome() {
        return "Reconhecimento";
    }
}