package br.com.dio.persistence;

import br.com.dio.persistence.entity.EmployeeAuditEntity;
import br.com.dio.persistence.entity.OperationEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.ZoneOffset.UTC;
import static java.util.Objects.isNull;

public class EmployeeAuditDAO {

    public List<EmployeeAuditEntity> findAll(){
        List<EmployeeAuditEntity> entities = new ArrayList<>();
        try(
                var connection = ConnectionUtil.getConnection();
                var statement = connection.createStatement()
        ){
            statement.executeQuery("SELECT * FROM view_employee_audit");
            var resultSet = statement.getResultSet();
            while (resultSet.next()){
                entities.add(new EmployeeAuditEntity(
                        resultSet.getLong("employee_id"),
                        resultSet.getString("name"),
                        resultSet.getString("old_name"),
                        resultSet.getBigDecimal("salary"),
                        resultSet.getBigDecimal("old_salary"),
                        getDateTimeOrNull(resultSet, "birthday"),
                        getDateTimeOrNull(resultSet, "old_birthday"),
                        OperationEnum.getByDbOperation(resultSet.getString("operation"))
                ));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return entities;
    }

    public OffsetDateTime getDateTimeOrNull(final ResultSet resultSet, final String field) throws SQLException {
        return isNull(resultSet.getTimestamp(field)) ? null :
                OffsetDateTime.ofInstant(
                        resultSet.getTimestamp(field).toInstant(),
                        UTC);
    }

}
