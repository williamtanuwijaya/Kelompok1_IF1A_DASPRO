public class Soal81 {
    public static void main(String[] args) {
        for (int i =1; i<=4;i++) {
            for (int j =1;j<=7; j++) {
                if ((j == 7|| j == 6 && i >= 2|| j == 5 && i >=3 || j == 4 && i == 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
