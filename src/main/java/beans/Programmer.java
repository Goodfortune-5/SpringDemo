package beans;
 
public class Programmer extends Employee {
	String programmingSkill;
 
	public Programmer() {}
	public Programmer(String programmingSkill) {
		super();
		this.programmingSkill = programmingSkill;
	}
 
	public String getProgrammingSkill() {
		return programmingSkill;
	}
 
	public void setProgrammingSkill(String programmingSkill) {
		this.programmingSkill = programmingSkill;
	}
 
	@Override
	public String toString() {
		return "Programmer [programmingSkill=" + programmingSkill + ", empId=" + empId + ", name=" + name
				+  "]";
	}

	}
