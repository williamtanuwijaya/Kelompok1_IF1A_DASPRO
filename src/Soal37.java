public class Soal37 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ;i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1) {
                    System.out.print("O ");
                } else if (j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("1 ");
                }

            }
            System.out.print("");
        }
    }
}
