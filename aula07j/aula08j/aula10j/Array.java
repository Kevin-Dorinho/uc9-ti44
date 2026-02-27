package aula07j.aula08j.aula10j;
import java.util.Arrays;
public class Array {

    public static void printArray(int[] a){

        for (int v : a){
            System.out.println(v);
        }

         
        // for (int i = 0; i <a.length; i++ ){
        //     System.out.println(a[i]);
            
        // }
        
    }
    
    public static void main(String[] args) {
        
        // // inicialização dos vetores:

        int [] counts; // um array ou vetor de int's
        double [] values; // um array ou vetor de double's
        int size = 10;
        

        // criação de vetores:
        counts = new int[4]; // hard array tamanho fixo;
        values = new double[size]; // array com tamanho variável;

        // // inicialização com atribuição de valores;
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 5};
        
        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2] ++;
        counts[3] -= 60;
        //System.out.println(Arrays.toString(counts));
        
        // for (int i = 0; i <4; i++ ){
        //     System.out.println(counts[i]);
            
        // }


        //while(i <4){
           // System.out.println(counts[i]);
           // i++;
       // }

       
    }
}
