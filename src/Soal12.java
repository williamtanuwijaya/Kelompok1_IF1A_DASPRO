public class Soal12 {
    public static void main(String[] args) {
        int a = 0;
        int i = 1;
        while(i <= 10) {

            a = a+i;
            if (i == 10) System.out.print(i + " = ");
            else System.out.print(i + " + ");
            i++;
           }
        System.out.print(a);
    }
}
