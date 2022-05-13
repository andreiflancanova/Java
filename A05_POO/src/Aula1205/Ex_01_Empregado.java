package Aula1205;

import java.text.NumberFormat;

public class Ex_01_Empregado 
{
	//Declaração dos Atributos da Classe
	private String caNome;
	private double caSalario;
	
	//Método Construtor	
	public Ex_01_Empregado(String pNome,double pSalario)
	{
		this.setCaNome(pNome);
		this.setCaSalario(pSalario);
	}

	//Pega nome
	public String getCaNome() {
		return caNome;
	}

	public void setCaNome(String caNome) {
		this.caNome = caNome;
	}

	//Pega Salário
	public double getCaSalario() {
		//Retorna o Método
		return caSalario;
	}

	public void setCaSalario(double caSalario) {
		this.caSalario = caSalario;
	}
	public void AumentarSalario(double pPercentual) 
	{
		caSalario *= (1+(pPercentual/100));
	}
	
	//Formatar moedas com 2 casas depois da vírgula
	public String FormatarMoeda()
	{
		NumberFormat mNF = NumberFormat.getCurrencyInstance();
		mNF.setMinimumFractionDigits(2);
		
		String mFormatoMoeda = mNF.format(caSalario);
		return mFormatoMoeda;
	}
	
	public void ImprimirInfo()
	{
		System.out.println("\n"+caNome+"\t\tSalário: "+this.FormatarMoeda());
	}
}
