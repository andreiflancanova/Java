package Aula1105_POO;

public class A_11_05_POO2 
{
	public static void main(String[] args)
	{
		//Instanciando um objeto da Classe A_11_05_POO1
		A_11_05_POO1 input01= new A_11_05_POO1("Andrei Lançanova","BMW","XYZ1C34",2023);
		input01.ImprimirInfo();
		
		System.out.println("\n**********Transferência de Titularidade**********");
		input01.setCaNomeProprietario("Tacio Ferreira");
		
		input01.ImprimirInfo();
		
		//É importante que os arquivos estejam no mesmo Projeto, e preferencialmente no mesmo Package
	}
}
