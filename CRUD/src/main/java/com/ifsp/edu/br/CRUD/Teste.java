package com.ifsp.edu.br.CRUD;

import java.util.ArrayList;

public class Teste {
	
	    public static void main(String[] args) {
	        // criar
	        BibliotecaFilmes biblioteca = new BibliotecaFilmes();
	        
	        // adicionar
	        biblioteca.adicionarFilme(new Filme("Top Gun: Maverick", 2022, "Joseph Kosinski", "Ação/Aventura"));
	        biblioteca.adicionarFilme(new Filme("Titanic", 1997, "James Cameron", "Romance/Drama"));
	        biblioteca.adicionarFilme(new Filme("Panico 6", 2023, "Tyler Gillett", "Terror/Slasher"));
	        
	        // buscar
	        Filme filme = biblioteca.buscarFilme("Top Gun: Maverick");
	        if (filme != null) {
	            System.out.println("Encontrado: " + filme.getTitulo() + " (" + filme.getAno() + ")");
	        } else {
	            System.out.println("Filme não encontrado.");
	        }
	        
	        // atualizar
	        Filme novoFilme = new Filme("Em Homem-Aranha: Sem Volta para Casa", 2021, "Jon Watts", "Ação/Aventura");
	        boolean atualizado = biblioteca.atualizarFilme("Titanic", novoFilme);
	        if (atualizado) {
	            System.out.println("Filme atualizado com sucesso.");
	        } else {
	            System.out.println("Filme não encontrado para atualização.");
	        }
	        
	        // remover
	        boolean removido = biblioteca.removerFilme("Panico 6");
	        if (removido) {
	            System.out.println("Filme removido com sucesso.");
	        } else {
	            System.out.println("Filme não encontrado para remoção.");
	        }
	        
	        // listar
	        ArrayList<Filme> filmes = biblioteca.listarFilmes();
	        System.out.println("Lista de filmes:");
	        for (Filme f : filmes) {
	            System.out.println("- " + f.getTitulo() + " (" + f.getAno() + ")");
	        }
	    }
	}

