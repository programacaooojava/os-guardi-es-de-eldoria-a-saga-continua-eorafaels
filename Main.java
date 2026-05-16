import java.util.ArrayList;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de
 * personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e
 * hashCode().
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");

        // Criando uma lista polimórfica de personagens
        ArrayList<Personagem> personagens = new ArrayList<Personagem>();

        personagens.add(new Mago("Merlin", 10, 100, 50));
        personagens.add(new Mago("Gandalf", 15, 120, 70));
        personagens.add(new Guerreiro("Arthur", 12, 150, 80));
        personagens.add(new Guerreiro("Lancelot", 14, 140, 90));

        // Percorrendo a lista e demonstrando polimorfismo
        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidade();
        }
    }
}
