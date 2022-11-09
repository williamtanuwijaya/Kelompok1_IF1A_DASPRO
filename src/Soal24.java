public class Soal24 {
    public static void main(String[] args) {
        for(int i=8;i>=1;i--) {
            if (i == 3 || i == 4 || i == 7 || i == 8) {
                for (int j=i;j>=1;j--) {
                    System.out.print(i);
                }
            }else {
                for (int j=i;j>=1;j--) {
                    System.out.print(j);
                }
            }
        }
    }
}
