public class Soal12 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a = a+i;
            if (i == 10) System.out.print(i + " = ");
            else System.out.print(i + " + ");
           }
        System.out.print(a);
    }
}
