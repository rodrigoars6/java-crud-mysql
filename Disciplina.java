package model;

public class Disciplina {

    private int id;
    private String descricao;
    private String professor;

    public Disciplina() {
    }

    public Disciplina(String descricao, String professor) {
        this.descricao = descricao;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}