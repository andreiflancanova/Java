package Aula1205;

public class Ex_02_Empregado01 extends Ex_02_Pessoa 
{
	//Atributos de Classe
	private int caCodigoSetor;
	private float caSalarioBase;
	private float caImposto;
	
	//M�todo Construtor
	public Ex_02_Empregado01(String pNome, String pEndereco, String pCPF, int pTelefone, int pIdade,
			int pCodigoSetor, float pSalarioBase, float pImposto)
	{
		super(pNome,pEndereco,pCPF,pTelefone,pIdade);
		this.caCodigoSetor=pCodigoSetor;
		this.caSalarioBase=pSalarioBase;
		this.caImposto=pImposto;
	}
	
	public void ImprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getCaNome());
		System.out.println("\nEndere�o do empregado: "+getCaEndereco());
		System.out.println("\nCPF do empregado: "+getCaCPF());
		System.out.println("\nN� de Telefone do empregado: "+getCaTelefone());
		System.out.println("\nIdade do empregado: "+getCaIdade());
		System.out.println("\nC�digo do Setor do empregado: "+caCodigoSetor);
		System.out.println("\nSal�rio Base do empregado: "+caSalarioBase);
		System.out.println("\nImposto incidente sobre o Sal�rio Base: "+caImposto);
	}
	
	public void CalcularSalario()
	{
		double SalarioReal=caSalarioBase*(1-(0.01*caImposto));
		System.out.println("\nO Sal�rio Total a ser recebido ser�: "+SalarioReal);
		
	}
}
