package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        double[] vect = new double[n];
        
        for(int i = 0; i < n; i++){
            vect[i] = entrada.nextDouble();            
        }
        
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vect[i];
        }
        
        double media = soma / n;
        
        System.out.printf("Média das alturas: %.2f%n", media);
    }
}
