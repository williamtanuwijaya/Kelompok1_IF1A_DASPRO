public class Soal52 {
    public static void main(String[] args) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.print("* ");
                if(i==j) {
                    break;
                }else if( (i+j)==8) {
                    break;
                }
            }System.out.println();
        }
    }
}
