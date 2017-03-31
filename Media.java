package exerciciosjava3003;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("p1: ");
        double a = console.nextDouble();
        System.out.println("p2: ");
        double b = console.nextDouble();
        double media = a + b / 2;

        if (media >= 6) {
            System.out.println("Voce está aprovado");
        } else if (media <= 6) {

         System.out.println("Voce não atingiu a media, insira a nota da p3: ");
         double c = console.nextDouble();
         if (c > a) {
            media = c+b/2;
        } 
        
         
        }  
            
        }
    }
    