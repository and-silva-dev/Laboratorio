//Futura conexao com Banco de Dados
package laboratorio.core.entity.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LaboratorioDAO{

    private static final String url = "jdbc:mysql://localhost:3306/mapa";
    private static final String user = "root";
    private static final String password = "Insira senha do banco de dados";

    private static Connection conn;

    public static Connection getConexao() throws SQLException{
        try{
            if(conn == null){
             conn = DriverManager.getConnection(url, user, password);
             return conn;
          }else {
               return conn;
            }
            }catch(SQLException e){
                e.printStackTrace();
            return null;
        }
    }
}