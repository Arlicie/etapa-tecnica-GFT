package Exercicio_3;
import java.util.Scanner;


public class CincoPessoas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, pesoM_alturaM=0, porcentIdadeAlt=0, altura190=0;
        double peso, altura,  mediaIdade=0;

        for (int i=1; i<6; i++){
            System.out.println("Idade da " +i+ "pessoa: ");
            idade= scan.nextInt();
            while (idade<1){
                System.out.println("Digite a idade da " +i+ "pessoa: ");
                idade= scan.nextInt();
            }
            mediaIdade+=idade;

            System.out.println("Peso da " +i+ "pessoa: ");
            peso= scan.nextDouble();
            while (peso<1){
                System.out.println("Digite o peso da " +i+ "pessoa: ");
                peso= scan.nextDouble();
            }
            System.out.println("Altura da " +i+ "pessoa: ");
            altura= scan.nextDouble();
            while (altura<0){
                System.out.println("Digite a altura da " +i+ "pessoa: ");
                altura= scan.nextDouble();
            }
            if (peso>90 && altura<1.50){
                pesoM_alturaM++;
            }
            if (altura>1.90){
                altura190++;
                if (idade>9 && idade<31){
                    porcentIdadeAlt++;
                }
            }
        }

        System.out.println("Média das idades: "+ mediaIdade/5);
        System.out.println(pesoM_alturaM +" Pessoas com 90kg e altura inferior a 1,50m");
        if (altura190!=0 && porcentIdadeAlt!=0){
            System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1.90: " +(porcentIdadeAlt*100)/altura190+"%");
        }else System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1.90: 0%");

    }
}
