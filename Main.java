import dao.DisciplinaDAO;
import model.Disciplina;

public class Main {

    public static void main(String[] args) {

        DisciplinaDAO dao = new DisciplinaDAO();

        // CREATE
        Disciplina d1 = new Disciplina("Programação Orientada a Objetos", "Carlos Silva");
        dao.inserir(d1);

        // READ
        dao.listar();

        // UPDATE
        Disciplina d2 = new Disciplina("Banco de Dados", "Maria Souza");
        d2.setId(1);

        dao.atualizar(d2);

        // DELETE
        dao.deletar(1);
    }
}