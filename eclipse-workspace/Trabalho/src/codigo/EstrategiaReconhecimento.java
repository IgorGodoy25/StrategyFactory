package codigo;
import java.util.Random;


// Essa classe define a estratégia de Reconhecimento, que observa o que os inimigos estão fazendo e reporta para o jogador
// Sugestões de melhoria em melhorias.txt
public class EstrategiaReconhecimento implements Estrategia {
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
    
    // Esse método retorna o nome da tática.
    public String nome() {
        return "Reconhecimento";
    }
}