package Lista1305;

public class Ex_01_Cachorro extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caCorrer;
	
	//Método Construtor
	public Ex_01_Cachorro(String pNome,String pIdade,String pCorrer)
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
		System.out.println("\nAu Au Au Au Au!");
	}
	
	@Override
	public void ImprimirInfo()
	{
		System.out.println("\nCONTROLE DE CÃES - GENERATION");
		System.out.println("\n****************************************");
		System.out.println("\nNome do Dog: "+getCaNome());
		System.out.println("\nIdade do Dog: "+getCaIdade());
		System.out.println("\nVelocidade da corrida: "+caCorrer);
	}
}
