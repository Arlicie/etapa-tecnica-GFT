package Exercicio_1;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        double salario;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        salario= scan.nextDouble();
        while (salario<=0){
            System.out.println("valor inválido, digite outro: ");
            salario= scan.nextDouble();
        }
        do{
            if (salario<=280.0){
                System.out.println("Salario anterior: " +salario);
                System.out.println("Aumento percentual: 20%");
                System.out.println("Aumento valor: "+ salario*0.2);
                System.out.println("Salario atual: " + (salario+salario*0.2));
            }else if (salario>280.0 && salario<700.0){
                System.out.println("Salario anterior: " +salario);
                System.out.println("Aumento percentual: 15%");
                System.out.println("Aumento valor: "+ salario*0.15);
                System.out.println("Salario atual: " + (salario+salario*0.15));
            }else if (salario>=700.0 && salario<1500.0){
                System.out.println("Salario anterior: " +salario);
                System.out.println("Aumento percentual: 10%");
                System.out.println("Aumento valor: "+ salario*0.1);
                System.out.println("Salario atual: " + (salario+salario*0.1));
            } else if (salario>=1500) {
                System.out.println("Salario anterior: " +salario);
                System.out.println("Aumento percentual: 5%");
                System.out.println("Aumento valor: "+ salario*0.05);
                System.out.println("Salario atual: " + (salario+salario*0.05));
            }
            System.out.println();
            System.out.println("Calcular novo salário? 1-sim e 0-nao");
            i= scan.nextInt();
            while (i!=0 && i!=1){
                System.out.println("valor inválido, digite outro: ");
                i= scan.nextInt();
            }

            System.out.println("Informe o salário: ");
            salario= scan.nextDouble();
        }while (i==1);

    }
}
