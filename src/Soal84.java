public class Soal84 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=6;j++) {
                if((i+j)==7) {
                    System.out.print("* ");
                }else if(i==j) {
                    System.out.print("* ");
                }else {
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
}
