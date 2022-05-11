package Lista1005_Array;

import java.util.Scanner;

public class Q03_Matriz_Lista_10_05 
{
/*
 	
 */
	public static void main(String[] args) 
	{
	/*
	 	3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
	 */
		// Classe Scanner para Leitura de Dados
		Scanner input =new Scanner(System.in);
	
		// Declaração de Variáveis
			//Matriz M 3 x 3
			int i,j;
			int L=3,C=3,CB10=0,CL10=0;
			int [][] M=new int[L][C];
		
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println("\nInsira um número: ");
					M[i][j]=input.nextInt();
					
					if(M[i][j]>10)
					{
						CB10++;
					}
					else
					{
						CL10++;
					}
				}
			}
			System.out.println("\nA quantidade de números maiores que 10 é "+CB10);
			System.out.println("\nA quantidade de números menores ou iguais a 10 é "+CL10);
 	}
}
