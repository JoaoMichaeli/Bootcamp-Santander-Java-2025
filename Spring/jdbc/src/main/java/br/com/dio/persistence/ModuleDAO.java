package br.com.dio.persistence;

import br.com.dio.persistence.entity.ContactEntity;
import br.com.dio.persistence.entity.EmployeeEntity;
import br.com.dio.persistence.entity.ModuleEntity;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.ZoneOffset.UTC;

public class ModuleDAO {

    public List<ModuleEntity> findAll(){
        List<ModuleEntity> entities = new ArrayList<>();
        var sql = "select m.id module_id,\n" +
                "       m.name module_name,\n" +
                "       e.id employee_id ,\n" +
                "       e.name employee_name,\n" +
                "       e.salary employee_salary,\n" +
                "       e.birthday employee_birthday\n" +
                "  from modules m\n" +
                " inner join accesses a \n" +
                "    on a.module_id = m.id \n" +
                " INNER JOIN  employees e \n" +
                "    on e.id = a.employee_id\n" +
                " ORDER BY m.id";
        try(
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement(sql)
        ){
            statement.executeQuery();
            var resultSet = statement.getResultSet();
            var hasNext = resultSet.next();
            while (hasNext){
                ModuleEntity module = new ModuleEntity();
                module.setId(resultSet.getLong("module_id"));
                module.setName(resultSet.getString("module_name"));
                module.setEmployees(new ArrayList<>());
                do{
                    var employee = new EmployeeEntity();
                    employee.setId(resultSet.getLong("employee_id"));
                    employee.setName(resultSet.getString("employee_name"));
                    employee.setSalary(resultSet.getBigDecimal("employee_salary"));
                    var birthdayInstant = resultSet.getTimestamp("employee_birthday").toInstant();
                    employee.setBirthday(OffsetDateTime.ofInstant(birthdayInstant, UTC));
                    module.getEmployees().add(employee);
                    hasNext = resultSet.next();
                }while ((hasNext) && (module.getId() == resultSet.getLong("module_id")));
                entities.add(module);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return entities;
    }

}
