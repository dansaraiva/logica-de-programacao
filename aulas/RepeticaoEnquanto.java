
package aulas;

import java.util.Scanner;

public class RepeticaoEnquanto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma = 0;
        
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        
        while(num != 0){
            soma += num;
            System.out.print("Digite outro número: ");
            num = entrada.nextInt();
        }
        
        System.out.println("A soma dos números digitados foi: " + soma);
    }
}
