public class Soal66 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for(int j = 1; j<= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            if (i == 5-1) {
                System.out.println();
                for (int j = 0; j < i+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
