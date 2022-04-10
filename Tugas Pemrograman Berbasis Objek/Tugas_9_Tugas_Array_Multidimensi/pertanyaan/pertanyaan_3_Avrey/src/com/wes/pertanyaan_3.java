package com.wes;

public class pertanyaan_3 {
    public static void main(String[] args) {
        
        int [][]nilai=new int[2][4];
        
            nilai[0][0]=12;
            nilai[0][1]=14;
            nilai[0][2]=34;
            nilai[0][3]=44;
            nilai[1][0]=30;
            nilai[1][1]=21;
            nilai[1][2]=67;
            nilai[1][3]=200;
            
            for (int array1D[]: nilai){
                for (int j : array1D){
                    System.out.print(j +" ");
                }
                System.out.println(" ");
            }
        
    }
}
