package hellojpa;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "address_history")
public class AddressEntity {

    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    public AddressEntity() {
    }

    public AddressEntity(String city, String street, String zipcode) {
        this.address = new Address(city, street, zipcode);
    }

    public AddressEntity(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AddressEntity that = (AddressEntity) object;
        return Objects.equals(id, that.id) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address);
    }
}
