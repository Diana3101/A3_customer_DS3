package customer.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Customer {
    @Id
    private UUID customerId;
    private String firstName;
    private String lastName;
    private Size size;

    public Customer(){

    }

    public Customer(UUID customerId, String firstName, String lastName, Size size) {
        //this.id = UUID.randomUUID();
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.size = size;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", size=" + size +
                '}';
    }
}
