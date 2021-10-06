package Aula01;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[]args){
        System.out.println("programa calculadora");
        Scanner leitor  = new Scanner(System.in);

        int valor1;
        int valor2;
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        System.out.println("Por favor, digite o primeiro valor ");
        valor1 = leitor.nextInt();
        System.out.println("Por favor, digite o segundo valor ");
        valor2 = leitor.nextInt();

        soma= valor1 + valor2;
        System.out.println("A soma dos valores é "+ soma);

        subtracao= valor1 - valor2;
        System.out.println("A subtracao dos valores é "+ subtracao);

        multiplicacao= valor1 * valor2;
        System.out.println("A multiplicacao dos valores é "+ multiplicacao );

        divisao= valor1 / valor2;
        System.out.println("A divisão dos valores é "+ divisao );

        leitor.close();
    }

}
