public class Soal54 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for (int j=1;j<=7;j++) {
                if (j==4 || ((j==1||j==7) && i<=1) || ((j==2 || j== 6) && (i<=2)) || ((j==3 || j==5) && (i<=3))) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
