package Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import javax.swing.*;
import java.util.List;

public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToMany
    private List<Skill> skills;

    public Developer() {
        super();
    }

    public Developer(String firstName, String lastName, String email, List<Skill> skills) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public boolean hasSkill(Skill skill){
        for(Skill containedSKill: getSkills()){
            if(containedSKill.getId() == skill.getId()){
                return true;
            }
        }
        return false;
    }
}
