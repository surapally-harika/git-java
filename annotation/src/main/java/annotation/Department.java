package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Department {
	
//	@Value("IT")
	public String deptname;
	
	@Autowired(required = true)
	@Qualifier("emp1")
	public Employee emp;
	
	public Department() {
		
		
	}

	public Department(String deptname, Employee emp) {
		super();
		this.deptname = deptname;
		this.emp = emp;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", emp=" + emp + "]";
	}

	
	

}
