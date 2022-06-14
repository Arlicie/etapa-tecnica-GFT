package Exercicio_2;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int op;
        double n1, n2, n3, p1, p2, p3;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("=====Menu Opcções=====");
            System.out.println("1- media aritmética");
            System.out.println("2- media ponderada");
            System.out.println("3- sair");
            op=scan.nextInt();
            while (op!=1 && op!= 2 && op!=3){
                System.out.println("Opção inválida, digite novamente: ");
                op=scan.nextInt();
            }
            if (op==1){
                System.out.println("Digite as 2 notas: ");
                n1= scan.nextDouble();
                n2=scan.nextDouble();
                while (n2<0 || n1<0){
                    System.out.println("Digite as notas novamente: ");
                    n1= scan.nextDouble();
                    n2=scan.nextDouble();
                }
                System.out.println("Media: "+ (n1+n2)/2);
            } else if (op == 2) {
                System.out.println("Digite as 3 notas: ");
                n1= scan.nextDouble();
                n2=scan.nextDouble();
                n3= scan.nextDouble();
                while (n2<0 || n1<0 || n3<0){
                    System.out.println("Digite as notas novamente: ");
                    n1= scan.nextDouble();
                    n2=scan.nextDouble();
                    n3= scan.nextDouble();
                }
                System.out.println("Digite os pesos respectivamente: ");
                p1= scan.nextDouble();
                p2=scan.nextDouble();
                p3= scan.nextDouble();
                while (p2<=0 || p1<=0 ||p3<=0){
                    System.out.println("Digite os pesos novamente: ");
                    p1= scan.nextDouble();
                    p2=scan.nextDouble();
                    p3= scan.nextDouble();
                }
                System.out.println("Media: "+ (n1*p1 + n2*p2 + n3*p3)/(p2+p1+p3));
            }

            System.out.println();

        }while (op==1 || op==2);
    }
}
