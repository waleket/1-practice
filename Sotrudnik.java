package Library;

public class Sotrudnik extends Person implements Print {
	private String dolznost;

	public String getDolznost() {
		return dolznost;
	}

	public void setDolznost(String dolznost) {
		this.dolznost = dolznost;
	}

	public void print() {
		System.out.println("Имя сотрудника " + super.getIme() + "Должность " + getDolznost());
	}
}
