package Aula1305;

public class Ex_01_Fixo extends Ex_01_Telefone
{
	public Ex_01_Fixo()
	{
		super("Telefone Fixo");
	}
	
	@Override
	public void Ring(int pNumToques)
	{
		for(int i=0;i<pNumToques;i++)
		{
			System.out.println("\nTrrrriiiiiiim...Trrrriiiiiiim...");
		}
	}
	
	@Override
	public void Dial(String pNumeroTelefone)
	{
		System.out.println("\nDiscando "+pNumeroTelefone);
	}
}
