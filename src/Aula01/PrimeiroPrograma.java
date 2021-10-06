
package Aula01;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class PrimeiroPrograma {
    
    public static void main(String[] args) {
        System.out.print("Hello World\n");
        System.out.println("Outra mensagem");

        Scanner leitor = new Scanner(System.in);
        String nome;
        nome = leitor.next();
        System.out.println("Boa noite, "+ nome);

    }
}
