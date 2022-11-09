import java.io.*;
public class Soal8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int batasbawah=0;
	    int batasatas=0;
	    System.out.print("Masukan batas bawah\t= ");
	    batasbawah=Integer.parseInt(br.readLine());
	    System.out.print("Masukan batas atas\t= ");
	    batasatas=Integer.parseInt(br.readLine());

	    for(int i=batasbawah;i<=batasatas;i++) {
		    if(i%25==0) {
			System.out.println(i);
		   }
	   }
    }
}
