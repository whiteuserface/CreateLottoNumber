package LottoNumCreater;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;
public final class Lotto {
	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		int[] arr = new int[6];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = rand.nextInt(45);
				
			for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
					
				}	
			
			
//			System.out.println(arr[i]);
		}
			
		int[] j = new int[6];
		System.out.println("로또 번호");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"번째 : "+arr[i]);
		}
		
		
		Arrays.sort(arr);
		System.out.println("정렬한 번호");
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		
	}
}
