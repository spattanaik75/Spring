//package dao;
//
//import model.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
///**
//* Created by user on 2014/12/03.
//*/
//public class EmployeeDao {
//
//    @Autowired
//    DataSource dataSource;
//
//
//    public int saveEmployee(Employee e){
//
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//
//        String sql = "INSERT INTO `test`.`employee` (`id`, `name`, `salary`) VALUES (?, ?, ?)";
//
//        return jdbcTemplate.update(sql,new Object[] {e.getId(),e.getName(),e.getSalary()});
//
//    }
//
//}
