/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.core.entity.dao;


import java.sql.PreparedStatement;
//import conexao.Conexao;
import laboratorio.core.entity.Exame;
//import entity.Usuario;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO{
    public void cadastrarUsuario (Exame usuario) throws SQLException{

        String sql = "INSERT INTO USUARIO (NOME, TIPO_SANGUINEO, IDADE, ) VALUES (?,?,?,)";

        PreparedStatement ps =null;

        try {
            ps = LaboratorioDAO.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNomePaciente());
            ps.setString(2, usuario.getTipoSanguineo());
            ps.setInt(3, usuario.getIdade());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
