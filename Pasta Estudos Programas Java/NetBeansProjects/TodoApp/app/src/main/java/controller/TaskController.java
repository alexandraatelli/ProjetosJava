package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

// Cria-se 4 metodos = 1 para cada operacao basica: save, update, remove, 
public class TaskController {

    //recebe um parametro task - essa tarefa eu SALVO no BD - os dados dentro desse objeto task
    public void save(Task task) {
        String sql = "INSERT INTO task("
                    + "idProject,"
                    + "name,"
                    + "description,"
                    + "isCompleted,"
                    + "notes,"
                    + "deadline,"
                    + "createdAt,"
                    + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        // ? sempre que nao temos um valor para colocar ainda

        //variaveis para preparar nosso sql
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            //tipo data no objeto task é do tipo java.util.date - no SQL espera outro tipo. Crio nova data
            //passa o paramentro do tipo Long, o metodo getTime espera formato long.
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa! "
                        + ex.getMessage(), ex); // dispara uma exceção
        } finally {
            //ConnectionFactory.closeConnection(connection, statement);
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
    }

    //recebe um parametro task - essa tarefa eu ALTERO no BD - os dados dentro desse objeto task
    public void update(Task task) {

        String sql = "UPDATE tasks SET "
                    + "idProject = ?,"
                    + "name = ?,"
                    + "description = ?,"
                    + "notes = ?,"
                    + "isCompleted = ?,"
                    + "deadline = ?,"
                    + "createdAt = ?,"
                    + "updatedAt = ?,"
                    + "WHERE id = ?"; //id da tarefa que eu quero atualizar - por isso o where

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //estabelecendo a conexao com o banco de dados
            connection = ConnectionFactory.getConnection();
            //preparando a query
            statement = connection.prepareStatement(sql);
            //setando os valores no statement
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            //executando a query
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa!"
                        + ex.getMessage(), ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão" + ex.getMessage(), ex);
            }
        }
    }

    //esse metodo busca todas as taredas com base em um projeto - ele me 
    //devolve a lista de tarefas
    //lembrando que tarefa tem uma chave estrangeiro no projeto
    public List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tasks";

        //lista de tarefas que sera devolvida quando a chamada do metodo acontecer
        //é uma estrutura de lista, de dados
        List<Task> tasks = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        //guarda o retorno do banco de dados - recupera os dados
        ResultSet resultSet = null;

        try {
            //criando a conexao com o banco de dados
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareCall(sql);

            resultSet = statement.executeQuery();

            //enquanto houverem valores a serem percorridos no resultSet
            while (resultSet.next()) {

                Task task = new Task();

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setInsCompleted(resultSet.getBoolean("isCompleted"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));

                //vamos colocar essa tarefa dentro da lista de tarefas
                tasks.add(task);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir a tarefa!"
                        + ex.getMessage(), ex);
        } finally {
            //ele sempre vai ser executado no final da execução do try
            //ConnectionFactory.closeConnection(connection, statement, resultSet);
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
        return tasks;
    }

    public List<Task> getByProjectId(int id) {
        String sql = "SELECT * FROM tasks where idProject = ?";

        List<Task> tasks = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            //Enquanto existir dados no banco de dados, fa a
            while (resultSet.next()) {

                Task task = new Task();

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setInsCompleted(resultSet.getBoolean("isCompleted"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
        return tasks;
    }

    //passo o id da tarefa que eu quero que seja deletado, e ele executa esse 
    //comando de deletar no BD
    public void removeById(int id) {

        //comando responsavel por deletar uma tarefa no banco de dados.
        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection connection = null; // variavel de conexao que não foi 
        //instanciada ainda
        PreparedStatement statement = null; // variavel statement que não foi 
        //instanciada ainda

        try {
            //criacao da conexao com o banco de dados
            connection = ConnectionFactory.getConnection(); // pediu a conexao
            //preparando a query
            statement = connection.prepareStatement(sql); // esse metodo ajuda a 
            //preparar. 
            //o comando sql que vai ser executado no banco.
            //setando os valores
            statement = setInt(1, id); //coloca valor numero no texto, 
            //muda a interrogacao acima e substitui pelo numero do paramento 
            // - o valor recebido substitui a primeira ? colocada
            //executando a query
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa!"
                        + ex.getMessage(), ex);
        } finally {
            //ele sempre vai ser executado no final da execução do try
            //ConnectionFactory.closeConnection(connection, statement);
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão"
                            + ex.getMessage(), ex);
            }
        }
    }

    private PreparedStatement setInt(int i, int id) {
        throw new UnsupportedOperationException("Not supported yet.");
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
