public class Soal72 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for(int j=2;j<=i;j++) {
                System.out.print("  ");
            }for(int j=i;j<=4;j++) {
                System.out.print("* ");
            }System.out.println();
        }for(int k=1;k<=4;k++) {
            System.out.print("* ");
        }
    }
}
