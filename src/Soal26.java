public class Soal26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i += 4) {
            System.out.print(i + " ");
            if (i > 1 && i <= 14) {
                i = i - 2;
                System.out.print(i + " ");
            }
        }
    }
}
