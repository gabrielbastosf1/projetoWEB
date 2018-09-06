package projetoWeb;

import java.util.Date;

public class Cliente {
	private Integer id;
	private String nome;
	private String sobrenome;
	private String senha;
	private String sexo;
	private String email;
	private boolean editar;
	private String cpf; 
	private Integer rg;
	private Integer telefone;
	private Date dataNasc;
	private String estadoC;
	private Integer cep;
	private String endereco;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEstadoC() {
		return estadoC;
	}
	public void setEstadoC(String estadoC) {
		this.estadoC = estadoC;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean getEditar() {
		return editar;
	}
	public void setEditar(boolean editar) {
		this.editar = editar;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", senha=" + senha + ", sexo="
				+ sexo + ", email=" + email + ", editar=" + editar + ", cpf=" + cpf + ", rg=" + rg + ", telefone="
				+ telefone + ", dataNasc=" + dataNasc + ", estadoC=" + estadoC + ", cep=" + cep + ", endereco="
				+ endereco + "]";
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSenha() {
		return senha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
