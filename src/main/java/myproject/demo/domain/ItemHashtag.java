package myproject.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ItemHashtag {

    @Id
    @GeneratedValue
    @Column(name = "item_hashtag_id")
    private Long id;

    private String hashtag;
}
