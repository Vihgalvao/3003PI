
package exerciciosjava3003;

import java.util.Scanner;


public class LogineSenha {
    public static void main(String[] args) {
        Scanner console =  new Scanner  (System.in);
        System.out.println("Digite seu login: ");
        String a = console.next();
        System.out.println("Digite sua senha:");
        String b = console.next();
        
        if (a.equals("guilherme") && b.equals("0f5")) {
            System.out.println("Bem vindo  "+a);
        } else if (a.equals("jair") && b.equals ("0706")){
        System.out.println("Bem vindo"+a);
        }else { System.out.println("Você não possui login");
   
        
    }
        
       
    }
}
