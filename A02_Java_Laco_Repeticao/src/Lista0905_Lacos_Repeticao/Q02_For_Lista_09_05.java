package Lista0905_Lacos_Repeticao;

import java.util.Scanner;

public class Q02_For_Lista_09_05 
{

	public static void main(String[] args) 
	{
		// Declara��o de Vari�veis
		int N,x,QPar=0,QImpar=0;

		//Estrutura para leitura de dados --> Scanner
		Scanner input =new Scanner(System.in);
		
		//Loop For de 10 n�meros
		for (x=1;x<=10;x++)
		{
			System.out.println("\nInsira um n�mero inteiro positivo: ");
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
		System.out.println("\nA quantidade de n�meros pares � "+QPar);
		System.out.println("\nA quantidade de n�meros �mpares � "+QImpar);
	}
}
