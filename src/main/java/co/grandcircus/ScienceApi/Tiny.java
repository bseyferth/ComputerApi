package co.grandcircus.ScienceApi;

import java.util.List;

public class Tiny {

	private List<Tiny> tiny;
	private String name;
	private String invented;
	private Integer year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Tiny(List<Tiny> tiny,String name, String invented, Integer year) {
		super();
		this.tiny = tiny;
		this.name = name;
		this.invented = invented;
		this.year = year;
	}
	
	public Tiny() {
	}
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	@Override
	public String toString() {
		return "Tiny [tiny=" + tiny + ", name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}

	
}
