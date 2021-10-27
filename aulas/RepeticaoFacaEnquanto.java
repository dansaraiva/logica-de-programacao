
package aulas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.
 */
public class RepeticaoFacaEnquanto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        double c, f;
        char resp;
            
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            c = entrada.nextDouble();
        
            f = 9.0 * c / 5.0 + 32.0;
        
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
        
            System.out.print("Deseja repetir (s/n)? ");
            resp = entrada.next().charAt(0);
        }while(resp != 'n');
        
    }
}
