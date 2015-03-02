package edu.wctc.models;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author John
 */
public interface IDB_MySql {

    void openConnection() throws ClassNotFoundException, SQLException;
    
    List<Map<String, Object>> getAllRecords(String tableName) 
            throws SQLException, ClassNotFoundException;
    
    Map getRecordById(String tableName, String primaryKeyField, Object keyValue) 
            throws SQLException, ClassNotFoundException;
    
    int deleteRecord(String tableName, String whereField, Object whereValue) 
            throws SQLException, ClassNotFoundException;
    
    int updateRecord(String tableName, List colDescriptors, List colValues, 
            String whereField, Object whereValue)throws SQLException, 
            ClassNotFoundException;
    
    int insertNewRecord(String tableName, List colDescriptors, List colValues) 
            throws SQLException, ClassNotFoundException ;
    
}
