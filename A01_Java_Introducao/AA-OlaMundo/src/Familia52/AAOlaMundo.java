package Familia52;

import java.util.Scanner;

public class AAOlaMundo {
	public static void main(String[] args) 
	{


		//Coment?rios de 01 linha
		/*
 	Coment?rios de
 	mais de 01 linha
		 */

		//Declaracao de variaveis
		double N1,N2,N3,N4,N5,Med;
		int Op;

		//Criar comando Scanner e renomear ele para "leia"
		/*
	O comando "Try" vai "testar" o c?digo para que, caso
	ocorra um erro,	ele mostre para o usu?rio de uma forma
	mais amig?vel, p/ n?o aparecer aqueles erros de programa??o
	para o user final
		 */
		//Leitura de Variaveis
		/*
		 O comando Scanner serve para instanciar o leia
		 
		 */
		Scanner leia1 = new Scanner(System.in);
		{
			System.out.println("\nEntre com a primeira nota: ");
			N1=leia1.nextFloat();

			System.out.println("\nEntre com a segunda nota: ");
			N2=leia1.nextFloat();

			System.out.println("\nEntre com a terceira nota: ");
			N3=leia1.nextFloat();

		}


		/*	System e a classe
		out eh um objeto
		println eh uma classe	*/

		//Calculos
		//Media
		//O concatenador no Java ? o "+" e n?o a ","
		Med=(N1+N2+N3)/3;
		System.out.println("\nM?dia Aritm?tica: "+Med);
		//Altera??es dos tipos de sa?da:
		System.out.printf("\nEntre com a terceira nota:  %2.3f",Med);

		/*
		 O %3 arredonda o valor para 3 casas depois da virgula
		 O .2f mostra 2 casas depois da v?rgula
		 */

		//Uso do if e else
		if(Med>=7 && Med<=10)
		{
			System.out.println("\nAlune Aprovade!");
		}
		else if(Med>=5 && Med<7)
		{
			System.out.println("\nAlune de Exame!");
		}
		else
		{
			System.out.println("\nAlune reprovade!");
		}

		//Opera??es matem?ticas
		//C?lculo de raiz
		N4=Math.sqrt(N2);

		//C?lculo de pot?ncia
		N5=Math.pow(N3, 3);

				//Menu de Op??es
				System.out.println("\nMENU DE ELOGIOS!");
		System.out.println("\n1 - Fam?lia muito compenetrada!");
		System.out.println("\n2 - Fam?lia muito unida!");
		System.out.println("\n3 - Fam?lia muito criativa!");
		System.out.println("\n4 - Fam?lia muito gentil!");
		System.out.println("\nESCOLHA A SUA OP??O");

		Scanner leia2 = new Scanner(System.in);
		Op=leia2.nextInt();

		//Escolha caso no Java ? Switch Case
		switch(Op)
		{
		case 1:
			System.out.println("\n1 - Fam?lia muito compenetrada!");
			break;
		case 2:
			System.out.println("\n2 - Fam?lia muito unida!");
			break;	
		case 3:
			System.out.println("\n3 - Fam?lia muito criativa!");
			break;
		case 4:
			System.out.println("\n4 - Fam?lia muito gentil!");
			break;
		default:
			System.out.println("\nOp??o inv?lida");
		}

	}
}
