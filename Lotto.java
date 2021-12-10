package LottoNumCreater;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.Random;
public final class Lotto {
	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		int[] arr = new int[6];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = rand.nextInt(45); //랜덤 숫자 0~45까지 마구잡이로 넣는 구간
				
			for(int j=0; j<i; j++) { //중복되면 i--를 하는 구간
					if(arr[i] == arr[j]) { 
						i--;
						break;
					}
					
				}	
			
			
//			System.out.println(arr[i]);
		}
		LocalDateTime currentDateTime = LocalDateTime.now();  //현재 날짜와 시간 함수객체생성
		
		System.out.println(currentDateTime); //현재 날짜와 시간 출력
		
			
		int[] j = new int[6]; //로또 번호 출력
		System.out.println("로또 번호");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"번째 : "+arr[i]);
		}
		
		
		Arrays.sort(arr); //배열의 값을 올림차순으로 재정렬(Arrays 활용)
		System.out.println("정렬한 번호");
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		
	}
}
