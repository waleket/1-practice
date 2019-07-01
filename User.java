package Library;

public class User extends Person implements Print {

	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void print() {
		System.out.println("Имя " + super.getIme() + "Возраст " + getAge());
	}
}
