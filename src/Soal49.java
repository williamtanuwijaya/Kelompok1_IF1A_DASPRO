public class Soal49 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++) {
                if(j-2==i) {
                    break;
                }
                System.out.print("* ");

            }System.out.println("*");
        }System.out.println();
    }
}
