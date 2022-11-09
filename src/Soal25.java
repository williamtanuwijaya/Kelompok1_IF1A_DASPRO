public class Soal25 {
    public static void main(String[] args) {
        for(int i=8;i>=1;i--) {
            if (i == 2 || i == 5 || i == 6) {
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
