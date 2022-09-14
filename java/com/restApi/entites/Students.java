package com.restApi.entites;

public class Students {
	private int id;
	private String name;
	private String last;
	private String studPassingYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getStudPassingYear() {
		return studPassingYear;
	}

	public void setStudPassingYear(String studPassingYear) {
		this.studPassingYear = studPassingYear;
	}

	public Students(int id, String name, String last, String studPassingYear) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.studPassingYear = studPassingYear;
	}

	public Students() {
		super();

	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", last=" + last + ", studPassingYear=" + studPassingYear
				+ "]";
	}

}
