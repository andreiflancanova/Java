package Lista0905_Lacos_Repeticao;

import java.util.Scanner;

public class Q02_For_Lista_09_05 
{

	public static void main(String[] args) 
	{
		// Declaração de Variáveis
		int N,x,QPar=0,QImpar=0;

		//Estrutura para leitura de dados --> Scanner
		Scanner input =new Scanner(System.in);
		
		//Loop For de 10 números
		for (x=1;x<=10;x++)
		{
			System.out.println("\nInsira um número inteiro positivo: ");
			N=input.nextInt();
			if(N%2==0)
			{
				QPar++;
			}
			
			else
			{
				QImpar++;
			}
		}	
		System.out.println("\nA quantidade de números pares é "+QPar);
		System.out.println("\nA quantidade de números ímpares é "+QImpar);
	}
}
