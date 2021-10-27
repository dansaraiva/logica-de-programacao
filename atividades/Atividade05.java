package atividades;

import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2, result;
        int op;
        
        System.out.print("Digite um número: ");
        num1 = entrada.nextDouble();
         
        System.out.print("Digite outro número: ");
        num2 = entrada.nextDouble();
        
        System.out.println("");
        System.out.println("Opções válidas: ");
        System.out.println("1 :: Média entre os números digitados!");
        System.out.println("2 :: Diferença entre o maior e o menor!");
        System.out.println("3 :: Produto entre os números digitados!");
        System.out.println("4 :: Divisão do primeiro pelo segundo!");
        
        System.out.println("");
        System.out.print("Digite a operação: ");
        op = entrada.nextInt();
        
        System.out.println("");
        switch(op){
            case 1: result = (num1 + num2) / 2.0;
            break;
            case 2: result = (num1 > num2)?  num1 - num2 :  num2 - num1;
            break;
            case 3: result = num1 * num2;
            break;
            case 4: result = num1 / num2;
            break;
            default: result = 0;
                       System.out.println("Erro, operação inválida");
                       break;        
        }
        System.out.println("O resultado da operação escolhida foi: "+ result);
        
        
    }
}
