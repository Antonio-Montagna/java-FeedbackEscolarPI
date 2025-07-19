
package projeto_integrador2;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuarios{
    
    String disciplina;
    List<Feedbacks> avaliacoesRecebidas;

    public Professor() {
    }


    public Professor(String nome, String email, String cpf, String senha, String disciplina) {
        super(nome, email, cpf, senha);
        this.disciplina = disciplina;
        this.avaliacoesRecebidas = new ArrayList<>();
    }

    
    public void VisualizarFeedbacks() {
    
        System.out.println("Feedbacks recebidos por " + nome + ":");
        for (Feedbacks feedbacks : avaliacoesRecebidas) {
            System.out.println("- " + feedbacks.getTexto());
        }
}
    
    public void responderFeedback(Feedbacks feedbacks, String resposta) {
        System.out.println("Professor " + nome + " respondeu ao feedback: " + resposta);
    }
    
    public void adicionarFeedback(Feedbacks feedbacks) {
        this.avaliacoesRecebidas.add(feedbacks);        
    }
    
}
