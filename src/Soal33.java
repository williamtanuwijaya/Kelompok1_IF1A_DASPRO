public class Soal33 {
    public static void main(String[] args) {
        int j = 1;
        for(int i=0;i<=34;i+=j) {
            j = j + i;
            if (i == 34)break;
            System.out.print(i + " ");
            System.out.print(j + " ");
        }
    }
}
