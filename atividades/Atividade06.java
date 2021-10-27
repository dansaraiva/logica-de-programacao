
package atividades;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2;
        int op;
        
        System.out.print("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite outro número: ");
        num2 = entrada.nextDouble();
    
        System.out.println("Menu de opções");
        System.out.println("1 - O primeiro número elevado ao segundo número.");
        System.out.println("2 - Raiz quadrada de cada um dos números.");
        System.out.println("3 - Raiz cúbica de cada um dos números. ");
        op = entrada.nextInt();
        
        switch(op){
            case 1: System.out.println(Math.pow(num1, num2));
            break;
            case 2: System.out.println("Raiz quadrada do número 1: " + Math.sqrt(num1));
                    System.out.println("Raiz quadrada do número 2: " + Math.sqrt(num2));
            break;
            case 3: System.out.println("Raiz cúbica do número 1: "+ Math.cbrt(num1));
                    System.out.println("Raiz cúbica do número 2: "+ Math.cbrt(num2));
            break;
            default: System.out.println("Opção informada é inválida!");
            break;
        }
        
        
    }
}
