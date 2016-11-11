package com.sang.Beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.sang.Model.Employee;
import com.sang.Service.Employeeservice;

@ManagedBean(name = "empManagedBean")
@SessionScoped
public class EmpManagedBean {
	@ManagedProperty("#{Employeeservice}")
	private Employeeservice empService;
	private Employee employee = new Employee();
	
	
	
	
	public Employeeservice getEmpService() {
		return empService;
	}
	public void setEmpService(Employeeservice empService) {
		this.empService = empService;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String addEmployee(){
		empService.addEmp(employee);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("The Employee"
				+ this.employee.getEmpName()+" is added Successfully "));
		return "";
		
	}
	
}
