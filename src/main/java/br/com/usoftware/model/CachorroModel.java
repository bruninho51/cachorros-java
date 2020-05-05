package br.com.usoftware.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import br.com.usoftware.enums.Porte;
import br.com.usoftware.enums.Sexo;

public class CachorroModel {

	private Long id;

	@NotBlank(message = "O nome deve ser preenchido!")
	private String nome;
	
	@NotBlank(message = "A raça deve ser preenchida!")
	private String raca;
	
	private Porte porte;
	
	@Min(value = 1, message = "A idade deve ser maior que 0!")
	private int idade;

	private String cor;
	
	private Double peso;

	private Sexo sexo;
	
	public CachorroModel() {}
	
	public CachorroModel(Long id, String nome, String raca, Porte porte, int idade, String cor, Double peso, Sexo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.porte = porte;
		this.idade = idade;
		this.cor = cor;
		this.peso = peso;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
