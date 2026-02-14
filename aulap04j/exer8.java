package aulap04j;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int age;

        System.out.println("Me fale quantos anos você tem?");
        age = in.nextInt();

        if (age <= 12){
            System.out.println("Você é uma criança");
    
        }else if (age <= 18){
            System.out.println("Você é um adolecente");

        }else if (age <= 59){
            System.out.println("Você é adulto");

        }else if (age >=60){
            System.out.println("Você já é um avô(ó)");
        }
    }    
}
