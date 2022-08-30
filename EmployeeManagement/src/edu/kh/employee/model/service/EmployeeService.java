package edu.kh.employee.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.employee.model.vo.Management;

public class EmployeeService {
	
	private List<Management> mngList = new ArrayList<Management>();

	public boolean addEmplyee(int empId, String empName, String empNo, String email, String phone,
								String departmentTitle, String jobName, int salary) {
		Management mng = new Management(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		return mngList.add(mng);
	}
	
	public List<Management> getMngList(){
		return mngList;
	}


	public List<Management> selectManagement(int empId) {
		
		List<Management> resultList = new ArrayList<Management>();
		
		for(Management m : mngList) {
			if(m.getEmpId() == empId) {
				resultList.add(m);
			}
		}
		return resultList;
	}

	public boolean updateManagement(int empId,String email, String phone, String departementTitle, String jobName, int Salary) {
		for(Management m : mngList) {
			if(m.getEmpId()==empId) {
				return true;
			}
		}
		return false;
	}
	
	
}
