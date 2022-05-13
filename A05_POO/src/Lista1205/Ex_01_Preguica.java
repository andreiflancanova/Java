package Lista1205;

public class Ex_01_Preguica extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caSubirArvore;
	
	//Método Construtor
	public Ex_01_Preguica(String pNome,String pIdade,String pSom,String pSubirArvore)
	{
		super(pNome,pIdade,pSom);
		this.caSubirArvore=pSubirArvore;
	}
	
	public String getCaSubirArvore() {
		return caSubirArvore;
	}

	public void setCaSubirArvore(String caSubirArvore) {
		this.caSubirArvore = caSubirArvore;
	}

	public void ImprimirInfo()
	{
		System.out.println("\nNome da Preguiça: "+getCaNome());
		System.out.println("\nIdade da Preguiça: "+getCaIdade());
		System.out.println("\nSom da Preguiça: "+getCaSom());
		System.out.println("\nTipo de árvore que sobe: "+caSubirArvore);
	}
}
