public class Soal30 {
    public static void main(String[] args) {
        for(int i=1;i<=25;i+=3) {
            System.out.print(i + " ");
            if (i == 25)break;
            i = i + 1;
            System.out.print(i + " ");
            i = i + 2;
            System.out.print(i + " ");
        }
    }
}
