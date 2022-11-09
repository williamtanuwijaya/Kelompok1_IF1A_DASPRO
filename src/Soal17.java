public class Soal17 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--) {
		  for(int j=i;j>=1;j--) {
			 System.out.print(j+" ");
			   if (i+j==0){
				break;
			}
		}
	  }
    }
}
