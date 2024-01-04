package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String nom;
    private String prenom;
    @Transient
    private int age;


    private int classe;

    //Constructeurs

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, int classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    //Getters /Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
