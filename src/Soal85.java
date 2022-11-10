public class Soal85 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ;i++) {
            for(int j=1;j <= 6 ; j++) {
                if( i == 1 || i == 4 ) {
                    System.out.print("0 ");
                }else if (i == 2 || i== 5){
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }

            }
            System.out.println();
        }
    }
}
