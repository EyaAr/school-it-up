package tn.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.spring.enume.TypeClaim;

@Entity
public class Claim implements Serializable{

	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClaim;
	private String subject;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Enumerated(EnumType.STRING)
	TypeClaim type;
	
	
	
	
	
	public Claim() {}
	
	
	public Claim(Long idClaim, String subject, String description, Date createdAt, TypeClaim type) {
		super();
		this.idClaim = idClaim;
		this.subject = subject;
		this.description = description;
		this.createdAt = createdAt;
		this.type = type;
	}
	public Long getIdClaim() {
		return idClaim;
	}
	public void setIdClaim(Long idClaim) {
		this.idClaim = idClaim;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public TypeClaim getType() {
		return type;
	}
	public void setType(TypeClaim type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Claim [idClaim=" + idClaim + ", subject=" + subject + ", description=" + description + ", createdAt="
				+ createdAt + ", type=" + type + "]";
	}
	
	
}
