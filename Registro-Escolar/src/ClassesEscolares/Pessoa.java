package ClassesEscolares;

//import java.util.Date;

public class Pessoa 
{
	private String nome;
	//private Date dataDeNascimento;
	private String rg;
	private long cpf;
	private Endereco logradoro;
	
	public Pessoa(String nome,
			String rg, 
			long cpf,
			String rua,
			int numero,
			String complemento,
			String bairro,
			String cidade,
			String estado) 
	{
		this.setNome(nome);
		
		this.setRG(rg);
		
		this.setCPF(cpf);
		
		this.logradoro = new Endereco(rua, numero, complemento, bairro, cidade, estado);
		
	}
	
	//set e get nome
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return this.nome;
	}
	
	//set e get rg
	public void setRG(String rg) {
		this.rg = rg;
	}
	public String getRG() 
	{
		return this.rg;
	}
	
	
	//set e get cpf
	public int setCPF (long cpf) {
		String tratandoCPF = ((Object)cpf).getClass().getSimpleName();
		if(tratandoCPF.equalsIgnoreCase("long")&&cpf<100000000000L&&cpf>100000000L) {
			this.cpf = cpf;
			return 0;
		}else {
			System.out.println("Erro: Você forneceu um número inválido!");
			return 1;
		}
	}
	public String getCPF () 
	{
		if(this.cpf<1000000000L) 
		{
			String stringCPF = String.valueOf(this.cpf);
			String retorno = "00"+stringCPF;
			return retorno;
		}else if(this.cpf<10000000000L) {
			String stringCPF2 = String.valueOf(cpf);
			String retorno2 = "0"+stringCPF2;
			return retorno2;
		}else {
			String stringCPF3 = String.valueOf(cpf);
			return stringCPF3;
		}
	}
	
	//set e get endereço
	public void setLogradoro (String rua,
			int numero,
			String complemento,
			String bairro,
			String cidade,
			String estado) 
	{
		this.logradoro.setRua(rua);
		int verificaNumero = this.logradoro.setNumero(numero);
		if(verificaNumero == 1) {
			System.out.println("ERRO: número inválido");
			return;
		}
		this.logradoro.setComplemento(complemento);
		this.logradoro.setBairro(bairro);
		this.logradoro.setCidade(cidade);
		int verificaEstado = this.logradoro.setEstado(estado);
		if(verificaEstado ==1) {
			System.out.println("ERRO: estado inválido");
			return;
		}
	}
	public String getEndereco() 
	{
		return this.logradoro.getEndereco();
	}
	
	
	
}
