package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pinCode;
    private int count;
    
    public Pincode() {}
    
    public Pincode(String pinCode, int count) {
		this.pinCode = pinCode;
		this.count = count;
	}

	public Long getId() {
        return id;
    }

    public String getPincode() {
        return pinCode;
    }

    public int getCount() {
        return count;
    }
}
