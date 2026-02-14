package aula07j;

public class Loops {
    public static void countdown(int num){
        int n = 0;

        while (n != num) {

            System.out.println(n);
            n++;
            
        }
        System.out.println("BOOM!");
    }


    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n% 2 == 0) n = n /2;
            else n = n * 3 + 1;
        }
    }
    public static void appreciate(){
        int i = 2500;
        while (i >= 0) {
            System.out.print(i + ", ");
            i -= 2;
            
        }
    }
    public static void appreciate2(){

        for (int i = 2; i <= 8; i+= 2){
            System.out.println(i + ", ");
        }
        
    }

    public static void loopvar(){
        int n;
        for (n = 3; n > 0; n--){
            System.out.println(n);
        }
        System.out.println("valor de n: " + n);
    }

    public static void nested(){

        for ( int x = 1; x <= 10; x++){
            for (int y = 1; y <= 10; y++){
                for (int w = 1; w <= 10; w++){
                    System.out.printf("%4d" , x * y * w);
                }
                
            }
        }
    }
    
    public static void main(String[] args) {
        int num = 10;
        //sequence(3);
        //appreciate();
        //loopvar();
        nested();
        System.out.println(" Sistema Finalizado");
    }
}
