package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeFacaEnquanto03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int idade = 0, menorIdade = 999, maiorIdade = 0, contMulheresAte200 = 0, cont = 0, idadeMenorSalario = 0;
        double salario = 0.0, mediaSalario, menorSalario = 99999999.0, somaSalario = 0.0;
        char sexo = ' ', sexoMenorSalario = ' ';

        do {
            //Processamento de dados
            

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if ((sexo == 'F') && (salario <= 200.00)) {
                contMulheresAte200++;
            }

            //Entradas de dados
            System.out.print("Informe idade: ");
            idade = entrada.nextInt();
            if (idade >= 0) {
                System.out.print("Informe sexo (M/F): ");
                sexo = entrada.next().charAt(0);
                System.out.print("Informe salário: R$ ");
                salario = entrada.nextDouble();

                somaSalario += salario;
                cont++;
                
                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                if (salario <= menorSalario) {
                    menorSalario = salario;
                    idadeMenorSalario = idade;
                    sexoMenorSalario = sexo;
                }
            }
        } while (idade >= 0);
        mediaSalario = somaSalario / cont;

        //Saída de dados
        System.out.println("A média dos salários do grupo foi de R$ " + String.format("%.2f", mediaSalario));
        System.out.println("A maior idade do grupo é de: " + maiorIdade);
        System.out.println("A menor idade do grupo é de: " + menorIdade);
        System.out.println("A quantidade de mulheres com salário até R$ 200,00 é de: " + contMulheresAte200);
        System.out.println("A idade e o sexo da pessoa que possui o menor salário é: " + idadeMenorSalario
                + " anos e sexo: " + sexoMenorSalario + ".");
    }
}
