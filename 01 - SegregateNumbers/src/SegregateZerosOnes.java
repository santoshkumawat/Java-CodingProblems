/**
 * Given an array consisting of 0's and 1's in random order,
 * the task is to segregate all the 0's to the left side and all the 1's to the right side.
 * The array must be traversed only once to achieve this, ensuring optimal time complexity.
 *
 * Input:  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
 * Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 *
 * With Time complexity.
 */

public class SegregateZerosOnes {
    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,0,1,1,1,0};

        int length = arr.length;

        System.out.println("Before segregation: ");
        for (int i= 0; i<length; i++) {
            System.out.print(arr[i] + ", ");
        }

        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int[] tempArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            if(arr[i] ==0 && leftIndex < rightIndex) {
                tempArr[leftIndex] = arr[i];
                leftIndex++;
            } else if (arr[i] == 1) {
                tempArr[rightIndex] = arr[i];
                rightIndex--;
            }
        }

        System.out.println();
        System.out.println("After segregation: ");
        for (int i= 0; i<tempArr.length; i++) {
            System.out.print(tempArr[i] + ", ");
        }
    }
}

//Time complexity will be O(n), where n is the length of the array.