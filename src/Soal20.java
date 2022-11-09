public class Soal20 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--) {
            if (i%2==1) {
                for (int j=i;j>=1;j--) {
                    System.out.print(i + " ");
                }
            }else {
                for (int j=i;j>=1;j--) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
