package Aula1005_Array;

import java.util.Scanner;

public class A_10_05_Matriz 
{

	public static void main(String[] args) 
	{
		
		Scanner input =new Scanner(System.in);
		//Inserir variável do tipo constante
		final int L=2,C=3;
		
		int[][] N=new int[L][C];
		int CB10=0,CL10=0,C10=0,i,j;
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("\nInsira um número: ");
				N[i][j]=input.nextInt();
				
				if(N[i][j]>10)
				{
					CB10++;
					System.out.println(""+N[i][j]+" é maior do que 10");
				}
				else if(N[i][j]==10)
				{
					C10++;
					System.out.println("\nVocê inseriu o valor 10");
				}
				else
				{
					CL10++;
					System.out.println(""+N[i][j]+" é menor do que 10");
				}
			}
			System.out.println("\nA quantidade de números maiores do que 10 é "+CB10);
			System.out.println("\nA quantidade de vezes que você digitou 10 é "+C10);
			System.out.println("\nA quantidade de números menores do que 10 é "+CL10);
			
		}
			
	}

}
