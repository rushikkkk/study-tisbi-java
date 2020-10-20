package homework1;
import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        Random random = new Random(); // создаем объект рандом для генерации случайных чисел
        int [] number = new int [10]; //создаем массив number с длинною 10
        for (int i = 0; i < 10; i++){ // используем цикл for для перебора массива number
            number[i] = random.nextInt(10)* 5; // Генерируем число от 0 до 10 и добовляем это число в массив

        }
       // System.out.println(number[5] +"это я"); // Выводим шестой элемент массива
        int y = 1;
        for (int b: number){ //Перебираем содержимое массива для печати
            System.out.println(y++ +". "+ b); // Печатаем массив

        }

    }
}
