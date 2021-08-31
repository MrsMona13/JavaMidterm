package algorithm;

public class Sort {

    long executionTime;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

     public static void main(String[] args) {
     }


    public void selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public void insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }


    public void bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] >= array[min]) {
                    continue;
                }
                min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public void shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        //implement here

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public void bubbleSort() {
    }
}