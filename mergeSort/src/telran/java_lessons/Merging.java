package telran.java_lessons;

import java.util.Arrays;

public class Merging {

    public static void main(String[] args) {
        int[] array1 = {1, -6, 3, -6, -2};
        int[] array2 = {-6, -2, 10, 2, 3, -4, 5, 6, 7, -9};

        mergeSort(array2);
       System.out.println(Arrays.toString(array2));
       mergeSort(array1);
       System.out.println(Arrays.toString(array1));


    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return ;
        }
        int mid = array.length / 2;//нашли середину массива
//разделили на две части
        int[] leftArray = new int[mid];
        for (int i = 0; i < mid; i++) {
            leftArray[i]=array[i];
        }
        //левая часть

        int[] rightArray = new int[array.length - mid];
        for (int i = mid; i < array.length; i++) {
            rightArray[i-mid]=array[i];
        }//правая часть
//рекурсией делим пока не останется 1 элемент
        mergeSort(leftArray);
         mergeSort(rightArray);

        merge(leftArray,rightArray);//обьединяем

    }
    public static void merge(int[]leftArray, int[]rightArray){

        int[]newSortedArray = new int[leftArray.length+ rightArray.length];
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int l=0,r=0,i=0;//run in arrays(l run in left, r run in right,i run in newSorted)
        while(l<leftLength && r<rightLength){
            if (leftArray[l]<=rightArray[r]){
                newSortedArray[i]=leftArray[l];
                l++;
            }
            else{
                newSortedArray[i]=rightArray[r];
                r++;
            }
            i++;
        }
        while(l<leftLength){
            newSortedArray[i]=leftArray[l];
            l++;
            i++;
        }while(r<rightLength){
            newSortedArray[i]=rightArray[r];
            r++;
            i++;
        }

    }
}
