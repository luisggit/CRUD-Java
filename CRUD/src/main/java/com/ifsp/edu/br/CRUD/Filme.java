package com.ifsp.edu.br.CRUD;
	
public class Filme {
	
	    private String titulo;
	    private int ano;
	    private String diretor;
	    private String genero;
	    
	    // construtor
	    public Filme(String titulo, int ano, String diretor, String genero) {
	        this.titulo = titulo;
	        this.ano = ano;
	        this.diretor = diretor;
	        this.genero = genero;
	    }
	    
	    // getters e setters
	    public String getTitulo() {
	        return titulo;
	    }
	    
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	    
	    public int getAno() {
	        return ano;
	    }
	    
	    public void setAno(int ano) {
	        this.ano = ano;
	    }
	    
	    public String getDiretor() {
	        return diretor;
	    }
	    
	    public void setDiretor(String diretor) {
	        this.diretor = diretor;
	    }
	    
	    public String getGenero() {
	        return genero;
	    }
	    
	    public void setGenero(String genero) {
	        this.genero = genero;
	    }
	}
