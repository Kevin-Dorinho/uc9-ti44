package aulap04j;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        String login1;
        int senha;
        
        

        System.out.println("Digite seu usuário");
        login1 = in.nextLine();

        System.out.println("Digete sua senha");
        senha = in.nextInt();

        

        if(login1.equals("Admin") && (senha == 1234)){
            System.out.println("Acesso permitido");
            
        }else{
            System.out.println("Usuário ou senha incorreto");
        }
    }
}
