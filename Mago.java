import java.util.ArrayList;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem implements Auditavel {
    ArrayList<String> acoes;

    // * Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, int poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.acoes = new ArrayList<>();
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(this.getNome() + " conjura uma bola de fogo!");
        registrarAcao("Conjurou uma bola de fogo!");
    }

    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("Ações auditadas para " + this.getNome() + ":");
        for (String acao : acoes) {
            System.out.println(" - " + acao);
        }
    }
}
