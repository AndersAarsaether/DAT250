package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private Set<CreditCard> creditCards;
    
    public Bank() {}

    public Bank(String name) {
    	this.name = name;
    	this.creditCards = new HashSet<CreditCard>();
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
       return name;
    }

    public Set<CreditCard> getOwnedCards() {
        return creditCards;
    }
    
    public void addCard(CreditCard card) {
    	creditCards.add(card);
    }
}
