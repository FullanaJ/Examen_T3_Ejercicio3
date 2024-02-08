package api.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Entity
public class Client {
    //@Id
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String country;
    private String city;
    private String postalCode;
}
