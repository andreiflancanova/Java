package Lista0905_Lacos_Repeticao;

import java.util.Scanner;

public class Q04_While_Lista_09_05 
{

	/*
	 	Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre:
		- o número de pessoas calmas;
		- o número de mulheres nervosas;
		- o número de homens agressivos;
		- o número de outros calmos;
		- o número de pessoas nervosas com mais de 40 anos;
	 */
	public static void main(String[] args) 
	{
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contnbc=0,contpn40=0,contpc18=0,x=1;
		
		Scanner leia = new Scanner (System.in);
		
		while(x<=150)
		{
			//Idade
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			
			while(idade<1 || idade>130)
			{
				System.out.println("\nIdade inválida! ");
				System.out.println("\nPor favor, insira um valor válido ");
				idade=leia.nextInt();
			}
			//Gênero
			System.out.println("\nInforme o gênero com o qual você se identifica ");
			System.out.println("\n1 - Masculino");
			System.out.println("\n2 - Feminino");
			System.out.println("\n3 - Não-Binário");
			
			genero=leia.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nIdade inválida! ");
				System.out.println("\nPor favor, insira um valor válido ");
				genero=leia.nextInt();
			}
			
			//Fator Psicológico
			System.out.println("\nInforme o seu fator psicológico ");
			System.out.println("\n1 - Pessoa Calma");
			System.out.println("\n2 - Pessoa Nervosa");
			System.out.println("\n3 - Agressiva");
			fp=leia.nextInt();
			System.out.println("\n----------------------------------------------------------");
			
			while(fp<1 || fp>3)
			{
				System.out.println("\nIdade inválida! ");
				System.out.println("\nPor favor, insira um valor válido ");
				fp=leia.nextInt();
			}
			
			// o número de pessoas calmas;
			if (fp==1)
			{
				contpc++;
			}
			
			// o número de mulheres nervosas;
			if (fp==2 && genero==2)
			{
				contmn++;
			}
			// o número de homens agressivos;
			if (fp==3 && genero==1)
			{
				contha++;
			}
			// o número de não-binários calmos;
			
			if (fp==1 && genero==3)
			{
				contnbc++;
			}
			// o número de pessoas nervosas com mais de 40 anos;
			if (fp==1 && idade>40)
			{
				contpn40++;
			}
			
			// o número de pessoas calmas com menos de 18 anos;
			if (fp==1 && idade<18)
			{
				contpc18++;
			}
			
		x++;
		}
		System.out.println("\n O número de pessoas calmas é de "+contpc);
		System.out.println("\n O número de mulheres nervosas é de "+contmn);
		System.out.println("\n O número de homens agressivos é de "+contha);
		System.out.println("\n O número de não-binários calmos é de "+contnbc);
		System.out.println("\n O número de pessoas nervosas com mais de 40 anos é de "+contpn40);
		System.out.println("\n O número de pessoas calmas com menos de 18 anos é de "+contpc18);
	}
}
