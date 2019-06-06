import java.io.*;

class Multiple {
	public static void main (String[] args) throws IOException {
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine());
	
	for(int i=1;i<=n;i++){
	    	
	    System.out.print(n*i+" ");}
	}
}