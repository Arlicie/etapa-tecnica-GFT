package Exercicio_4;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int i, d, m, a;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Informe o dia em que nasceu: ");
            d= scan.nextInt();
            while (d<1 || d>31){
                System.out.println("O dia é informado inválido, pois precisa estar entre 1 e 31");
                System.out.println("Informe outro valor: ");
                d= scan.nextInt();
            }
            System.out.println("Informe o mes em que nasceu: ");
            m= scan.nextInt();
            while (m<1 || m>12){
                System.out.println("O mês informado é inválido, pois precisa estar entre 1 e 12");
                System.out.println("Informe outro valor: ");
                m= scan.nextInt();
            }
            System.out.println("Informe o ano em que nasceu: ");
            a= scan.nextInt();
            while (a<1){
                System.out.println("O ano informado é inválido, pois é menor que 1");
                System.out.println("Informe outro valor: ");
                a= scan.nextInt();
            }
            while (a>=2000){
                System.out.println("O ano informado é inválido, pois o ano de 2000 ainda não terminou");
                System.out.println("Informe outro valor inferior a 2000: ");
                a= scan.nextInt();
            }
            System.out.println("Data válida.");
            System.out.println();
            System.out.println("Analisar outra data? 1-sim e 2-nao");
            i= scan.nextInt();
            while (i!=2 && i!=1){
                System.out.println("valor inválido, digite outro: ");
                i= scan.nextInt();
            }
        }while (i==1);

    }
}
