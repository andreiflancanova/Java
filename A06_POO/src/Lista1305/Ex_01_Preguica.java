package Lista1305;

public class Ex_01_Preguica extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caSubirArvore;
	
	//Método Construtor
	public Ex_01_Preguica(String pNome,String pIdade,String pSubirArvore)
	{
		super(pNome,pIdade);
		this.caSubirArvore=pSubirArvore;
	}
	
	public String getCaSubirArvore() {
		return caSubirArvore;
	}

	public void setCaSubirArvore(String caSubirArvore) {
		this.caSubirArvore = caSubirArvore;
	}

	@Override
	public void Som()
	{
		System.out.println("\nAaaaa aaa aa!");
	}
	
	@Override
	public void ImprimirInfo()
	{
		System.out.println("\nCONTROLE DE BICHOS-PREGUIÇA - GENERATION");
		System.out.println("\n****************************************");
		System.out.println("\nNome da Preguiça: "+getCaNome());
		System.out.println("\nIdade da Preguiça: "+getCaIdade());
		System.out.println("\nTipo de árvore que sobe: "+caSubirArvore);
	}
}
