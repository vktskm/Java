package com.epicode.model;

import java.time.LocalDate;

public class Student {
	
	private Long id;
	private String name;
	private String lastname;
	private Character gender;
	private LocalDate birthdate;
	private Double avg;
	private Double min_vote;
	private Double max_vote;
	
	public Student(Long id, String name, String lastname, Character gender, LocalDate birthdate, Double avg,
			Double min_vote, Double max_vote) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public Student(String name, String lastname, Character gender, LocalDate birthdate, Double avg, Double min_vote,
			Double max_vote) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(Double min_vote) {
		this.min_vote = min_vote;
	}

	public Double getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(Double max_vote) {
		this.max_vote = max_vote;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", birthdate="
				+ birthdate + ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote + "]";
	}
	
	

}
