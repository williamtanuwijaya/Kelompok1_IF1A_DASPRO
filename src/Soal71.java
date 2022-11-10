public class Soal71 {
    public static void main(String[] args) {
        int space = 9;
        for(int i=1;i<=6;i++) {
            if (i==6) {
                for (int L = 1;L<=i-1;L++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int L = 1;L<=i;L++) {
                    System.out.print("* ");
                }
            }
            for (int S = 1;S <= space;S++) {
                System.out.print("  ");
            }
            for (int R = 1;R<=i;R++) {
                System.out.print("* ");
            }
            space = space - 2;
            System.out.println();
        }
    }
}
