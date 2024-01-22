package myproject.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SubscriptionDelivery {

    @Id
    @GeneratedValue
    @Column(name = "subscription_delivery_id")
    private Long id;

}
