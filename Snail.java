package com.avecherov;

public class Snail {

    public static int[] snail(int[][] array) {

        int[] result = new int[array.length * array.length];
        int position = 0;
        int segment = array.length;

        if (array[0].length == 0) {
            return new int[0];
        }
        for (int i = position; i <= segment * segment; i++) {
            // Upper side
            for (int j = 0; j < segment && position < array.length * array.length; j++) {
                result[position] = array[i][i + j];
                position++;
            }

            // Right side
            for (int j = 1; j <= segment - 1 && position < array.length * array.length && segment > 2; j++) {
                result[position] = array[j][segment - 1 + i];
                position++;
            }
            // Bottom
            for (int j = segment - 1 + i; j > 0 && position < array.length * array.length; j--) {
                result[position] = array[segment - 1 + i][j - 1 + i];
                position++;
            }

            // Left side
            for (int j = segment-2; j > 0 && position < array.length * array.length; j--) {
                result[position] = array[j][i];
                position++;
            }
            segment -=2;
        }
        return result;
    }
}