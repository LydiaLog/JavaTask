// �������� ���� ����� �������� �Ÿ� ���
public class caltime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double light_speed = 30e4; // final�� �̿��� light_speed�� ����� �����Ѵ�.
        double distance = 40e12; //distance�� �Ǽ�������
        
        double secs; //secs�� �Ǽ�������
        secs = distance/light_speed;//sec�� light_speed���� distance
        
        double light_year = secs/(60.0*60.0*24.0*365.0); //light_year�� �Ǽ�������
        System.out.println("�ɸ��� �ð���" + light_year + "�����Դϴ�."); //�ɸ��� �ð��� light_year �����Դϴ�. ���
	}

}
