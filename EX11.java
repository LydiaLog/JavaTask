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
    	color = "����";
    	speed = 0;
    }
    
}    

public class EX11 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		myCar1.color = "����";
		myCar1.speed = 0;
		
		myCar2.setColor("�Ķ�");
		myCar2.setSpeed(30);
		
		
		System.out.println("�ڵ����� ������ " + myCar2.color + "�̸�, ���� �ӵ��� " + myCar2.speed + "km �Դϴ�.");
	}
}
