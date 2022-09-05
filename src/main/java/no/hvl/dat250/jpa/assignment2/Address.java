package no.hvl.dat250.jpa.assignment2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int number;
    
    @ManyToMany(mappedBy = "addresses")
    private Set<Person> owners;
    
    public Address() {}
    
    public Address(String street, int number) {
    	this.street = street;
    	this.number = number;
    	this.owners = new HashSet<Person>();
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public Set<Person> getOwners() {
    	return owners;
    }
    
    public void AddOwner(Person person) {
    	owners.add(person);
    }
}
