package Lista1005_Array;

import java.util.Scanner;

public class Q04_Matriz_Lista_10_05 
{
/*
 	4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
	(1) somar as duas matrizes 
	(2) subtrair a primeira matriz da segunda 
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes 
	Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada.
	Na terceira op��o o valor da constante deve ser lido e o resultado 
	da adi��o da constante deve ser armazenado na pr�pria matriz.

 */
	public static void main(String[] args) 
	{
		float[][] M1=new float [2][2];
		float[][] M2=new float [2][2];
		float[][] M3=new float [2][2];
		float N;
		int i,j;
		int op;
		
		
		Scanner input=new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nInsira os valores da matriz 1: ");
				M1[i][j]=input.nextFloat();
				System.out.println("\nInsira os valores da matriz 2: ");
				M2[i][j]=input.nextFloat();	
			}
			
		}
		do
		{
			System.out.println("\nMENU DE OP��ES: ");
			System.out.println("\n1 - Somar as Duas Matrizes");
			System.out.println("\n2 - Subtrair a 1a Matriz da 2a");
			System.out.println("\n3 - Adicionar uma vari�vel �s duas matrizes");
			System.out.println("\n4 - Imprimir as matrizes");
			System.out.println("\n0 - Sair do programa");
			System.out.println("\nDigite sua op��o: ");
			op=input.nextInt();
			
			switch(op)
			{
				case 1://M3=M1+M2
				{
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							M3[i][j]=M1[i][j]+M2[i][j];
							System.out.println("\nMatriz 3: "+M3[i][j]);
						}
					}
				}
				break;
				case 2://M3=M2-M1
				{
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							M3[i][j]=M2[i][j]-M1[i][j];
							System.out.println("\nMatriz 3: "+M3[i][j]);
						}
					}
				}
				break;
				case 3://M[i][j]=M[i][j]+N
				{
				System.out.println("\nInsira o valor do n�mero desejado");
				N=input.nextFloat();
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							M1[i][j]+=N;
							M2[i][j]+=N;
							System.out.println("\nMatriz 1: "+M1[i][j]);
							System.out.println("\nMatriz 2: "+M2[i][j]);
						}
					}
				}
				break;
				case 4:
				{
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.println("\nMatriz 1: "+M1[i][j]);
							System.out.println("\nMatriz 2: "+M2[i][j]);
						}
					}
				}
				break;
				case 0:
				{
					System.out.println("\nMuito obrigado por utilizar o nosso programa!");
				}
				break; //Para que o c�digo n�o execute o "default"
				default:
				{
					System.out.println("\nOp��o Inv�lida!");
				}
			}
		}
		while(op!=0);
	}

}
