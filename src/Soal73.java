public class Soal73 {
    public static void main(String[] args) {
        for (int i =1; i<= 4;i++) {
            for (int j =1;j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++) {
            for (int j=i;j<=3;j++) {
                System.out.print("  ");
            }for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
