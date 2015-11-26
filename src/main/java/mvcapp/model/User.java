package mvcapp.model;

import java.util.Date;

/**
 * Created by Oleksandra_Dmytrenko on 11/25/2015.
 */
public class User {
    private Long id;
    private String login;
    private String name;
    private String email;
    private Date birthDate;
    private Boolean active;

    public User() {
    }

    public User(String login, String name, String email, Date birthDate, Boolean active) {
        this.login = login;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
