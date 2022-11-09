public class Soal15 {
    public static void main(String[] args) {
        for(int i=7;i>=1;i--) {
		for(int j=1;j<=7;j++) {
			System.out.print(i+" ");
			if(i==j) {
				break;
			}
		}
	 }
   }
}
