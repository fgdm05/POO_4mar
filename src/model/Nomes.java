package model;
import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		int n = 3;
		int idades[] = new int[n];
		String nomes[] = new String[n];
		
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um nome:");
			nomes[i] = s.nextLine();
			
			System.out.println("Digite uma idade:");
			idades[i] = Integer.parseInt(s.nextLine());
			
		}
		/*
		for(int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite uma idade: ");
			idades[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um nome: ");
			nomes[i] = sc.nextLine();
		}
		*/
		s.close();
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j < n; j++) {
				if(idades[i] < idades[i+1]) {
					int aux = idades[i];
					idades[i] = idades[i+1];
					idades[i+1] = aux;
					
					String auxS = nomes[i];
					nomes[i] = nomes[i+1];
					nomes[i+1] = auxS;
				}
			}
		}
		/*
		for(int i = 0; i < n-1; i++) {
			
			if(idades[i] < idades[i+1]) {
				int aux = idades[i];
				idades[i] = idades[i+1];
				idades[i+1] = aux;
				
				String auxS = nomes[i];
				nomes[i] = nomes[i+1];
				nomes[i+1] = auxS;
			}
		}*/
		
		
		System.out.println("Lista de pessoas em ordem decrescente de idade: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Idade: " + idades[i]);
			System.out.println("Nome: " + nomes[i]);
		}
		
	}
}
