package application;

import java.util.Scanner;

import entities.Solicitacao;
import entities.Funcionario;

public class OrdemDeServico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Funcionario usuario = new Funcionario();
		Solicitacao solicitacao = new Solicitacao();
		
		int idUsuario = 0, senha;
		String nome = null;
		
		System.out.println("1- Cadastrar novo usu�rio:  ");
		System.out.println("2- Login");
		int opcao = entrada.nextInt();
		
		
		
		
		do {
			System.out.print("Nome: ");
			entrada.next();
			nome = entrada.nextLine();
			usuario.setNome(nome);
			
			System.out.print("ID: ");
			idUsuario = entrada.nextInt();
			usuario.setIdUsuario(idUsuario);
			
			System.out.print("Senha: ");
			senha = entrada.nextInt();
			usuario.setSenha(senha);
			
			usuario.cadastro(nome, idUsuario, senha);
			
			System.out.println();
			
			System.out.print("Aperte 2 para Logar no sistema: ");
			opcao = entrada.nextInt();
			
			
			
		}while(opcao == 1);
		
		
		
		
		
		
		/*int opcao = 0;
		
		do {
			System.out.print("Escolha a solita��o ");
			solicitacao.opcao();
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1 :
				solicitacao.tracinho();
				solicitacao.nome = "Televis�o";
				System.out.println("Voc� escolheu a op��o: "+ opcao +"- " + solicitacao.nome);
				solicitacao.tracinho();
				
				System.out.println("Qual o problema? ");
				System.out.println("1- N�o liga");
				System.out.println("2- Sem sinal");
				System.out.println("3- Problema no decoder");
				opcao = entrada.nextInt();
				
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "N�o liga";
					System.out.println("Voc� escolheu a op��o: "+ opcao +"- " + solicitacao.problema);
					solicitacao.tracinho();
					System.out.println("Solicita��o gravada ");
					System.out.println("Aperte: 0- Sair");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Sem sinal";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Problema no decoder";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
					
			break;
			case 2 :
				solicitacao.nome = "Sof�";
				
				System.out.println("1- Retirar");
				System.out.println("2- Colocar");
				System.out.println("3- Quebrado");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "Retirar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Colocar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Quebrado";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;
			
			case 3 :
				solicitacao.nome = "Cama extra";
				
				System.out.println("1- Retirar");
				System.out.println("2- Colocar");
				System.out.println("3- Quebrado");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "Retirar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Colocar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Quebrado";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;
			
			case 4 :
				solicitacao.nome = "Banheiro";
				
				System.out.println("1- Vaso entupido");
				System.out.println("2- Pia entupida");
				System.out.println("3- Torneira ou chuveiro vazando");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "Vaso entupido";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Pia entupida";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Torneira ou chuveiro vazando";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;	
			
			case 5 :
				solicitacao.nome = "Cofre";
				
				System.out.println("1- Retirar");
				System.out.println("2- Colocar");
				System.out.println("3- N�o funciona");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "Retirar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Colocar";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "N�o funciona";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;
			
			case 6 :
				solicitacao.nome = "Lampada";
				
				System.out.println("1- Queimada na sala");
				System.out.println("2- Queimada no quarto");
				System.out.println("3- Queimada no banheiro");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "Queimada na sala";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Queimada no quarto";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Queimada no banheiro";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;	
			
			case 7 :
				solicitacao.nome = "Ar Condicionado";
				
				System.out.println("1- N�o refrigera");
				System.out.println("2- Vazando");
				System.out.println("3- Desarmando");
				opcao = entrada.nextInt();
				
				if(opcao == 1) {
					solicitacao.tracinho();
					solicitacao.problema = "N�o refrigera";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 2) {
					solicitacao.tracinho();
					solicitacao.problema = "Vazando";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
					
				}else if(opcao == 3) {
					solicitacao.tracinho();
					solicitacao.problema = "Desarmando";
					System.out.println("0- Sair \n1- Menu");
					opcao = entrada.nextInt();
					solicitacao.tracinho();
				}
				
			break;	
			
			case 8 :
				solicitacao.nome = "Fechadura";
				
				
				solicitacao.tracinho();
				solicitacao.problema = "N�o abre";
				System.out.println("0- Sair \n1- Menu");
				opcao = entrada.nextInt();
				solicitacao.tracinho();
				
				
			break;	
			
			case 9 :
				solicitacao.nome = "Telefone";
				
				
				solicitacao.tracinho();
				solicitacao.problema = "N�o funciona";
				System.out.println("0- Sair \n1- Menu");
				opcao = entrada.nextInt();
				solicitacao.tracinho();
				
				
			break;	
			
			case 10 :
				solicitacao.nome = "Microondas";
				
				
				solicitacao.tracinho();
				solicitacao.problema = "N�o funciona";
				System.out.println("0- Sair \n1- Menu");
				opcao = entrada.nextInt();
				solicitacao.tracinho();
				
				
			break;
			case 11 :
				solicitacao.nome = "Internet";
				
				
				solicitacao.tracinho();
				solicitacao.problema = "N�o funciona";
				System.out.println("0- Sair \n1- Menu");
				opcao = entrada.nextInt();
				solicitacao.tracinho();
				
				
			break;	
			}
		}while(opcao != 0);
		
		System.out.println("Solicita��o encaminha para o setor respons�vel! \n");
		System.out.println("Problema: ");
		System.out.println(solicitacao.nome + ": " + solicitacao.problema);
		solicitacao.tracinho();*/
		
		entrada.close();

	}

}
