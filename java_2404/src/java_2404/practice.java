package java_2404;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println("반지름을 입력하세요>>");
		Scanner scanner = new Scanner (System.in);
		int radius = scanner.nextInt();
//		float area = scanner.nextFloat();
		float area = 3.14f * (radius*radius);
		
		
		System.out.println("원의 면적은 "+area+"입니다");
//		scanner.close();
		System.out.println("가로,세로 길이를 입력하세요>>");
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		System.out.println("사각형의 면적은 "+w*h+"입니다.");
		
	}
	
	
	

}
