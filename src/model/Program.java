package model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {
	
	private static void inputScanner() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = in.nextLine();
		
		System.out.println(nome);
	}
	
	private static void bufferedInput() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o seu nome: ");
		String nome = in.readLine();

		System.out.println(nome);
	}
	
	private static void inputsTypesScanner() {
		Scanner sc = new Scanner(System.in);
		
		String aToken = sc.next();
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		String linha = sc.nextLine();
		
		System.out.println(aToken);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(linha);
	}
	
	public static void main(String[] args) {
		/*
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				'i', 'n', 'a', 't', 'e', 'd' };
				char[] copyTo = new char[7];
				System.arraycopy(copyFrom, 2, copyTo, 0, 7);
				System.out.println(new String(copyTo));
		*/
		
		//inputsTypesScanner();
		
	}
}