package Lista0905_Lacos_Repeticao;

import java.util.Scanner;

public class Q06_DoWhile_Lista_09_05 
{
	/*
	 	Escrever um programa que receba v?rios n?meros inteiros no teclado. E no
		final imprimir a m?dia dos n?meros m?ltiplos de 3. Para sair digitar 0.
	 */
	public static void main(String[] args) 
	{
		//Declara??o de Vari?veis
		int N,NT=0,NM3=0,SM3=0;
		float Med3;
		
		//Estrutura para leitura de dados --> Scanner
		Scanner input = new Scanner(System.in);
		
		//Estrutura Do While
		//Colocar o primeiro input FORA DO "Do While"
		System.out.println("\nOL?! SEJA BEM-VINDO! ");
		System.out.println("\nInsira um n?mero inteiro: ");
		N = input.nextInt();
		do
		{		
			//M?ltiplos de 3
			if(N%3==0)
			{
					NM3++;
					NT++;
					SM3+=N;
					System.out.println("\nEntrada v?lida de M?ltiplo de 3.");
					System.out.println("\nInsira um valor inteiro positivo. Se quiser parar, digite 0.");
					N=input.nextInt();
			}
			else
			{
					NT++;
					System.out.println("\nEntrada v?lida.");
					System.out.println("\nInsira um valor inteiro. Se quiser parar, digite 0.");
					N=input.nextInt();
					
			}
		}
		while(N!=0);
		//Calcular a M?dia dos M?ltiplos de 3
		Med3=SM3/NM3;
		
		//Sa?da de dados
		System.out.printf("\nO n?mero total de n?meros inteiros positivos inseridos foi de %.d n?meros",NT);
		System.out.printf("\nO n?mero total de m?ltiplos de 3 positivos inseridos foi de %.d n?meros",NM3);
		System.out.printf("\nA m?dia dos m?ltiplos de 3 positivos inseridos foi de %.2f n?meros",Med3);
		
	}

}
