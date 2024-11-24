package springcore;

import java.util.Map;

public class ClassD {
	
	
	public Map <Owner,Vehicle> map;
	
	
	public ClassD() {
		
	}


	public ClassD(Map<Owner, Vehicle> map) {
		super();
		this.map = map;
	}



	public Map<Owner, Vehicle> getMap() {
		return map;
	}

	public void setMap(Map<Owner, Vehicle> map) {
		this.map = map;
	}


	@Override
	public String toString() {
		return "ClassD [map=" + map + "]";
	}
	

}
