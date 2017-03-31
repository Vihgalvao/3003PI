package exerciciosjava3003;

import java.util.Scanner;

public class ExerciciosJava3003 {

    public static void main(String[] args) {

        int a;

        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor da entrada: ");
        a = console.nextInt();
        if (!(a >= 1 && a <=12)) {
            
            int b = a * 2;
            System.out.println("O dobro do valor é: " + b + ".");
            
        }  else  {
            System.out.print("O valor não está entre 1 e 12.");
            
        }
    }

}
