package teste1.pietra;

public abstract class Movies {

	private String name, country, hours;

	public Movies (String name, String country, String hours) {
		this.name = name;
		this.country = country;
		this.hours = hours;
	}
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
	
		public String getHours() {
			return hours;
		}
		public void setHours(String hours) {
			this.hours = hours;
		}
	
	public abstract void info();
		
}
