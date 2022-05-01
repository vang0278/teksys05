package com.perscholas.club;

public class ClubMember {
	private String name;
	private String city;
	private String state;
	private String favorite;

	public ClubMember(String name, String city, String state, String favorite) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.favorite = favorite;
	}

	public ClubMember(ClubMember m) {
		this(m.name, m.city, m.state, m.favorite);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	@Override
	public String toString() {
		return "ClubMember [name=" + name + ", city=" + city + ", state=" + state + ", favorite=" + favorite + "]";
	}

}
