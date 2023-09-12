public class Box {
  	int width, length, height;
	int volume;
  
	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
  
	Box whosLargest(Box box1, Box box2) {
		if (box1.volume > box2.volume)	//만약 이 조건일때
			return box1;	// box1의 값을 반환
		else					// 위의 조건이 아닐 때
			return box2;			// box2의 값을 반환
	}
  }
