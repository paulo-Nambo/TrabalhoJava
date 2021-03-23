
package trabalhoeda;

import java.util.Arrays;

/**
 *
 * @author Paulo Baltazar
 */
public class bublesort {
    
   public static void main(String[] args){
       int[]p={55,35,45,80,21,15,3,18,27,89};
       bolha(p);
       System.out.println(Arrays.toString(p));  
   }
           
    private static void bolha(int[]p){
        for(int ultimo= p.length-1; ultimo>0; ultimo--){
            
            for (int i=0; i<ultimo;i++) {
                if (p[i]>p[i+1])
                    trocar(p,i,i+1);
            }
        }
    }

    private static void trocar(int[] p, int i, int j) {
       int aux=p[i];
       p[i]=p[j];
       p[j]= aux;
       
           
           
    
}
}
