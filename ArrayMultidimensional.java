package br.dio.arrays;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random ();

        int [][] M = new int [4] [4];

        for (int i = 0; i < M.length; i++){

            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);

            }
        }
        System.out.println("Matriz: ");
        for (int [] linha:M) {
            for (int coluna:linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();

        }

        System.out.println("teste");
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
        }





    }

