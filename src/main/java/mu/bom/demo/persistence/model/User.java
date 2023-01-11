package mu.bom.demo.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String address;
    private String telephone;
    private Date created_at;
}
