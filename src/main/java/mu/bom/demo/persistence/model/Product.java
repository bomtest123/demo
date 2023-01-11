package mu.bom.demo.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String desc;
    private String category;
    private double price;
    private Date created_at;
}
