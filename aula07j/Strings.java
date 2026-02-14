package aula07j;

public class Strings {
     public static void main(String[] args) {
        
        String fruta = "banana";

        String s1 = "a";
        String s2 = "b";

        int diff = s1.compareTo(s2);

        if (diff < 0){
          System.out.println("s1 vem antes do s2");
          System.out.println(diff);
        }
        else if(diff > 0){
          System.out.println("s2 vem antes do s1");
          System.out.println(diff);
        }else{
          System.out.println("os nomes são iguais");
          System.out.println(diff);
        }

        char numero;
        numero = 1;
        for(int i = 0; i < 95; i++){
          System.out.println((char)(numero + i));

        }


        
        
        // char letra;
        // System.out.println(fruta.substring(2,4));
        // fruta.toUpperCase();
        // fruta.toLowerCase();

        //for (char c = 'A'; c <= 'z'; c++){
            //System.out.printf("%d", (int)c);
        //}

       // for (char c = 'A'; c <= 'z'; c++){
         //   System.out.print(c);
           // if (c == 'Z'){
             //   System.out.println(" ");
               // c += 6;
           // }
            

       // }
        

       // for (int i = 0; i <= fruta.length(); i++){
          //  letra = fruta.charAt(i);
          //  System.out.println(letra);
          //  if (letra == 'A')
          //      System.out.println("achamos um Azão!");
       // }
        // System.out.println(letra);
        // letra = fruta.charAt(1);
        // System.out.println(letra);
        // letra = fruta.charAt(2);
        // System.out.println(letra);


     }
}
