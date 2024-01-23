package myproject.demo.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;

@Embeddable @Getter
public class AddressInfo {

    private String zipCode;
    private String detailAddress;

    private String recipientName;
    private String recipientPhoneNumber;
    private String request;
    private String additionalInfo;
}
