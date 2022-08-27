package com.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;



@Entity
public class Prof implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String matiere;
    private String phone;
    private String imageUrl;
    private String dateabs;
    private String classe;
    private String heure;
    @Column(nullable = false, updatable = false)
    private String profCode;
    

    public Prof() {}

    public Prof(String heure,String classe,String dateabs,String name, String email, String phone, String imageUrl, String ProfCode,String matiere) {
        this.name = name;
        this.email = email;
        this.dateabs=dateabs;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.heure=heure;
        this.classe=classe;
        this.matiere=matiere;
        

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  

    public String getPhone() {
        return phone;
    }
    public String getmatiere(){
        return matiere ;
    }
    public void setmatiere(String matiere){
        this.matiere=matiere;
    }
    public String getdateabs(){
        return dateabs ;
    }
    public void setdateabs(String dateabs){
        this.dateabs=dateabs;
    }
    public String getclasse(){
        return classe;
    }
    public void setclasse(String classe){
        this.classe=classe;
    }
    public String getheure(){
        return heure;
    }
    public void setheure(String heure){
        this.heure=heure;

    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

   
    @Override
    public String toString() {
        return "Professeur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", matiere='" + matiere + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                
                ", dateabs='" + dateabs + '\'' +
                ", classe='" + classe + '\'' +
                ", heure='" + heure + '\'' +




                '}';
    }
}