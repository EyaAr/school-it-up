package tn.spring.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
//public class Parent extends Account{
public class Parent implements Serializable{
	
	
	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParent;
	private String firstName;
	private String lastName;
	private String mail;
	private String cin;
	private String adresse;
	private String passe;
	private String etatCivil;
	private int phoneNb;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@JsonIgnore 
	@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
	Set<ParentSpace> ParentSpaceList;
	
	public Parent() {}
	
	
	public Parent(String firstName, String lastName, String mail, String cin, String adresse, String passe,
			String etatCivil, int phoneNb, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.cin = cin;
		this.adresse = adresse;
		this.passe = passe;
		this.etatCivil = etatCivil;
		this.phoneNb = phoneNb;
		this.birthDate = birthDate;
	}


	
	public Long getIdParent() {
		return idParent;
	}
	public void setIdParent(Long idParent) {
		this.idParent = idParent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPasse() {
		return passe;
	}
	public void setPasse(String passe) {
		this.passe = passe;
	}
	public String getEtatCivil() {
		return etatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}
	public int getPhoneNb() {
		return phoneNb;
	}
	public void setPhoneNb(int phoneNb) {
		this.phoneNb = phoneNb;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "Parent [idParent=" + idParent + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", cin=" + cin + ", adresse=" + adresse + ", passe=" + passe + ", etatCivil=" + etatCivil
				+ ", phoneNb=" + phoneNb + ", birthDate=" + birthDate + "]";
	}
	
	
	
	

}
