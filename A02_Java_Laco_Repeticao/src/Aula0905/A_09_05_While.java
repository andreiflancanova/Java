package Aula0905;

import java.util.Scanner;

public class A_09_05_While {

	public static void main(String[] args) {
		// Declara??o de Vari?veis
		int N,SumN=0,QuantN=0;
		float MedN=0;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("\nInsira um n?mero: ");
		N=input.nextInt();
		
		while(N!=0)
		{
			SumN+=N;
			QuantN++;
			System.out.println("\nInsira um novo n?mero. Se quiser parar, digite 0: ");	
			N=input.nextInt();
		}
		
		if(QuantN==0)
		{
			System.out.println("\nN?o ? poss?vel realizar uma divis?o por 0 ");
		}
		else
		{
			MedN=(float)SumN/QuantN;
			System.out.printf("\nA quantidade de n?meros lidos foi de: %d",QuantN);
			System.out.printf("\nA soma dos n?meros lidos foi de: %d",SumN);
			System.out.printf("\nA m?dia dos n?meros lidos foi de: %.2f",MedN);
		}
	}

}
