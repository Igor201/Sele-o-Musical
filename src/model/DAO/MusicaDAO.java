/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import connection.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Igor
 */
public class MusicaDAO {

    private Connection conect = null;

    public MusicaDAO() {
        conect = ConnectionFactory.getConnection();
    }
    
}
