public class Soal21 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--) {
            if (i%2==0) {
                for (int j=i;j>=1;j--) {
                    System.out.print(i + " ");
                }
            }else {
                for (int j=1;j<=i;j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
