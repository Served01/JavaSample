import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld5 { 
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) throws IOException {  //번지: 3000 이라고 가정, 구로구
		
		//public final class Scanner
		//extends Object 
		//implements Iterator<String>, Closeable
		
		System.out.print("인사말을 입력해 주세요: ");
		String Hello = sc.nextLine();
		
		//정수형태는 nextInt로 하면됨. 즉 여러가지 형식이 가능
		//next는 스페이스 이후는 안 나오고 nextLine은 스페이스와 상관없이 다 나옴
		System.out.println("인사말은: " + Hello);
		System.out.println("========= 위에는 Scanner class example =========");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//컴퓨터의 buffer 개념
		//memory의 일부 = buffer = 8192Kbyte = pointer(C언어) = Address(번지)
		//new는 object를 만들어주는 역할을 한다
		System.out.println(br); // Address value
		
		System.out.println("인사말을 입력해 주세요: ");
		String str = br.readLine();
		System.out.println("Buffered 인사말: " + str);
		
	
	} //main method 영역
	
}
// buffer: 임시 기억 장치

