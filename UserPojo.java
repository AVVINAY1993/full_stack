package com.user.userformdetails.entity;

import jakarta.persistence.*;


@Entity
@Table(name ="Users")
public class UserPojo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(nullable = false,length =15)

    private String firstname;
    @Column(nullable = false,length =15)
    private String lastname;
    @Column(nullable = false,length =15)
    private String gender;
    @Column(nullable = false,length =20,unique = true)
    private String email;


    public UserPojo() {
    }
    public UserPojo(Long id , String firstname,String lastname, String email, String gender) {

        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.gender=gender;
        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "UserPojo{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


