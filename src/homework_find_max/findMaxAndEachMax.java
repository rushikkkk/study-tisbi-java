package homework_find_max;
import java.util.Random;
public class findMaxAndEachMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        // Заполняем массив
        for (int num = 0; num < array.length; num++) {
            array[num] = random.nextInt(100);
            System.out.print(array[num] + " ");
            }
        System.out.println("\n Отсортированный масив");
        int max = 0;
        int eachMax = 0;
        for (int b = 0; b < array.length; b++) {
            if (array[b] > max) {
                eachMax = max;
                max = array[b];
            } else if (array[b] > eachMax && array[b] != max) {
                eachMax = array[b];
            }
        }
        if (eachMax != max) {
            System.out.println("Второй по максимальности элемент в массиве: " + eachMax);
        } else {
            System.out.println("Второго по максимальности элемента нет");
        }
        System.out.println("Максимальный элемент в массиве: " + max);
    }
}

