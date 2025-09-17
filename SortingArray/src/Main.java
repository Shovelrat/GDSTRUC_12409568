public class Main{
    public static void  main(String[] args) {
        int [] numbers = new int [10];
        numbers[0]=25;
        numbers[1]=-3;
        numbers[2]=5;
        numbers[3]=10;
        numbers[4]=38;
        numbers[5]=62;
        numbers[6]=20;
        numbers[7]=-8;
        numbers[8]=173;
        numbers[9]=65;

        System.out.println ("Before any Sort: ");
        printArrayElements(numbers);

        System.out.println ("\n\nAfter Bubble Sort (DESC): ");
        bubbleSort(numbers);
        printArrayElements(numbers);

        System.out.println ("\n\nAfter Selection Sort (DESC): ");
        selectionSort(numbers);
        printArrayElements(numbers);

    }

    private static void bubbleSort(int[] arr){
        // n-1 iterations
        for(int unsortedIndex = arr.length-1; unsortedIndex > 0; unsortedIndex--) {
            //
            for(int i = 0; i < unsortedIndex; i++) {
                    // arr[i] < arr [i+1] for descending
                    // arr[i] > arr [i+1] for ascending
                if (arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
       // O(N^2)
        // n^2 - 2n + 1 iterations (total)
        // n-1 Iterations
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int smallest = 0;
            //n-1 Iterations
            // arr[i] < arr [smallest] for descending
            // arr[i] > arr [smallest] for ascending
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (arr[i] < arr[smallest]){
                    smallest = i;
                }
            }
            if (smallest != lastUnsortedIndex){
                int temp = arr[smallest];
                arr[smallest] = arr[lastUnsortedIndex];
                arr[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}