public class Soal50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ;i++) {
            for(int j=1;j <= 6 ; j++) {
                if( i == 1 || i == 3 || i == 5) {
                    System.out.print("o ");
                }else
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
