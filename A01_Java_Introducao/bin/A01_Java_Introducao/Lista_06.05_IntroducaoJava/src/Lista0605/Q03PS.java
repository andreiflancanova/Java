package Lista0605;

import java.util.Scanner;

public class Q03PS
{

	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		int TST,TH,TM,TS;
		
		//Ler dura��o da tarefa em segundos
		Scanner leia1 = new Scanner(System.in);
		//Leitura de dados
		{
			System.out.println("\nInsira a dura��o da tarefa em segundos");
			TST=leia1.nextInt();
		}
		//Converter o tempo de segundos para horas, minutos e segundos
		TH=TST/3600;

		TM=(TST%3600)/60;

		TS=((TST%3600)%60);
		
		System.out.println("O tempo total � de:"+TH+" horas, "+TM+" minutos e "+TS+" segundos.");
	}

}
