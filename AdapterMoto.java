package Entidades;

public class AdapterMoto implements Carro {
	public Moto moto;

	public AdapterMoto() {
		this.moto = new Yrb();
	}

	@Override
	public void quatroRodas() {
		moto.duasRodas();

	}

	@Override
	public void volante() {
		moto.guidao();

	}

}
