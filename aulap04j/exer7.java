package aulap04j;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numb1;
        int numb2;

        int calcu;

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        System.out.println("Escreva um número");
        num1 = in.nextInt();

        System.out.println("Escreva outro número");
        num2 = in.nextInt();

        System.out.println("Escolha qual operação deseja 1 = soma, 2 = subtração, 3 = multiplicação, 4 = Divisão");
        calcu = in.nextInt();
        
        switch (calcu) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Está operação não existe");
                break;
        }
    }
}
