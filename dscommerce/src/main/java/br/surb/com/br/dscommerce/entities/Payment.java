package br.surb.com.br.dscommerce.entities;

import br.surb.com.br.dscommerce.entities.Order;
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
@Table(name = "tb_payment")
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionUID = -1852460332491894873L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String paymentId;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;

    @PrePersist
    public void prePersist() {
        paymentId = String.valueOf(UUID.randomUUID());
    }
}
