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
			res = "�л����";
		}
		else if(dr ==1) {
			res = "�������";
		}else {
			res = "�ڻ����";
		}
		this.dr = res;
	}
}
