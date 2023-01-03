package entities;

public class Funcionario {
	private Integer idUsuario;
	private Integer senha;
	private String nome;
	private String turno;
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Integer getSenha() {
		return senha;
	}
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void cadastro(String nome, int idUsuario, Integer senha) {
		this.nome = nome;
		this.idUsuario = idUsuario;;
		this.senha = senha;
		System.out.println("Cadastro realizado!");
	}
	
	
	
	
	

}
