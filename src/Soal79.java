public class Soal79 {
    public static void main(String[] args) {
        for(int i=1;i<=13;i++) {
            for(int j=7;j<=i;j++) {
                if (i>7)System.out.print("* ");
            }
            for(int j=i;j<=7;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
