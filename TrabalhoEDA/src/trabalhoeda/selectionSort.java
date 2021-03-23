/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoeda;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Paulo Baltazar
 */
public class selectionSort {
     public static void main(String[] args){
       int[]p = gerarVetor(10);
      selectionSort(p);
       System.out.println(Arrays.toString(p));  
   }

    private static void selectionSort(int[] p) {
       for (int i=0; i<p.length; i++){
           int menor=i;
           for(int j=i+1;j<p.length;j++){
               if (p[j]<p[menor])
                   menor =j;
           }
           trocar(p,i,menor);
       }
    }
    private static void trocar(int[]p,int i, int menor){
        int aux = p[i];
        p[i]=p[menor];
        p[menor]=aux;
    }
  public static int[]gerarVetor(int n){
    int[]p=new int[n];
    Random gerador = new Random();
    for (int i=0; i<n; i++){
    p[i]=gerador.nextInt(100);
            }
    return p;
}
}
