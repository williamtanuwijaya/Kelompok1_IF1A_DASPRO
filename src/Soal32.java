public class Soal32 {
    public static void main(String[] args) {
        int j = 0;
        for(int i=1;i<=34;i+=j) {
            j = j + i;
            System.out.print(i + " ");
            if (j == 34 || i == 34) break;
            System.out.print(j + " ");
        }
    }
}
