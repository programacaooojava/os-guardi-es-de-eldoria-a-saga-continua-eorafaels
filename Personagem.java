import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class Personagem {
    // Atributos privados (encapsulamento)
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private int poderBase;

    // * Construtor que inicializa todos os atributos do personagem.

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, int poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        if (nivel < 1) {
            throw new IllegalArgumentException("Nível do personagem deve ser pelo menos 1.");
        }
        return nivel;
    }

    public int getPontosDeVida() {
        if (pontosDeVida < 1) {
            throw new IllegalArgumentException("Pontos de vida do personagem deve ser pelo menos 1.");
        }
        return pontosDeVida;
    }

    public int getPoderBase() {
        return poderBase;
    }

    // Setters com validações

    // * Criar métodos que define os pontos de vida do personagem.

    public void exibirStatus() {
        System.out.println("Status do Personagem:");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    /**
     * Criar método que define a habilidade do personagem.
     * Deve ser sobrescrito pelas subclasses para implementar comportamentos
     * específicos.
     */

    public abstract void usarHabilidade();

    protected void atribuirBencao(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor da bênção deve ser positivo.");
        }
        this.poderBase += valor;
        System.out.println(nome + " recebeu uma bênção! Poder base aumentado para " + poderBase);
    }

    // /**
    // * Sobrescrita do método toString() para exibir informações do personagem.
    // *
    // * @return String formatada com todos os atributos do personagem
    // */
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                ", pontosDeVida=" + pontosDeVida +
                ", poderBase=" + poderBase +
                '}';
    }

    // /**
    // * Sobrescrita do método equals() para comparar personagens.
    // * Dois personagens são considerados iguais se tiverem o mesmo nome e classe.
    // *
    // * @param obj Objeto a ser comparado
    // * @return true se os personagens forem iguais, false caso contrário
    // */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Personagem that = (Personagem) obj;
        return Objects.equals(nome, that.nome) && Objects.equals(classe, that.classe);
    }

    // /**
    // * Sobrescrita do método hashCode() para ser consistente com equals().
    // *
    // * @return Código hash baseado no nome e classe
    // */
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}
