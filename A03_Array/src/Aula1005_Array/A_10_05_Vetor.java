package Aula1005_Array;

import java.util.Scanner;

public class A_10_05_Vetor {

	public static void main(String[] args) {
		// Declara��o de Vari�veis
		int y;
		Scanner input =new Scanner(System.in);
		y=input.nextInt();
		
		float[] Med=new float [y];
		float N1,N2,N3,SumMed=0,MedG;
		int x;
		
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nInsira a primeira nota: ");
			N1=input.nextFloat();
			
			System.out.println("\nInsira a primeira nota: ");
			N2=input.nextFloat();
			
			System.out.println("\nInsira a primeira nota: ");
			N3=input.nextFloat();
			
			Med[x]=(N1+N2+N3)/3;
			System.out.printf("\nM�dia: %.2f",Med[x]);
			
			SumMed+=Med[x];
		}
		MedG=SumMed/x;
		System.out.printf("\nM�dia geral: %.2f",MedG);
		
		
	}

}
