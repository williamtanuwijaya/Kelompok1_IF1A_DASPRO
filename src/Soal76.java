public class Soal76 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ;i++) {

            for(int j=1;j <=8 ; j++) {
                if (i == 6 || j == 1){
                    System.out.print("0 ");
                }else {
                    System.out.print("* ");
                }


            }
            System.out.println();
        }
    }
}
