package com.group1.adoption.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "adopters")
public class Adopter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String address;
    private String contactNo;
    private String adoptDogName;

    public Adopter() {
    }

    public Adopter(long id, String name, String address, String contactNo, String adoptDogName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.adoptDogName = adoptDogName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAdoptDogName() {
        return adoptDogName;
    }

    public void setAdoptDogName(String adoptDogName) {
        this.adoptDogName = adoptDogName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.address);
        hash = 79 * hash + Objects.hashCode(this.contactNo);
        hash = 79 * hash + Objects.hashCode(this.adoptDogName);
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
        final Adopter other = (Adopter) obj;

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        if (!Objects.equals(this.address, other.address)) {
            return false;
        }

        if (!Objects.equals(this.contactNo, other.contactNo)) {
            return false;
        }

        if (!Objects.equals(this.adoptDogName, other.adoptDogName)) {
            return false;
        }

        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adopter{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", contactNo='").append(contactNo).append('\'');
        sb.append(", adoptDogName=").append(adoptDogName);
        sb.append('}');
        return sb.toString();
    }
}
