package telran.java_lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergingTest {
    Merging merg = new Merging();



        @Test
        public void positiveTest() {
            int[] actual = {5, 1, 6, 2, 3, 4};
            int[] expected = {1, 2, 3, 4, 5, 6};
            merg.mergeSort(actual);
            assertArrayEquals(expected, actual);
        }

        @Test
        public void zeroElementTest() {
            int[] actual = {};
            int[] expected = {};
            merg.mergeSort(actual);
            assertArrayEquals(expected, actual);
        }

        @Test
        public void negativElementTest() {
            int[] actual = {-3, 5, 23, -1, 0, -34};
            int[] expected = {-34, -3, -1, 0, 5, 23};
            merg.mergeSort(actual);
            assertArrayEquals(expected, actual);
        }


    }
