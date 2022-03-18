package backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String street;
    String additionalInfo;
    String zipCode;
    String city;

    @OneToMany(mappedBy = "connectedAddress")
    private Set<Person> members = new HashSet<>();

    public Address(String street, String additionalInfo, String zipCode, String city) {
        this.street = street;
        this.additionalInfo = additionalInfo;
        this.zipCode = zipCode;
        this.city = city;
    }
}
