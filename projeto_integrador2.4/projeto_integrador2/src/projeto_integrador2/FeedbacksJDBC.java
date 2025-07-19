package projeto_integrador2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FeedbacksJDBC {

    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;

    public void cadastrarFeedback(Feedbacks feedback) {

        conn = new ConexaoJDBC().connectDB();

        try {
            String sql = "INSERT INTO feedbacks (texto, anonimo, categoria, disciplina ) VALUES (?,?,?,?)";
            prep = conn.prepareStatement(sql);
            prep.setString(1, feedback.getTexto());
            prep.setInt(2, feedback.isAnonimo() ? 1 : 0);
            prep.setString(3, feedback.getCategoria());
            prep.setString(4, feedback.getDisciplina());

            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Feedback cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Feedback: " + e.getMessage());
        } finally {
            try {
                if (prep != null) {
                    prep.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

    }

    public List<Feedbacks> listarFeedbacks() {
    List<Feedbacks> lista = new ArrayList<>();

    conn = new ConexaoJDBC().connectDB();
    try {
        
        String sql = "SELECT * FROM feedbacks";
        PreparedStatement prep = conn.prepareStatement(sql);
        ResultSet rs = prep.executeQuery();

        while (rs.next()) {
            Feedbacks f = new Feedbacks();
            f.setId(rs.getInt("id"));
            f.setTexto(rs.getString("texto"));
            f.setAnonimo(rs.getInt("anonimo") == 1);
            f.setCategoria(rs.getString("categoria"));
            f.setDisciplina(rs.getString("disciplina"));

            lista.add(f);
        }

        rs.close();
        prep.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar feedbacks: " + e.getMessage());
    }

    return lista;
}

    public void excluir(int id) throws SQLException {

        try {
            conn = new ConexaoJDBC().connectDB();
            String sql = "DELETE FROM feedbacks WHERE id = ?";
            prep = conn.prepareStatement(sql);

            prep.setInt(1, id);
            prep.execute();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + e.getMessage());
        } finally {
            try {
                if (prep != null) {
                    prep.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

    }

   
public void atualizar(Feedbacks feedback) {
    try {
        conn = new ConexaoJDBC().connectDB();
        String sql = "UPDATE feedbacks SET texto = ?, anonimo = ?, categoria = ?, disciplina = ? WHERE id = ?";
        prep = conn.prepareStatement(sql);

        prep.setString(1, feedback.getTexto());
        prep.setBoolean(2, feedback.isAnonimo());
        prep.setString(3, feedback.getCategoria());
        prep.setString(4, feedback.getDisciplina());
        prep.setInt(5, feedback.getId());

        int linhasAfetadas = prep.executeUpdate();
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Feedback atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi alterada.");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar feedback: " + e.getMessage());
    } finally {
        try {
            if (prep != null) prep.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
        }
    }
}
}
    
