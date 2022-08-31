package tn.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Convocation implements Serializable{
	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCovocation;
	private String duree;
	private String raison;
	@Temporal(TemporalType.DATE)
	private Date date;
	public Convocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Convocation(Long idCovocation, String duree, String raison, Date date) {
		super();
		this.idCovocation = idCovocation;
		this.duree = duree;
		this.raison = raison;
		this.date = date;
	}
	public Long getIdCovocation() {
		return idCovocation;
	}
	public void setIdCovocation(Long idCovocation) {
		this.idCovocation = idCovocation;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Convocation [idCovocation=" + idCovocation + ", duree=" + duree + ", raison=" + raison + ", date="
				+ date + "]";
	}
	
	
	

}
