package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="ORDERS")
public class Orders {

    @Id
    private Long orderId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
