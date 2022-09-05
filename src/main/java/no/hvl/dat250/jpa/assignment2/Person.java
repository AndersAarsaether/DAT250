package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @ManyToMany
    @JoinTable(
      name = "PERSON_ADDRESSES",
      joinColumns = @JoinColumn(name="PERSON_ID"),
      inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID"))
    private Set<Address> addresses;
    
    @OneToMany
    @JoinTable(
      name = "PERSON_CARD",
      joinColumns = @JoinColumn(name="PERSON_ID"),
      inverseJoinColumns = @JoinColumn(name = "CARD_ID"))
    private Set<CreditCard> creditCards;

    public Person() {}
    
    public Person(String name) {
		this.name = name;
		this.addresses = new HashSet<Address>();
		this.creditCards = new HashSet<CreditCard>();
	}

	public String getName() {
        return name;
    }

    public Collection<Address> getAdresses() {
        return addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return creditCards;
    }
    
    public void addCard(CreditCard card) {
    	creditCards.add(card);
    }
    
    public void addAddress(Address address) {
    	address.AddOwner(this);
    	addresses.add(address);
    }
}
