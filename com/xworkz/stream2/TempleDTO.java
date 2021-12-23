package com.xworkz.stream2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TempleDTO implements Serializable {
	
	private Integer id;
	private String name;
	private String location;
	private String mainGod;
	private Integer visitorsOneDay;
	public TempleDTO(Integer id, String name, String location, String mainGod, Integer visitorsOneDay) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.visitorsOneDay = visitorsOneDay;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMainGod() {
		return mainGod;
	}
	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}
	public Integer getVisitorsOneDay() {
		return visitorsOneDay;
	}
	public void setVisitorsOneDay(Integer visitorsOneDay) {
		this.visitorsOneDay = visitorsOneDay;
	}
	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", mainGod=" + mainGod
				+ ", visitorsOneDay=" + visitorsOneDay + "]";
	}
	
	

}
