package com.avecherov;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.Random;
import static java.util.stream.Collectors.joining;

public class SnailTest {

//    @Test
//    public void SnailTest1() {
//        int[][] array
//                = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
//        test(array, r);
//    }
//
//    public String int2dToString(int[][] a) {
//        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
//    }
//
//    public void test(int[][] array, int[] result) {
//        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
//        System.out.println(text);
//        Assert.assertArrayEquals( result, Snail.snail(array));
//    }
//
//    @Test
//    public void SnailTest2() {
//        int[][] array1
//                = {{1, 2, 3, 4},
//                {12, 13, 14, 5},
//                {11, 16, 15, 6},
//                {10, 9, 8, 7}};
//        int[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
//        test1(array1, r);
//    }
//
//    public String int2dToString1(int[][] a) {
//        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
//    }
//
//    public void test1(int[][] array1, int[] result) {
//        String text = int2dToString1(array1) + " should be sorted to " + Arrays.toString(result);
//        System.out.println(text);
//        Assert.assertArrayEquals( result, Snail.snail(array1));
//    }

    @Test
    public void SnailTest3() {
        int[][] array2
                = {{},
                {},
                {},
                {}};
        int[] r = {};
        test2(array2, r);
    }

    public String int2dToString2(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test2(int[][] array2, int[] result) {
        String text = int2dToString2(array2) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals( result, Snail.snail(array2));
    }

}