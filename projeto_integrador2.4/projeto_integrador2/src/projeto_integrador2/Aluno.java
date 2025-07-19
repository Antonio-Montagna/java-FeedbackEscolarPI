
package projeto_integrador2;

import java.util.List;

public class Aluno extends Usuarios{
    
    int matricula;
    List<Feedbacks> feedbacksEnviados;

    
    public Aluno() {
    }


    public Aluno(String nome, String email, String cpf, String senha, int matricula) {
        super(nome, email, cpf, senha);
        this.matricula = matricula;
        this.feedbacksEnviados = feedbacksEnviados;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
     public void enviarFeedback(Feedbacks feedbacks) {
        feedbacksEnviados.add(feedbacks);
        System.out.println("Feedback enviado por " + nome + ": " + feedbacks.getTexto());
    }
    
}
