package model;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		double arr[] = new double[5];
		for(int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			//arr[i] = sc.nextDouble();
			arr[i] = Float.parseFloat(sc.nextLine());
		}
		
		double media = 0;
		for(int i = 0; i < arr.length; i++) {
			media += arr[i];
		}
		media /= arr.length;
		String msg = String.format("Media = %f", media);
		System.out.println(msg);
	}
}
