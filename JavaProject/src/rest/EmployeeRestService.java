package rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restexample.ejb.EmployeeBean;

import model.Employee;

@Stateless
@Path("employees")
public class EmployeeRestService {

	@Inject
	private EmployeeBean employeeBean;

	@GET
	@Path("getAllEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployee() {
		return employeeBean.getAllEmplyees();
	}
	
	//Get A specific user 
	@GET
	@Path("getEmployee/{id}")
	public Employee getEmployee(@PathParam("id") Long id) {
		
		
		return null;
	}
	
	@POST
	@Path("createEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String PostEmployee(Employee employee) {

		Employee newEmployee = new Employee();
		newEmployee.setId(employee.getId());
		newEmployee.setName(employee.getName());

		employeeBean.createEmplyee(newEmployee);

		System.out.println(employee);

		return newEmployee.getName() + " has been added";
	}
}
