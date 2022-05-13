package Aula1205;

public class Ex_01_TesteEmpregado {

	public static void main(String[] args) {
		
		Ex_01_Empregado[] Lista = new Ex_01_Empregado [3];
		Lista[0] = new Ex_01_Empregado("David Lucas Mendes",5000);
		Lista[1] = new Ex_01_Empregado("Cristiano ",10000);
		Lista[2] = new Ex_01_Empregado("Ismael Lopes ",20000);
		
		//For It
		for(Ex_01_Empregado Roda:Lista)
		{
			Roda.ImprimirInfo();
		}
		
		System.out.println("****************************************");
		for(Ex_01_Empregado Roda:Lista)
		{
			Roda.AumentarSalario(10);
			Roda.ImprimirInfo();
		}

		
	}

}
