class Car {
    public String color;
    public int speed;

    protected void upSpeed(int value) {
	speed = speed + value;
    }

    protected void downSpeed(int value) {
    speed = speed - value;
    }

    protected String getColor() {
	return color;
    }

    protected int getSpeed() {
	return speed;
    }

    protected void setColor(String color) {
	this.color=color;
    }

    protected void setSpeed(int speed) {
	this.speed=speed;
    }
    Car() 
    {
    	color = "빨강";
    	speed = 0;
    }
    
}    

public class EX11 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		myCar1.color = "빨강";
		myCar1.speed = 0;
		
		myCar2.setColor("파랑");
		myCar2.setSpeed(30);
		
		
		System.out.println("자동차의 색상은 " + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km 입니다.");
	}
}
