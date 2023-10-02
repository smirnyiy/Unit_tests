package seminar_1;

public class task2 {

    // написать unit-test где нужно исправить код так, чтобы метод не выбрасывал ошибку.
    public static void main(String[] args) {
        assertConditionB();

    }

    public static void assertConditionB() {
        int x = -1;
        assert x >= 0;
    }
}

