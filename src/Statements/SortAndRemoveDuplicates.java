package Statements;

public class SortAndRemoveDuplicates {

        public static void main(String[] args) {
            int arr[] = {1, 3, 8, 3, 4, 1};

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int index = arr[i];
                        arr[i] = arr[j];
                        arr[j] = index;
                    }
                }
            }

            int[] sortedArray = uniqueArr(arr);

            for (int i = 0; i < sortedArray.length; i++) {
                System.out.println(sortedArray[i]);
            }
        }

        public static int[] uniqueArr(int[] arr) {
            int[] newArray = new int[arr.length];
            int newIndex = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    newArray[newIndex++] = arr[i];
                }
            }
            newArray[newIndex++] = arr[arr.length - 1];

            int[] finalArray = new int[newIndex];
            System.arraycopy(newArray, 0, finalArray, 0, newIndex);

            return finalArray;
        }
    }

