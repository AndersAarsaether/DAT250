package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
@Table(name="CREDIT_CARD")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int limit;
    private int balance;
    
    @OneToOne
    @JoinColumn(name = "PINCODE_ID")
    private Pincode pinCode;
    
    @ManyToOne
    @JoinTable(
      name = "BANK_CARDS",
      joinColumns = @JoinColumn(name = "CARD_ID"), 
      inverseJoinColumns = @JoinColumn(name = "BANK_ID"))
    private Bank bank;
    
    public CreditCard() {}
    
    public CreditCard(int number, int limit, int balance) {
    	this.number = number;
    	this.limit = limit;
    	this.balance = balance;
    }
    
    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public Pincode getPincode() {
        return pinCode;
    }

    public Bank getOwningBank() {
        return bank;
    }
    
    public void setPin(Pincode pin) {
    	this.pinCode = pin;
    }
    
    public void setBank(Bank bank) {
    	bank.addCard(this);
    	this.bank = bank;
    }
}
