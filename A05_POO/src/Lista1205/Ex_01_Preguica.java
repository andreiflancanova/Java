package Lista1205;

public class Ex_01_Preguica extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caSubirArvore;
	
	//M�todo Construtor
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
		System.out.println("\nNome da Pregui�a: "+getCaNome());
		System.out.println("\nIdade da Pregui�a: "+getCaIdade());
		System.out.println("\nSom da Pregui�a: "+getCaSom());
		System.out.println("\nTipo de �rvore que sobe: "+caSubirArvore);
	}
}
