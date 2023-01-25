/**
 * Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
 * Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
 * *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
 * Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
 * *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 * **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 */
public class homeTask02 {
    public static String reverseRecurs(String str)      // Метод реверсирования строки в Java с использованием рекурсии
    {
        if (str == null || str.equals("")) {      // базовый случай: если строка нулевая или пустая
            return str;
        }
        // изолируем первый символ и повторяем для оставшейся строки
        return reverseRecurs(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        // 1 задача

        String s = "qwerty";
        String e = "qwert";
        int a = 3;
        int b = 56;
        StringBuilder builder1 = new StringBuilder(s);
        StringBuilder builder2 = new StringBuilder(e);
        System.out.println(builder1.toString().contains(builder2.toString()));

        // 2 Задача

        builder1.reverse();
        builder2.reverse();
        System.out.println(builder1.toString().contains(builder2.toString()));

        // 3 задача
        System.out.println(reverseRecurs(s));

        // 4 задача

        builder1.delete(0,builder1.length());               // Удаление от 0 до последнего
        builder1.append(a).append(" + ").append(b).append(" = ").append(a+b);
        System.out.println(builder1);

        builder2.replace(0, builder2.length(), "");  // Замена пустой строкой
        builder2.append(a + " - " + b +" = " + (a-b));         // одно добавление
        System.out.println(builder2);

        builder1.delete(0,builder1.length());                  // Удаление от 0 до последнего
        builder1.append(a).append(" * ").append(b).append(" = ").append(a*b);
        System.out.println(builder1);

        builder1.delete(0,builder1.length());                  // Удаление от 0 до последнего
        builder1.append(a).append(" / ").append(b).append(" = ").append((double)a/b);
        System.out.println(builder1);

        // 5 задача

        int ind = builder1.indexOf("=");  // Находим индекс
        builder1.deleteCharAt(ind);       // Удаляем
        builder1.insert(ind,"равно"); // вставляем слово равно
        System.out.println(builder1);

        // 6 задача

        // в String.replace() меняем знаки а в StringBuilder.replace() меняем весь текст
        builder2.replace(0,builder2.length(),builder2.toString().replace(" = ", " равно "));
        System.out.println(builder2);

        // 7 Задача

        builder1.delete(0,builder1.length());
        long begin = System.currentTimeMillis(); // Время начало
        s = "";
        for (int i = 0; i < 100_000; i++) {
            s+= "=";
        }
        long end = System.currentTimeMillis(); // Время конец

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            builder1.append("=");
        }
        long end1 = System.currentTimeMillis();

        System.out.println(end-begin);   // вывод времени
        System.out.println(end1-begin1);
    }
}
