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
            System.out.println(p.toString());
            p.usarHabilidade();
            String tipo = (p instanceof Mago) ? "Mago" : (p instanceof Guerreiro) ? "Guerreiro" : "Desconhecido";
            System.out.println("O personagem " + p.getNome() + " é um " + tipo + " de nível " + p.getNivel() + ".\n");
        }

        // Demonstrando equals() e hashCode()
        Personagem[] personagensArray = personagens.toArray(new Personagem[0]); // Convertendo para array para facilitar
                                                                                // a comparação
        Boolean GandalfEqualsMerlin = personagensArray[1].equals(personagensArray[0]); // Comparando Gandalf com Merlin
        int gandalfHashCode = personagensArray[1].hashCode(); // Hash code de Gandalf
        int merlinHashCode = personagensArray[0].hashCode(); // Hash code de Merlin
        System.out.println("Comparando Gandalf com Merlin: " + (GandalfEqualsMerlin ? "São iguais" : "São diferentes"));
        System.out.println("Hash code de Gandalf: " + gandalfHashCode);
        System.out.println("Hash code de Merlin: " + merlinHashCode);
    }
}
