package Aula1305;

public class Ex_01_Publico extends Ex_01_Telefone
{
	public Ex_01_Publico()
	{
		super("Telefone Público");
	}

	@Override
	public void Ring(int pNumToques)
	{
		for(int i=0;i<pNumToques;i++)
		{
			System.out.println("\nTininimm...Tininimm...");
		}
	}

	@Override
	public void Dial(String pNumeroTelefone)
	{
		if(pNumeroTelefone.charAt(0)=='9' || pNumeroTelefone.charAt(0)=='8')
		{
			System.out.println("\nEste telefone não liga para celular...");
		}
		else
		{
			System.out.println("\nDiscando: "+pNumeroTelefone);
		}
	}

}
