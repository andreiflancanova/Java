package Aula1205;

public class Ex_02_Operario extends Ex_02_Pessoa 
{
	private double caValorProducao;
	private double caComissao;
	
	//Método Construtor
		public Ex_02_Operario (String pNome, String pEndereco, String pCPF, int pTelefone, int pIdade,
				int pValorProducao, float pComissao)
		{
			super(pNome,pEndereco,pCPF,pTelefone,pIdade);
			this.caValorProducao=pValorProducao;
			this.caComissao=pComissao;
		}
			
		public void ImprimirInfo()
		{
			System.out.println("\nNome do empregado: "+getCaNome());
			System.out.println("\nEndereço do empregado: "+getCaEndereco());
			System.out.println("\nCPF do empregado: "+getCaCPF());
			System.out.println("\nNº de Telefone do empregado: "+getCaTelefone());
			System.out.println("\nIdade do empregado: "+getCaIdade());
			System.out.println("\nSalário Base do empregado: "+caValorProducao);
			System.out.println("\nPercentual de comissão: "+caComissao);
		}
		

}
