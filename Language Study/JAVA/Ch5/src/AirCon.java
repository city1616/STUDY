
class AirCon {
	//변수정의 
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//메소드 정의 
	void powerOn() {
		System.out.println("power on");
	}
	
	void powerOff() {
		System.out.println("power off");
	}
	
	void tempUp() {
		temp++;
	}
	
	void tempDown() {
		temp--;
	}
	
}
