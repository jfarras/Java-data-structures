
public class Student {
	private String login;
	private String name;
	private Student partner;
	
	public Student(String login, String name, Student partner) {
		super();
		this.login = login;
		this.name = name;
		this.partner = partner;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student getPartner() {
		return partner;
	}
	
	public void setPartner(Student partner) {
		this.partner = partner;
	}
}