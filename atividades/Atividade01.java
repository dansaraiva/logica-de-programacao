
package atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        double nota01, nota02, nota03, nota04, media;
        
        System.out.print("Digite a primeira nota: ");
        nota01 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota02 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota03 = entrada.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        nota04 = entrada.nextDouble();
        
        media = (nota01 + nota02 + nota03 + nota04)/4.0;
        
        if(media < 7){
            System.out.println("Reprovado, com média: " + media);
        }else{
            System.out.println("Aprovado, com média: " + media);
        }
    }
}
