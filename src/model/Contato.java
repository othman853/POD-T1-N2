package model;

import java.util.GregorianCalendar;

public class Contato {
	
	private String nome;
	private String apelido;
	private String telefone;
	private String celular;
	private String email;
	private GregorianCalendar dataNascimento;	
	
	public Contato(String nome, String apelido, String telefone,
			String celular, String email, GregorianCalendar dataNascimento) {
	
		this.nome = nome;
		this.apelido = apelido;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public Contato() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
