package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listOfContribuintes = new ArrayList<>();
 		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("\nDigite os dados do %do contribuinte:\n", i+1);
			System.out.printf("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpendings = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpendings = sc.nextDouble();
			
			listOfContribuintes.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpendings, educationSpendings)); 
 		}
		
		for (int i=0; i<listOfContribuintes.size(); i++) {
			System.out.printf("\nResumo do %do contribuinte:\n", i+1);
			System.out.println(listOfContribuintes.get(i));
		}
		
		/* Com laço for each:
		int i=0;
		for (TaxPayer obj : listOfContribuintes) {
			System.out.printf("\nResumo do %do contribuinte:\n", i+1);
			i++;
			System.out.println(obj);
		} 
		*/
		
		sc.close();
	}
}



































