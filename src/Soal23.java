public class Soal23 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            if (i == 3 || i == 4 || i == 7 || i == 8) {
                for (int j=1;j<=i;j++) {
                    System.out.print(i);
                }
            }else {
                for (int j=1;j<=i;j++) {
                    System.out.print(j);
                }
            }
        }
    }
}
