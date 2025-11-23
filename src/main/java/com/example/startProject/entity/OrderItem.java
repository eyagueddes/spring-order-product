
//Since one order contains multiple products and a product can appear in many orders, you need an intermediate table → OrderItem.

@Entity
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
}

//Order 1 → n OrderItem

//Product 1 → n OrderItem

//Therefore: Order ↔ Product is Many-to-Many via OrderItem