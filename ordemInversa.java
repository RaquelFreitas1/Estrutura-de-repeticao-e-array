package br.dio.arrays;

public class ordemInversa {

    public static void main(String[] args) {

        int [] vetor = {0, 1, -5, 40, 8, 3};

        System.out.println("Vetor: ");

        int count = 0;

       while (count <= vetor.length -1) {

           System.out.print(vetor [count] + " ");
           count++;
       }
        System.out.println("\nVetor Inverso: ");
       for (int i = vetor.length - 1; i >= 0; i --){
           System.out.print(vetor [i] + " ");
       }
    }


    }
