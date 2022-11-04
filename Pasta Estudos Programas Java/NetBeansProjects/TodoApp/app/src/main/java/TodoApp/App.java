package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

public class App {

    public static void main(String[] args) {   
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto Teste");
        project.setDescription("description");
        projectController.save(project);
        
        project.setId(1);
        project.setName("Novo nome do projeto");
        project.setDescription("description");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());
        
        projectController.removeById(1);
        
        TaskController taskController = new TaskController();;
        
        Task task = new Task();
        task.setIdProject(2);
        task.setName("Criar as telas de aplicacao");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setInsCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task);
        
        task.setName("Alterar telas da aplicacao");
        taskController.update(task);
        List<Task> tasks = taskController.getAll(1);
        System.out.println("Total de tarefas = " + tasks.size());
        
    }   
    
    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


