public class Soal80 {
    public static void main(String[] args) {
        for (int i =1; i<=4;i++) {
            for (int j =1;j<=7; j++) {
                if ((j == 1|| j == 2 && i >= 2|| j == 3 && i >= 3 || j == 4 && i == 4)) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
