
package exerciciosjava3003;

import java.util.Scanner;


public class OlaMundo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String a = console.next();
        
        if (!(a == null || a.equals(""))) {
            System.out.println("Olá, "+a);
        }else //if (a.trim().isEmpty()) { 
        {System.out.println(" Olá, mundo");
        }
    }
    
}
