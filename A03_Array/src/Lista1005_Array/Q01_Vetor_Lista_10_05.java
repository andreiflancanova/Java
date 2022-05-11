package Lista1005_Array;

import java.util.Scanner;
import java.util.Arrays;

public class Q01_Vetor_Lista_10_05 
{
/*	ENUNCIADO
	1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
	O programa deve executar os seguintes passos: 
	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
	(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores
	das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
	(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
	(d) Mostre na tela cada valor do vetor A, um em cada linha.

 
 */
	public static void main(String[] args) 
	{
		// Classe Scanner para Leitura de Dados
		Scanner input =new Scanner(System.in);
		
		// Declara��o de Vari�veis
			//Vetor A com 6 entradas
			int []A ={1,0,5,-2,-5,7};
			int i,SumA=0;
			//Imprimindo o vetor A
				//Usando for
				System.out.println("Impress�o do Vetor Inicial - Comando For:");
				//Loop For de Impress�o dos dados na tela
				for(i=0;i<A.length;i++)
				{
					if (i==(A.length)-1)
					{
						System.out.print(""+A[i]+"]");
					}

					else if (i==0)
					{
						System.out.print("["+A[i]+", ");
					}

					else
					{
						System.out.print(""+A[i]+", ");
					}
				}
				//Usando Arrays.toString
				System.out.println("\nImpress�o do Vetor Inicial - Comando Arrays.toString: ");
				System.out.print(Arrays.toString(A));
				//Loop For de C�lculos
				for (i=0;i<A.length;i++)
				{
					if (i==0 || i==1 || i==5)
					{
						SumA+=A[i];
					}
					else if (i==3)
					{
						A[i]=100;
					}
				}
				System.out.println("\nA soma dos valores de A[0],A[1] e A[5] resulta em "+SumA);
				System.out.println("\nImpress�o do Vetor Final - Comando Arrays.toString: ");
				System.out.println(Arrays.toString(A));
				
				//Loop For com dados separados por linha
				System.out.print("\nImpress�o do Vetor Final - For: ");
				for(i=0;i<A.length;i++)
				{
						System.out.print("\n"+A[i]);
				}
	}

}
