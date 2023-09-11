// 지구에서 가장 가까운 별까지의 거리 계산
public class caltime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double light_speed = 30e4; // final을 이용해 light_speed를 상수로 정의한다.
        double distance = 40e12; //distance를 실수형으로
        
        double secs; //secs를 실수형으로
        secs = distance/light_speed;//sec는 light_speed분의 distance
        
        double light_year = secs/(60.0*60.0*24.0*365.0); //light_year를 실수형으로
        System.out.println("걸리는 시간은" + light_year + "광년입니다."); //걸리는 시간은 light_year 광년입니다. 출력
	}

}
