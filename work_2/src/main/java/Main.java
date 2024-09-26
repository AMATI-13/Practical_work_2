public class Main {
    // Метод для генерации случайного массива
    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        long seed = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            seed = (seed * 214013L + 2531011L) & 0xFFFFFFFFL;
            array[i] = (int)(seed >> 16) & 0x7FFF;
        }
        return array;
    }

    // Метод сортировки вставками
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 10;


        int[] randomArray = generateRandomArray(n);


        System.out.println("Исходный массив:");
        printArray(randomArray);


        insertionSort(randomArray);


        System.out.println("Отсортированный массив:");
        printArray(randomArray);
    }
}
