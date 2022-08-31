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
public class Annoncement implements Serializable {
static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnnoncement;
	private String description;
	private Boolean archived;
	@Temporal(TemporalType.DATE)
	private Date date;
	public Long getIdAnnoncement() {
		return idAnnoncement;
	}
	public void setIdAnnoncement(Long idAnnoncement) {
		this.idAnnoncement = idAnnoncement;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
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
		return "Annoncement [idAnnoncement=" + idAnnoncement + ", description=" + description + ", archived=" + archived
				+ ", date=" + date + "]";
	}
	public Annoncement(Long idAnnoncement, String description, Boolean archived, Date date) {
		super();
		this.idAnnoncement = idAnnoncement;
		this.description = description;
		this.archived = archived;
		this.date = date;
	}
	public Annoncement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
