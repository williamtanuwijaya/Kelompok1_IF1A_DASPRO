public class Soal56 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 3 ; i++) {
            for (int j = 1 ; j <=4 ; j++) {
                if (j ==1 || j == 3) {
                    System.out.print("+ ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
