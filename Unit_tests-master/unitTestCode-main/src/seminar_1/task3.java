package seminar_1;

public class task3 {
//    Задание №3
//    Попробуем сделать наш код более надежным, предотвратив переполнение переменной.
//    Исправьте метод сложения двух чисел так, чтобы при переполнении переменной выбрасывалось
//    предупреждение.

    public static void main(String[] args) {
    System.out.println(sum(Integer.MAX_VALUE, 2));
    }
    public static int sum(int a, int b) {
//        assert a + b <= Integer.MAX_VALUE : "Переполнение";
        assert a < Integer.MAX_VALUE && b < Integer.MAX_VALUE: "Переполнение";
        return a + b;

    }
}