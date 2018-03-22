package br.edu.ifpr.meuapp.model;

/**
 * Created by cristiano on 21/03/18.
 */

public class Itens{

    String nome;
    Lista lista;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "nome='" + nome + '\'' +
                '}';
    }
}