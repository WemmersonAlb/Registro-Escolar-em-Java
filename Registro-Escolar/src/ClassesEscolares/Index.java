package ClassesEscolares;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) 
	{
		Index app = new Index();
		Pessoa teste = app.cadastrarPessoa();
		//Pessoa teste = app.cadastroTeste();
		app.exibir(teste);
	}

	private Pessoa cadastroTeste() {
		String nome = "Wemmerson";
		String rg = "8000000";
		long cpf = 9000000000L;
		String rua = "Avenida 1";
		int numero = 10;
		String complemento = "Apartamento 101";
		String bairro = "Derby";
		String cidade = "Recife";
		String estado = "pe";
		Pessoa teste = new Pessoa(nome, 
				rg,
				cpf,
				rua,
				numero,
				complemento,
				bairro,
				cidade,
				estado);
		return teste;
	}

	private Pessoa cadastrarPessoa() {
		Scanner input = new Scanner(System.in);//canal de entrada
		
		input.reset();
		System.out.println("Digite o seu nome:");
		String nome;
		do{
			nome = input.nextLine();
			System.out.println("O campo nome não pode ficar vazio!!!");
		}while(nome == null);
		
		
		System.out.println("Digite seu rg:");
		String rg = input.nextLine();
		while(rg == null) {
			System.out.println("O campo RG não pode ficar vazio!!!");
			rg = input.nextLine();
		}
		
		
		System.out.println("Digite o seu cpf:");
		long cpf = input.nextLong();
		while(cpf<100000000L || ((Object)cpf).getClass().getSimpleName().equalsIgnoreCase("integer")) {
			System.out.println("Valor inválido, digite novamente!!!");
			cpf = input.nextLong();			
		}
		
		
		System.out.println("Digite a sua rua/avenida/travessa/etc. :");
		String rua = input.nextLine();
		while(rua == null) {
			System.out.println("O campo rua/avenida/travessa/etc. não pode ficar vazio!!!");
			rua = input.nextLine();
		}
		
		
		//limpa os dados de entrada para número da residência
		System.out.println("Digite o número de sua residência (caso não tenha número, digite 0):");
		int numero = input.nextInt();
		while(numero <0 && ((Object)numero).getClass().getSimpleName().equalsIgnoreCase("integer")) {
			System.out.println(numero +" "+ ((Object)numero).getClass().getSimpleName().equalsIgnoreCase("integer"));
			System.out.println("Digite um número de residência válido!!!");
			numero = input.nextInt();
			System.out.println(numero+" "+((Object)numero).getClass().getSimpleName().equalsIgnoreCase("integer"));
			
		}
		
		System.out.println("Digite o complemento:");
		String complemento = input.nextLine();
		while(complemento == null) {
			System.out.println("O campo complemento não pode ficar em branco!!!");
			complemento = input.nextLine();
		}
		
		
		System.out.println("Digite o seu bairro:");
		String bairro = input.nextLine();
		while(bairro == null) {
			System.out.println("O campo bairro não pode ficar vazio!!!");
			bairro = input.nextLine();
		}
		
		System.out.println("Digite a sua cidade:");
		String cidade = input.nextLine();
		while(cidade == null) {
			System.out.println("O campo cidade não pode ficar vazio!!!");
			cidade = input.nextLine();
		}
		
		System.out.println("Digite a sigla do seu estado:");
		String estado = input.nextLine();
		while(estado == null || estado.equalsIgnoreCase("ac") || 
				estado.equalsIgnoreCase("al") || 
				estado.equalsIgnoreCase("ap") || 
				estado.equalsIgnoreCase("am") || 
				estado.equalsIgnoreCase("ba") || 
				estado.equalsIgnoreCase("ce") || 
				estado.equalsIgnoreCase("df") || 
				estado.equalsIgnoreCase("es") || 
				estado.equalsIgnoreCase("go") || 
				estado.equalsIgnoreCase("ma") || 
				estado.equalsIgnoreCase("mt") || 
				estado.equalsIgnoreCase("ms") || 
				estado.equalsIgnoreCase("mg") || 
				estado.equalsIgnoreCase("pa") || 
				estado.equalsIgnoreCase("pb") || 
				estado.equalsIgnoreCase("pr") || 
				estado.equalsIgnoreCase("pe") || 
				estado.equalsIgnoreCase("pi") || 
				estado.equalsIgnoreCase("rj") || 
				estado.equalsIgnoreCase("rn") || 
				estado.equalsIgnoreCase("rs") || 
				estado.equalsIgnoreCase("ro") || 
				estado.equalsIgnoreCase("rr") || 
				estado.equalsIgnoreCase("sc") || 
				estado.equalsIgnoreCase("sp") || 
				estado.equalsIgnoreCase("se") || 
				estado.equalsIgnoreCase("to")) {
			System.out.println("Estado inválido!!!");
			System.out.println("Escolha um dos estados abaixo");
			System.out.println("AC - Acre | AL - Alagoas | AP - Amapá");
			System.out.println("AM - Amazonas | BA - Bahia | CE - Ceará");
			System.out.println("DF - Distrito Federal | ES - Espírito Santo");
			System.out.println("GO - Goiás | MA - Maranhão | MT - Mato Grosso");
			System.out.println("MS - Mato Grosso do Sul | MG - Minas Gerais");
			System.out.println("PA - Pará | PB - Paraíba | PE - Pernambuco");
			System.out.println("PI - Piauí | PR - Paraná | RJ - Rio de Janeiro");
			System.out.println("RN - Rio Grande do Norte | RS - Rio Grande do Sul");
			System.out.println("RO - Rondônia | RR - Roraima | SC - Santa Catarina");
			System.out.println("SP - São Paulo | SE - Sergipe | TO - Tocantins");
			estado = input.nextLine();
		}
		
		Pessoa teste = new Pessoa(nome, 
				rg, 
				cpf, 
				rua, 
				numero, 
				complemento, 
				bairro, 
				cidade, 
				estado);
		System.out.println("Cadastrado com sucesso");
		input.close();
		return teste;
		
	}
	private void exibir(Pessoa teste) {
		// TODO Auto-generated method stub
		System.out.println("Nome: "+teste.getNome());
		System.out.println("RG: "+teste.getRG());
		System.out.println("CPF: "+teste.getCPF());
		System.out.println("Endereço: "+teste.getEndereco());
	}

	

}
