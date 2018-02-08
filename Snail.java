package com.avecherov;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

public class Snail {

    public static int[] snail(int[][] array) {

        int[] result = new int[array.length * array.length];
        int position = 0;
        int segment = array.length;
        int counter = array.length - 1;

        if (array[0].length == 0) {
            return new int[0];
        }

        for (int i = position; i <= array.length * array.length; i++) {
            // Upper side
            for (int j = 0; j < segment && position < array.length * array.length; j++) {
                result[position] = array[i][i + j];
                position++;
            }

            // Right side
            for (int j = 1; j < segment - 1 && position < array.length * array.length; j++) {
                result[position] = array[j + i][segment - 1 + i];
                position++;
            }
            // Bottom
            for (int j = 0; j <= segment - 1 && position < array.length * array.length; j++) {
                result[position] = array[counter][counter - j];
                position++;
            }


            // Left side
            for (int j = 1; j < segment-1 && position < array.length * array.length; j++) {
                result[position] = array[counter - j][i];
                position++;
            }

            segment -=2;
            counter--;
        }
        return result;
    }
}


