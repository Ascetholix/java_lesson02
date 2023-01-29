public class S1 {
    private static final int a = 45; // инициализация переменной int как константа с final
    public static void main(String[] args) {

        long begin = System.currentTimeMillis(); // Время начало

        String s = "qwerty";
        String str = ""; // Пустая строка
        StringBuilder builder = new StringBuilder(s); // Инициализация стрингбилдер
        str = builder.toString();  // Приоброзовывем в строку
        System.out.println(builder);
        builder.append('!');        // Добавляет знак
        System.out.println(builder);
        System.out.println(builder.indexOf("!")); // возрашает индекс знака
        System.out.println(builder.deleteCharAt(6)); // удажение по индексу

        // 1 задача добовить в StringBuilder 4 вида данных
        int i = 123;
        char c = '!';
        float f = 3.5f;
        boolean b = true;
        String e = "qwerty";
        StringBuilder b1 = new StringBuilder();
        b1.append(i);
        b1.append(c);
        b1.append(f);
        b1.append(e);
        b1.append(b);
        System.out.println(b1);

        // 2 Поверить равно ли две строки
        StringBuilder b2 = new StringBuilder(s); // s = "qwerty"
        StringBuilder b3 = new StringBuilder(e); // e = "qwerty"
        // переводим в toString а потом методом равно проверяем equals()
        System.out.println(b2.toString().equals(b3.toString()));

        // 3 Задача 3 и 56 + - * /
        int a1 = 3;
        int a2 = 56;
        b1.replace(0, b1.length(), String.valueOf(a1)); // Преоброзовать int  в string методом String.valueOf(a1)
        b2.replace(0, b2.length(), String.valueOf(a1-a2)); // Преоброзовать int  в string методом String.valueOf(a2)

        StringBuilder b4 = new StringBuilder();
        b4
                .append(a1)
                .append(" + ")
                .append(a2)
                .append(" = ")
                .append(a1 + a2); // добавлениями и каждую коментировать

        System.out.println(b4);

        b4.replace(0, b4.length(), "");  // Замена пустой строкой

        b4.append(a1 + " - " + a2 +" = " + (a1-a2));
        System.out.println(b4);

        b4.delete(0, b4.length()); // Удаление от 0 до последнего
        b4.append(a1).append(" * ").append(a2).append(" = ").append(a1 * a2); // добавлениями и строки
        System.out.println(b4);

        b4.delete(0, b4.length()); // Удаление от 0 до последнего
        b4.append(a1).append(" / ").append(a2).append(" = ").append((double) a1 / a2); // добавлениями и символы
        System.out.println(b4);

        // 4 задача поменят знак " = " на текст "равно"
        // в стринг реплейс меняем знаки а в StringBuilder меняем весь текст
        b4.replace(0,b4.length(),b4.toString().replace(" = ", " равно "));
        System.out.println(b4);


        long end = System.currentTimeMillis(); // Время конец
        System.out.println(end-begin);   // вывод времени

    }
}
