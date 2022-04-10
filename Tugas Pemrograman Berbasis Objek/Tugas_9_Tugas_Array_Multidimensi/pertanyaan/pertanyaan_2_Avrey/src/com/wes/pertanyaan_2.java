package com.wes;

public class pertanyaan_2 {
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
        
        for (int i=0; i<nilai.length; i++){
            for (int j=0; j<nilai[0].length; j++){
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
