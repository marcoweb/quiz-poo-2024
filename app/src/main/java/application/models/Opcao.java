package application.models;

public class Opcao {
    private long id;
    private String descricao;
    private boolean correto;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean getCorreto() {
        return correto;
    }
    public void setCorreto(boolean correto) {
        this.correto = correto;
    }
}
