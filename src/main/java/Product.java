import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;
    @Column(name = "product_name",nullable=false)
    private String name;
    @Column(name = "product_price",nullable=false)
    private double price;
    @Column(name = "product_stock")
    private int stock;

    @OneToOne
    @JoinColumn(name = "product_code_id",referencedColumnName = "code_id")
    private Code code;
}
