package com.ifsp.edu.br.CRUD;
import java.util.ArrayList;

public class BibliotecaFilmes {
	
private ArrayList<Filme> filmes = new ArrayList<>();
    
    //adicionar um filme
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }
    
    //buscar um filme pelo título
    public Filme buscarFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(titulo)) {
                return filme;
            }
        }
        return null;
    }
    
    //atualizar um filme
    public boolean atualizarFilme(String titulo, Filme novoFilme) {
        Filme filme = buscarFilme(titulo);
        if (filme != null) {
            int index = filmes.indexOf(filme);
            filmes.set(index, novoFilme);
            return true;
        } else {
            return false;
        }
    }
    
    //remover um filme
    public boolean removerFilme(String titulo) {
        Filme filme = buscarFilme(titulo);
        if (filme != null) {
            filmes.remove(filme);
            return true;
        } else {
            return false;
        }
    }
    
    //listar todos os filmes
    public ArrayList<Filme> listarFilmes() {
        return filmes;
    }
}
