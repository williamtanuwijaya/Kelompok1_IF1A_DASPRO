public class Soal19 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) {
            if (i%2==0) {
                for (int j=1;j<=i;j++) {
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
