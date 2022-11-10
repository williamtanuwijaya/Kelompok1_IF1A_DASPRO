public class Soal27 {
    public static void main(String[] args) {
        for (int i = 2; i <= 32; i += 10) {
            System.out.print(i + " ");
            if (i > 2 && i <= 31) {
                i = i - 5;
                System.out.print(i + " ");
            }
        }
    }
}
