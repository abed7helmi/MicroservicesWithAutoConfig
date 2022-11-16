package org.sid.orderservice.model;
import lombok.Data;

//getters et setters
@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
}
