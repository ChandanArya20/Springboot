package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.model.Employee;

@Component(value="dao")
public class EmployeeDaoImpl implements IEmployeeDao{
	private static final String SQL_SELECT_QUERY="SELECT id,address,name,salary from employee";
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		
		System.out.println("DataSorce implementation class : "+dataSource.getClass().getName());
		try(Connection con=dataSource.getConnection();PreparedStatement pstm=con.prepareStatement(SQL_SELECT_QUERY);				
				ResultSet resultSet=pstm.executeQuery()){
			
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			while(resultSet.next()) {
				
				Employee emp=new Employee();
				
				emp.setId(resultSet.getInt(1));
				emp.setAddress(resultSet.getString(2));
				emp.setName(resultSet.getString(3));
				emp.setSalary(resultSet.getInt(4));
				
				list.add(emp);
			}
			
			return list;
		}				
	}
	
	
}
