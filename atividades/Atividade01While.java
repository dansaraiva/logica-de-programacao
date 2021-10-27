package atividades;
import java.util.Scanner;

/**
 * 01 - Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
 * correta é o valor 2002.
 */
public class Atividade01While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha, senhaDigitada;
        senha = 2002;
        System.out.print("Informe a senha: ");
        senhaDigitada = entrada.nextInt();
        while (senhaDigitada != senha) {
            System.out.println("Senha Invalida");

            System.out.print("Informe a senha: ");
            senhaDigitada = entrada.nextInt();
        }        
        System.out.println("Acesso Permitido");
    }
}
