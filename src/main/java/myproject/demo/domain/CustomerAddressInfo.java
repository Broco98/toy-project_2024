package myproject.demo.domain;

import jakarta.persistence.*;

@Entity
public class CustomerAddressInfo{

    @Id @GeneratedValue
    @Column(name = "customer_address_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @Embedded
    private AddressInfo addressInfo;
    private Boolean isDefaultAddress;

}
