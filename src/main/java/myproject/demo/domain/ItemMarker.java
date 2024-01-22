package myproject.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ItemMarker {

    @Id
    @GeneratedValue
    @Column(name = "itemmarker_id")
    private Long id;

    private Marker marker;

}
