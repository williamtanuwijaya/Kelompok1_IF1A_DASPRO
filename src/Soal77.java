public class Soal77 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ;i++) {

            for(int j=1;j <=8 ; j++) {
                if (i == 1|| i == 6 || j == 1|| j == 8){
                    System.out.print("O ");
                }else {
                    System.out.print("* ");
                }


            }
            System.out.println();
        }
    }
}
