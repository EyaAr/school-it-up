package tn.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.spring.enume.TypeParentSpace;

@Entity
public class ParentSpace implements Serializable{

static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParentSpace;
	@Temporal(TemporalType.TIMESTAMP)
	private Date defaultDate;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String response;
	@Enumerated(EnumType.STRING)
	TypeParentSpace type;
	private String agenda;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "idParent")
	Parent parent;
	
	
	
	
	
}
