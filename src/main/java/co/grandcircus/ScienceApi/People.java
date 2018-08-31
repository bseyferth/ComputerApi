package co.grandcircus.ScienceApi;

import java.util.List;

public class People {
	
	public List<Complete> complete;
	public List<Tiny> tiny;
	
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	public People(List<Complete> complete, List<Tiny> tiny) {
		super();
		this.complete = complete;
		this.tiny = tiny;
	}
	
	public People() {
	}
	@Override
	public String toString() {
		return "People [complete=" + complete + ", tiny=" + tiny + "]";
	}
	

}
