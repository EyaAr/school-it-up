package tn.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment implements Serializable{
static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComment;
	private Boolean archived;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Annoncement annoncement;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(Long idComment, Boolean archived, String content, Date date) {
		super();
		this.idComment = idComment;
		this.archived = archived;
		this.content = content;
		this.date = date;
	}
	public Long getIdComment() {
		return idComment;
	}
	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
		return "Comment [idComment=" + idComment + ", archived=" + archived + ", content=" + content + ", date=" + date
				+ "]";
	}
	
	
}
