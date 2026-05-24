package dao;

import connection.ConnectionFactory;
import model.Disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisciplinaDAO {

    // CREATE
    public void inserir(Disciplina disciplina) {

        String sql = "INSERT INTO disciplinas(descricao, professor) VALUES (?, ?)";

        try (
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, disciplina.getDescricao());
            stmt.setString(2, disciplina.getProfessor());

            stmt.executeUpdate();

            System.out.println("Disciplina cadastrada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    // READ
    public void listar() {

        String sql = "SELECT * FROM disciplinas";

        try (
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Descrição: " + rs.getString("descricao"));
                System.out.println("Professor: " + rs.getString("professor"));
                System.out.println("------------------------");
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizar(Disciplina disciplina) {

        String sql = "UPDATE disciplinas SET descricao = ?, professor = ? WHERE id = ?";

        try (
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, disciplina.getDescricao());
            stmt.setString(2, disciplina.getProfessor());
            stmt.setInt(3, disciplina.getId());

            stmt.executeUpdate();

            System.out.println("Disciplina atualizada!");

        } catch (Exception e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int id) {

        String sql = "DELETE FROM disciplinas WHERE id = ?";

        try (
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Disciplina removida!");

        } catch (Exception e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }
}