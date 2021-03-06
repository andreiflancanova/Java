package Lista0905_Lacos_Repeticao;

import java.util.Scanner;

public class Q03_While_Lista_09_05 
{
	/*	ENUNCIADO:
		Solicitar a idade de v?rias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99.
	 */
	public static void main(String[] args) 
	{
		//Declara??o de Vari?veis
		int Id,QL21=0,QB50=0,QId=0;
		
		//Estrutura para leitura de dados --> Scanner
		Scanner input =new Scanner(System.in);
		
		System.out.println("\nInsira o valor da idade da pessoa: ");
		Id=input.nextInt();
		
		//Loop While para inserir v?rias idades
		// while(Id<0 &&Id==-99 || Id>120)
		while(Id!=-99)
		{
			if(Id<0 || Id>120)
			{
				System.out.println("\nEntrada INV?LIDA!");
				System.out.println("\nInsira uma idade entre 0 e 120 anos. Se quiser parar, digite -99.");
				Id=input.nextInt();
			}
			else if(Id>=0 && Id<21)
			{
				QL21++;
				System.out.println("\nEntrada v?lida!");
				System.out.println("\nInsira a pr?xima idade. Se quiser parar, digite -99.");
				Id=input.nextInt();
			}
			else if (Id>50 && Id<=120)
			{
				QB50++;
				System.out.println("\nEntrada v?lida!");
				System.out.println("\nInsira a pr?xima idade. Se quiser parar, digite -99.");
				Id=input.nextInt();
			}
			else
			{
				QId++;
				System.out.println("\nEntrada v?lida!");
				System.out.println("\nInsira a pr?xima idade. Se quiser parar, digite -99.");
				Id=input.nextInt();
			}
		}		
		//Impress?o de valores
		System.out.println("\nO n?mero de pessoas com menos de 21 anos ? de "+QL21+" pessoas");	
		System.out.println("\nO n?mero de pessoas com mais de 50 anos ? de "+QB50+" pessoas");
		System.out.println("\nO n?mero de pessoas que n?o se enquadra em nenhuma categoria ? de "+QId+" pessoas");
	}
}
