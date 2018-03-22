package br.edu.ifpr.meuapp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cristiano on 14/03/18.
 */
//classe para a lista
public class Lista implements Serializable {
    private String nome;
    private String data;
    private List<Itens> itens;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", itens=" + itens +
                '}';
    }
}


//classe para os itens da lista


