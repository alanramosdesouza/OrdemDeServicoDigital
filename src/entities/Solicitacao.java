package entities;

public class Solicitacao {
	private String nome;
	private String problema;
	private String local;
	private Integer idSolicitacao;
	
	
	
	
	public void opcao() {
		System.out.println("Solicita��o ");
		System.out.println("1- Televis�o ");
		System.out.println("2- Sof� ");
		System.out.println("3- Cama extra ");
		System.out.println("4- Banheiro ");
		System.out.println("5- Cofre ");
		System.out.println("6- L�mpada ");
		System.out.println("7- Ar Condicionado ");
		System.out.println("8 -Fechadura ");
		System.out.println("9- Telefone ");
		System.out.println("10- Microondas ");
		System.out.println("11- Internet \n");
		System.out.println("0- Sair \n");
		
	}
	
	public void tracinho() {
		for(int i = 0; i <= 30; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
