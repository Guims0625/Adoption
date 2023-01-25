package com.group1.adoption.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int age;
    private String breed;
    private String gender;

    public Dog() {
    }

    public Dog(long id, String name, int age, String breed, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.age);
        hash = 79 * hash + Objects.hashCode(this.breed);
        hash = 79 * hash + Objects.hashCode(this.gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        if (!Objects.equals(this.age, other.age)) {
            return false;
        }

        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }

        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }

        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
