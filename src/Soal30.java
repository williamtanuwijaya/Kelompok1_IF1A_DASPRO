public class Soal30 {
    public static void main(String[] args) {
        int i=1;
        while(i<=25) {
            System.out.print(i + " ");
            if (i == 25)break;
            i = i + 1;
            System.out.print(i + " ");
            i = i + 2;
            System.out.print(i + " ");
            i=i+3;
        }
    }
}
