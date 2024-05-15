package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Exercicio 01
//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
//		final int PASSWORD = 2002;
//		int typedPass;
//		do{
//			System.out.print("Senha: ");
//			typedPass = sc.nextInt();
//			if(typedPass != PASSWORD)
//				System.out.println("Incorrect password!");
//			else
//				System.out.println("Access is authorized!");
//		}while( typedPass != 2002);
		
//		Exercicio 02
//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
//		double x,y;
//		
//		do {
//			System.out.print("Digite as coordenadas x e y: ");
//			x = sc.nextDouble();
//			y = sc.nextDouble();
//			
//			if( x > 0 && y > 0)
//				System.out.println("Primeiro quadrante");
//			else if ( x < 0 && y > 0  )
//				System.out.println("Segundo quadrante");
//			else if ( x < 0 && y < 0 )
//				System.out.println("Terceiro quadrante");
//			else if ( x > 0 && y < 0 ) 
//				System.out.println("Quarto quadrante");
//			
//		}while( x != 0.0 && y != 0.0 );
		
		
//		Exercicio 03
//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//		exemplo.

//		int option;
//		int accAlcool = 0;
//		int accGasolina = 0;
//		int accDiesel = 0;
//		
//		System.out.println("1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
//		System.out.println("");
//		do {
//			option = sc.nextInt();
//			switch(option) {
//			case 1:
//				accAlcool+=1;
//				break;
//			case 2:
//				accGasolina+=1;
//				break;
//			case 3:
//				accDiesel+=1;
//				break;
//			case 4:
//				System.out.println("MUITO OBRIGAD0!");
//				System.out.println("Álcool: " + accAlcool);
//				System.out.println("Gasolina: " + accGasolina);
//				System.out.println("Diesel: " + accDiesel);
//			}
//			
//		}while(option != 4);
		
//		Exercicio 04
//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//		X, se for o caso.
		
//		int x;
//		do{
//			System.out.print("Digite um inteiro de 1 até 1000: ");
//			x = sc.nextInt();
//		}while(x < 1 || x > 1000);
//		
//		for(int acc = 1; acc <= x; acc++) {
//			if( acc % 2 != 0 )
//				System.out.println(acc);
//		}
		
		
		
		
		sc.close();
	}

}
