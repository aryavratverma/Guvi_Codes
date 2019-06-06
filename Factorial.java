
import java.io.*;

class Factorial {
	public static void main (String[] args) throws IOException {
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine());
	int aux=1;
	for(int i=1;i<=n;i++){
	    aux=aux*i;	}
	    System.out.println(aux);
	}
}