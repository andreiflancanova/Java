package Aula1305;

public class Ex_01_Celular extends Ex_01_Telefone
{
	//Método Construtor
	public Ex_01_Celular()
	{
		//Atributos de Sub-Classe
		super("Telefone Celular");
	}
	
	@Override	//Indicação de Método Polimórfico - Anotação de Sobrescrita
	public void Ring(int pCodigoToque)
	{
		switch(pCodigoToque)
		{
		case 1:
			System.out.println("Ring...Ring...Ring");
		break;
			
		case 2:
			System.out.println("Tantanãnã...Nãnãnã");
		break;
		
		case 3:
			System.out.println("Tchu tcha tcha tchu tchu tcha");
		break;
		}
	}
	
	@Override	//Indicação de Método Polimórfico - Anotação de Sobrescrita
	public void Dial(String pNumeroTelefone)
	{
		System.out.println("\nO número: "+pNumeroTelefone+" é um celular.");
	}
	
}
