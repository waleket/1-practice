package Library;

class Kniga extends Izdanie {
	private String kategory;
	private String author;

	public Kniga(String kategory, String author, String name) {

		this.kategory = kategory;
		this.author = author;
		name = super.getName();
	}

	public String getKategory() {
		return kategory;
	}

	public String getAuthor() {
		return author;
	}

	public void setKategory(String kategory) {
		this.kategory = kategory;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Название  " + super.getName() + " Категория " + kategory + "Автор " + author;

	}
}