package Lesson29;
//Bohdan Tymchuk
public class Main {// Я делаю практическ4ую
    public static void main(String[] args) {
        int max = (int) Double.NEGATIVE_INFINITY;//создаем макс число
        int min = (int) Double.POSITIVE_INFINITY;//создаем мин число
        int[] a = {11, 2, 2, 0, 31, 7, 93, 1, 7};//<-- массив
        for (int i = 0, n = a.length; i < n; i++) {//цэто цикл
            if (a[i] % 2 == 0 & a[i] > max) {//первое условие, если число парное
                max = a[i];//присваиваем макс число

            }
            System.out.println(max);//выводим это число
            if (a[i] % 2 != 0 & a[i] < min) {//второе условие, если число непарное
                min = a[i];//присваиваем мин число

            }
            System.out.println(min);//выводим это число

        }
    }//Апплодисметны!!!
}