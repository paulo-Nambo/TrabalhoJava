/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoeda;

import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Paulo Baltazar
 */
public class insertionSort {
    // programa de insertionSort

public static void main(String[] args){
 int []p = gerarVetor(20);
insertionSort(p);
System.out.println(Arrays.toString(p));  

}
public static int[]gerarVetor(int n){
    int[]p=new int[n];
    Random gerador = new Random();
    for (int i=0; i<n; i++){
    p[i]=gerador.nextInt(80);
            }
    return p;
}
private static void insertionSort(int[]p){

int x,j;
for (int i=1; i<p.length; i++){
x=p[i];
j=i-1;
while ((j>=0) && p[j]>x){
p[j+1]=p[j];
j=j-1;

   }
p[j+1]=x; 
 }
}
}
