package projmays.beans;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Column;
	import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


	@Entity
	@EnableAutoConfiguration
	@Table(name="studentinfo")
	public class StudentInfo {
		@Id
		@GeneratedValue
		@Column(name="NAME")
		private String name;
		@Column(name="ID")
		private int id;
		@Column(name="MAJOR")
		private String major;
		@Column(name="YEAR")
		private String year;
		@Column(name="TUITION")
		private double tuition;
		
		public StudentInfo() {
			super();
			this.name = "Name";
		}
		
		public StudentInfo(String name, int id, String major, String year, double tuition) {
			this.name = name;
			this.id = id;
			this.major = major;
			this.year = year;
			this.tuition = tuition;
		}
		public StudentInfo(String name, int id, String major, String year) {
			this.name = name;
			this.id = id;
			this.major = major;
			this.year = year;
		}
		public StudentInfo(String name, int id, String major) {
			this.name = name;
			this.id = id;
			this.major = major;
		}
		public StudentInfo(String name, int id) {
			this.name = name;
			this.id = id;
		}
		public StudentInfo(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public double getTuition() {
			return tuition;
		}

		public void setTuition(double tuition) {
			this.tuition = tuition;
		}
		
		@Override
		public String toString() {
			return "Name: " + this.name + " | " + " ID: " + this.id + " | " + " Major: " + this.major + " | " + " Year: " + this.year + " | " + " Tuition: " + this.tuition;
		}
		

	}


