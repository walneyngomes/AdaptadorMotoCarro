package Entidades;

public class Cliente {
	private String nome;
	private String cpf;
	private String cnh;

	private Carro motoMinha;

	public Cliente() {
		this.motoMinha = new AdapterMoto();
	}

	public void verificaRodasNumero() {
		motoMinha.quatroRodas();
	}

	public void verificaVolante() {
		motoMinha.volante();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Carro getMotoMinha() {
		return motoMinha;
	}

	public void setMotoMinha(Carro motoMinha) {
		this.motoMinha = motoMinha;
	}

}
