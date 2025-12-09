package ma.project.bean;

public class Profile implements Identifiable {

	private static int counter = 0;
	private final int id = ++counter;
	private String code;
	private String description;

	public Profile(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", code=" + code + ", description=" + description + "]\n";
	}

}
