package br.surb.com.br.dscommerce.entities;

import br.surb.com.br.dscommerce.shared.AppEnums.OrderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = -1852460332491894873L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderId;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderEnum status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @PrePersist
    public void prePersist() {
        orderId = String.valueOf(UUID.randomUUID());
        status = OrderEnum.WAITING_PAYMENT;
    }
}
