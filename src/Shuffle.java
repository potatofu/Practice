
public class Shuffle {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i;
			System.out.print(num[i]);
		}
		
		int j = 0;
		System.out.println();
		for(int i=0; i<num.length; i++) {
			j = (int)(Math.random()*10);
			int tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
