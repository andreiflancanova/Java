package Lista1305;

public class Ex_01_Cavalo extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caCorrer;
	
	//Método Construtor
	public Ex_01_Cavalo(String pNome,String pIdade,String pCorrer)
	{
		super(pNome,pIdade);
		this.caCorrer=pCorrer;
	}
	
	public String getCaCorrer() {
		return caCorrer;
	}

	public void setCaCorrer(String caCorrer) {
		this.caCorrer = caCorrer;
	}

	@Override
	public void Som()
	{
		System.out.println("\nHiin in in!");
	}

	@Override
	public void ImprimirInfo()
	{
		System.out.println("\nCONTROLE DE EQUINOS - GENERATION");
		System.out.println("\n****************************************");
		System.out.println("\nNome do Cavalo: "+getCaNome());
		System.out.println("\nIdade do Cavalo: "+getCaIdade());
		System.out.println("\nVelocidade da corrida: "+caCorrer);
	}
}
