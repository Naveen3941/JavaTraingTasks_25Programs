package example;

public class Cargo {
	private String name;
	private String description;
	private double width;
	private double length;
	
	public void displayCargoDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Description :"+description);
		System.out.println("Length : "+length+" cm");
		System.out.println("Width :"+width+" cm");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	

}
