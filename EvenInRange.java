import java.io.*;

class EvenInRange {
	public static void main (String[] args) throws IOException {
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	String[] str = reader.readLine().split(" ");
	int low=Integer.parseInt(str[0]);
	int upper= Integer.parseInt(str[1]);
	for(int i=low+1;i<upper;i++){
	    if(i%2==0){
	    System.out.print(i+" ");}
	}
	}
}