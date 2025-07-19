
package projeto_integrador2;

import java.util.ArrayList;
import java.util.List;

public class Feedbacks {
    
    int id;
    String texto; 
    boolean anonimo; 
    String categoria; 
    String disciplina; 
    Usuarios usuarios;

    public Feedbacks() {
    }

    public Feedbacks(int id, String texto, boolean anonimo, String categoria, String disciplina, Usuarios usuarios) {
        this.id = id;
        this.texto = texto;
        this.anonimo = anonimo;
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    
    
}
    
   