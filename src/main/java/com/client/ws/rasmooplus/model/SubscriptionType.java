package com.client.ws.rasmooplus.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscription_type")
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;
    private String name;
    @Column(name = "access_months")
    private Long accessMonth;
    private BigDecimal price;
    @Column(name = "product_key")
    private String productKey;

}