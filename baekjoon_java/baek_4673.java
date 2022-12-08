import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class baek_4673 {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		boolean[] check=new boolean[10001];
		for(int i=1;i<10001;i++) {
			int n=d(i);
		
			if(n<10001) {
			check[n]=true;
			}}
		for(int i=1; i<10001; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
		}
	public static int d(int number) {
		int sum=number;
		while(number!=0) {
			sum+=number%10;
			number=number/10;
		}
		return sum;
	}
	
	
	}
	
	