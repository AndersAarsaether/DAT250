package no.hvl.dat250.jpa.assignment2.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import no.hvl.dat250.jpa.assignment2.*;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";
    
    public static void main(String[] args) {
    	
    	Bank bank = new Bank("Pengebank");
        
        Pincode pin = new Pincode("123", 1);
        
        CreditCard card1 = new CreditCard(12345, -10000, -5000);
        CreditCard card2 = new CreditCard(123, 2000, 1);
        
        Address address = new Address("Inndalsveien", 28);
        
        Person person = new Person("Max Mustermann");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
       
        tx.begin();
        
        em.persist(bank);
        em.persist(pin);
        card1.setPin(pin);
        card1.setBank(bank);
        em.persist(card1);
        card2.setPin(pin);
        card2.setBank(bank);
        em.persist(card2);
        em.persist(address);
        person.addCard(card1);
        person.addCard(card2);
        person.addAddress(address);
        em.persist(person);
        
        tx.commit();
        
        em.close();
        factory.close();
    }
}
