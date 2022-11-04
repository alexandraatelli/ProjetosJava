package util;

//importes para conexao com o BD são: sao na verdade classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//classe responsavel por criar conexão com o BD e devolver valores onde necessitarmos
public class ConnectionFactory {

    /**
     * Parametros: são os 4 atributos principais para criar conexao com BD
     *
     * DRIVER de conexao - faz a ponte entre a aplicacao e o BD - qual usar?
     * Aqui cria-se uma variável para dizer que o banco MySQL - jdbc e o driver.
     */
    public static final String DRIVER = "com.mysql.jdbc.Driver"; // nao muda nunca

    /* URL é o caminho de conexao ate o BD. Embora ambos em nosso computador,
    * assim precisamos dizer o caminho de conexao - localhost (se fosse no servidor
    * o banco, seria o endereco do servidor. 
    * Porta é a porta que aparece no apache 3306
     */
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";

    // USER - qual usuario usar? geralmente "root" por padrão para se conectar ao BD;
    public static final String USER = "root";

    // PASS - a senha do usuario por padrao deixa vazio.
    public static final String PASS = "";

    //criar 3 metodos sendo: 1 criar conexao e 2 para fechar
    //não precisa criar instancia a classe ConnectionFactory.
    //static porque nao precisa instanciar a classe
    // conexao
    public static Connection getConnection() {
        // try catch pega os erros que podem ocorrer e faz um tratamento de erros
        // ele executa logo apos o erro acontecer - ele para no erro e pula para a mensagem do erro
        try {
            Class.forName(DRIVER);//qual driver quero usar?
            return DriverManager.getConnection(URL, USER, PASS);
            //solicita para o driveManager a conexao com os parametros passados.
            //Esse método DriverManager tambem e um metodo statico
        } catch (Exception ex) {
            //lança uma excecao - da mensagem de erro.
            throw new RuntimeException("Erro na conexao com o banco de dados!", ex);
        }
    }

    //recebe o parametro e avalia se a conexao existe de fato, se ela existe fecha a conexao
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexao com o Banco de Dados!", ex);
        }

    }

    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }

            if (statement != null) {
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexao com o Banco "
                        + "de Dados!", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if (connection != null) {
                connection.close();
            }

            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexao com o Banco "
                        + "de Dados!", ex);
        }
    }

    public static class closeConnection {

        public closeConnection() {
        }
    }
}
