import java.util.Arrays;

public class S2 {
    public static String reverseRecurs(String str)      // Метод реверсирования строки в Java с использованием рекурсии
    {
        if (str == null || str.equals("")) {      // базовый случай: если строка нулевая или пустая
            return str;
        }
        // изолируем первый символ и повторяем для оставшейся строки
        return reverseRecurs(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String s = "qwerty";
        StringBuilder builder = new StringBuilder(s);
        char[] ch = s.toCharArray();     // преоброзование строки в массив символов методом
//        char[] ch = new char[builder.length()];   // преоброзование строки в массив символов циклом
//        for (int i = 0; i < builder.length(); i++) {
//            ch[i] = builder.charAt(i);
//        }
        System.out.println(Arrays.toString(ch));
        System.out.println(reverseRecurs(s));


    }
}
