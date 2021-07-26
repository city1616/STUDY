package ex5;

class Star {
	void space() {
		System.out.println("매개변수가 없음");
	}
	void space(int width) {
		System.out.println("정사각형의 넓이 = " + width*width);
	}
	void space(int width, int height) {
		System.out.println("직사각형의 넓이 = " + width*height);
	}
	void space(int width, int height, int depth) {
		System.out.println("직육면체의 넓이 = " + width*height*depth);
	}
	
}

public class Overlo2 {

	public static void main(String[] args) {
		Star st = new Star();
		
		int input[] = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			input[i] = Integer.parseInt(args[i]);
		}
		
		switch(args.length) {
			case 0 :
				st.space();
				break;
			case 1 :
				st.space(input[0]);
				break;
			case 2 :
				st.space(input[0], input[1]);
				break;
			case 3 :
				st.space(input[0], input[1], input[2]);
				break;
			default :
				System.out.println("매개변수가 너무 많습니다.");
				break;
		}
	}

}
