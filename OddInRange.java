
import java.io.*;

class OddInRange {
	public static void main (String[] args) throws IOException {
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	String[] str = reader.readLine().split(" ");
	int low=Integer.parseInt(str[0]);
	int upper= Integer.parseInt(str[1]);
	for(int i=low+1;i<upper;i++){
	    if(i%2==1){
	    System.out.print(i+" ");}
	}
	}
}