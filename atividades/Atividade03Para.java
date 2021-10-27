
package atividades;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, 
 * o segundo valor tem peso 3 e o terceiro valor tem peso 5. 
 */
public class Atividade03Para {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        int n;
        double valor, valor1, valor2, media;
        
        System.out.print("Quantos casos você vai digitar? ");
        n = entrada.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite três números: ");
            valor = entrada.nextDouble();
            valor1 = entrada.nextDouble();
            valor2 = entrada.nextDouble();
            
            media = (valor * 2.0 + valor1 * 3.0 + valor2 * 5.0) / 10.0;
            
            System.out.println("Média: " +String.format("%.1f", media));
        }
    }
}
