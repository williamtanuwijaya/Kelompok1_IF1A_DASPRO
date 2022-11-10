import java.io.*;
public class Soal60 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    System.out.print("1 ");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }
}


