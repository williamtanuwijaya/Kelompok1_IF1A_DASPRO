public class Soal33 {
    public static void main(String[] args) {
        int j = 1;
        int i=0;
        while(i<=34) {
            j = j + i;
            if (i == 34)break;
            System.out.print(i + " ");
            System.out.print(j + " ");
            i+=j;
        }
    }
}
