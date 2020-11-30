package school;

public class StuDr extends Student{
	String dr, drdep;

	public String getDr() {
		return dr;
	}
	public StuDr(String name, String dep, int grade) {
		super.name = name;
		super.dep = dep;
		super.grade = grade;
	}

	public String getDrdep() {
		return drdep;
	}
	public void setDrdep(String drdep) {
		this.drdep = drdep;
	}
	public void setDr(int dr) {
		String res;
		if(dr == 0) {
			res = "학사과정";
		}
		else if(dr ==1) {
			res = "석사과정";
		}else {
			res = "박사과정";
		}
		this.dr = res;
	}
}
