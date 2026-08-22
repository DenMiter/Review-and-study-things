package Recursion.MiniTasks;

public class MiniTasks {

    public static void main(String[] args) {
        //printNums(5);
    }

    // вывод чисел от 1 до n за счет рекурсии
    public static void printNums(int n) {
        if (n < 1) {
            return; // базовый случай, выход из рекурсии
        }
        printNums(n - 1); // сначала идем к меньшему числу
        System.out.print(n + " "); // печатаем на обратном пути
    }

    ////////

    //


}
