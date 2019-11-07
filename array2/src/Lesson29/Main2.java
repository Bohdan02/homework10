package Lesson29;
//Bohdan Tymchuk 07/11/2019
public class Main2 {
    public static void main(String[] args) {
        int[] a = {11, -2, 2, 0, -31, 7, 93, -1, 7};
        for (int i = 0, n = a.length; i < n; i++) {
            if (a[i]>0){
                a[i]++;
            }if (a[i]<0){
                a[i]--;
            }
            System.out.println(a[i]);
        }
    }
}