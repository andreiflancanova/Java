package Lista1205;

public class Ex_01_Cachorro extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caCorrer;
	
	//M�todo Construtor
	public Ex_01_Cachorro(String pNome,String pIdade,String pSom,String pCorrer)
	{
		super(pNome,pIdade,pSom);
		this.caCorrer=pCorrer;
	}
	
	public String getCaCorrer() {
		return caCorrer;
	}

	public void setCaCorrer(String caCorrer) {
		this.caCorrer = caCorrer;
	}

	public void ImprimirInfo()
	{
		System.out.println("\nNome do Dog: "+getCaNome());
		System.out.println("\nIdade do Dog: "+getCaIdade());
		System.out.println("\nSom do Dog: "+getCaSom());
		System.out.println("\nVelocidade da corrida: "+caCorrer);
	}
}
