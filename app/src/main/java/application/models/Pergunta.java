package application.models;

import java.util.List;

public class Pergunta {
    private long id;
    private String enunciado;
    private Categoria categoria;
    private List<Opcao> opcoes;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public List<Opcao> getOpcoes() {
        return opcoes;
    }
    public void setOpcoes(List<Opcao> opcoes) {
        this.opcoes = opcoes;
    }
}
