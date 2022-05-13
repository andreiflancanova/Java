package Aula1205;

public class Ex_02_Teste_Empregado01 {

	public static void main(String[] args) 
	{
		Ex_02_Empregado01 Employee = new Ex_02_Empregado01("Paulo Victor","Rua da Marola, nº100","12345678910",987654321,22,123,42000,15);
		Employee.ImprimirInfo();
		Employee.CalcularSalario();
	}

}
