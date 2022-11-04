package model;

import java.util.Date;

public class Task {

    //atributos -> correspondem com o BD
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private boolean isCompleted;
    private Date deadline;
    private Date createdAt;
    private Date updatedAt;

    //construtor
    public Task(int id, int idProject, String name, String description,
                String notes, boolean isCompleted, Date deadline,
                Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //construtor com parametros diferentes
    public Task() {
        this.createdAt = new Date(); //inicializa a tarefa no momento que o objeto foi criado
    }

    //métodos de acesso aos atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setInsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /*método toString: retorna uma string que tem o nome da classe, do 
    atributo e o valor que esta armazenado no atributo. Ela faz isso para 
    todos os atributos.*/

    @Override
    public String toString() {
        return "Task{" 
                    + "id=" + id 
                    + ", idProject=" + idProject 
                    + ", name=" + name 
                    + ", description=" + description 
                    + ", notes=" + notes 
                    + ", isCompleted=" + isCompleted 
                    + ", deadline=" + deadline 
                    + ", createdAt=" + createdAt 
                    + ", updatedAt=" + updatedAt + '}';
    }
}
