
public class Sum_Average {
	public static void main(String[] args) {
		int[] score = {100, 90, 80, 70, 60};
		float average = 0f;
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
		}
		
		average = sum/(float)score.length;
		
		System.out.printf("점수의 총합은  %d입니다." ,sum);
		System.out.println();
		System.out.printf("점수의 평균은  %f입니다." ,average);
	}
}