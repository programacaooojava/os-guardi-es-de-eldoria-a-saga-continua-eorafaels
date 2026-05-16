
/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {

    // * Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, int poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(this.getNome() + " conjura uma bola de fogo!");
    }
}
