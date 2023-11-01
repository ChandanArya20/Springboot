package in.ineuron;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dao.EmployeeDaoImpl;
import in.ineuron.dao.IEmployeeDao;
import in.ineuron.model.Employee;

@SpringBootApplication
public class BasicDbOperationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicDbOperationApplication.class, args);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		
		
		IEmployeeDao dao=context.getBean("dao",EmployeeDaoImpl.class);
		
		try {
			
			List<Employee> allEmployee = dao.getAllEmployee();
			
			allEmployee.forEach(System.out::println);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
