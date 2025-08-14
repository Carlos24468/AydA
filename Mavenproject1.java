//Suma de las filas de un arreglo
package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        int s;
        double pro;
        int [][] tresxtres =new int[3][3];
        System.out.println("ingresar los numeros ");
        for(int i=0;i<3;i++){
            s=0;
            pro=0;
            for (int y=0;y<3;y++){
                System.out.println("ingrese el valor para "+(i+1)+"x"+(y+1));
                tresxtres[i][y]=sc.nextInt();
                s+=tresxtres[i][y];
                pro=s/3;
            }
                System.out.println("la suma de la la fila "+(i+1)+" es :"+s+" y su promedio es "+pro);
            
        
}
}
}