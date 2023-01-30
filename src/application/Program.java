package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinho: ");
		int barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f \n", Bill.feeding(beer, barbecue, softDrink));
		
		if (Bill.cover(Bill.feeding(beer, barbecue, softDrink)) == 0.00)
		{
			System.out.println("Isento de Couvert");
		}
		else
		{
			System.out.printf("Couvert = R$ %.2f \n", Bill.cover(Bill.feeding(beer, barbecue, softDrink)));
		}
		
		System.out.printf("Ingresso = R$ %.2f \n", Bill.ticket(gender));
		
		System.out.println();
		double conta = Bill.feeding(beer, barbecue, softDrink) + Bill.cover(Bill.feeding(beer, barbecue, softDrink)) + Bill.ticket(gender);
		System.out.printf("Valor a pagar = R$ %.2f \n", conta);

		sc.close();
	}
}
