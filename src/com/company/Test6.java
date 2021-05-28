package com.company;

public class Test6 {
    public static void main(String args[]){
        int matrixOriginal[][]={{1,3,4},{2,4,3},{3,4,5}};

        int matrixTransposed[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrixTransposed[i][j]=matrixOriginal[j][i];
            }
        }

        System.out.println("Without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixOriginal[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transposed:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixTransposed[i][j]+" ");
            }
            System.out.println();
        }
    }
}
