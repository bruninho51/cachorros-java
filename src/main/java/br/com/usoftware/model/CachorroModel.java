package br.com.usoftware.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.usoftware.enums.Porte;
import br.com.usoftware.enums.Sexo;

public class CachorroModel {

	private Long id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String raca;
	
	@NotBlank
	private Porte porte;
	
	@Min(value = 1)
	private int idade;
	
	private String cor;
	
	@NotNull
	@Min(value = 0)
	private Double peso;
	
	@NotBlank
	private Sexo sexo;
	
	public CachorroModel(String nome, String raca, Porte porte, int idade, String cor, Double peso, Sexo sexo) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.porte = porte;
		this.idade = idade;
		this.cor = cor;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}
