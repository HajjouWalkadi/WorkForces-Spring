package com.workforces;

import com.workforces.entities.Departement;
import com.workforces.entities.Employee;
import com.workforces.service.DepartementService;
import com.workforces.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Departement departement = applicationContext.getBean("departement", Departement.class);
        departement.setName("Architect");
        DepartementService departementService = applicationContext.getBean("departementService", DepartementService.class);
        departementService.save(departement);
        Employee employee = applicationContext.getBean("employee",Employee.class);
        employee.setName("Hajjou");
        employee.setSalaire(9000D);
        employee.setDepartement(departement);
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        employeeService.save(employee);

    }
}
