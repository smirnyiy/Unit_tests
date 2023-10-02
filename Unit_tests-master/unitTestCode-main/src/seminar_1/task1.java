package seminar_1;

public class task1 {

//    Давайте представим, что вы работаете над календарным приложением и вам нужно убедиться, что
//    количество выходных в неделе правильно установлено.
//    Исправьте следующий код так, чтобы утверждение было верно и код не выбрасывал ошибку

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");

    }


}