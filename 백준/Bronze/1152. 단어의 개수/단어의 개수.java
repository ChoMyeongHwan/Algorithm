import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String s = sc.nextLine();
		sc.close();
 
		// st 에 공백을 기준으로 나눈 토큰들을 st 에 저장
		StringTokenizer st = new StringTokenizer(s," ");
		
		// countTokens() 는 토큰의 개수를 반환
		System.out.println(st.countTokens());			
	}
}