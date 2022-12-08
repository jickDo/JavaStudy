import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baek_1316 {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int cnt=0;
		int num=Integer.parseInt(br.readLine());
		for(int a=0;a<num;a++) {
			if(check()==true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static boolean check() throws IOException {
		String word=br.readLine();
		int prev=0;
		boolean[] check=new boolean[26];
		for(int i=0; i<word.length();i++) {
			int now=word.charAt(i);
			if(prev!=now) {
				if(check[now-'a']==false) {
					check[now-'a']=true;
					prev=now;
				}
				else if(check[now-'a']==true) {
					return false;
				}
			else if(prev==now) {
				continue;
			}
			}
		}
		return true;
	}
}
