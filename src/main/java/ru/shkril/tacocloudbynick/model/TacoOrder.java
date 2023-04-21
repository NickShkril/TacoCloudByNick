package ru.shkril.tacocloudbynick.model;


import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name ="Taco_Order")
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date placedAt = new Date();
    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String deliveryName;
    @NotBlank(message = "Street is required")
    @Size(min = 5, message = "Street must be at least 5 characters long")
    private String deliveryStreet;
    @NotBlank(message = "City is required")
    @Size(min = 5, message = "City must be at least 5 characters long")
    private String deliveryCity;
    @NotBlank(message = "State is required")
    @Size(min = 5, message = "State must be at least 5 characters long")
    private String deliveryState;
    @NotBlank(message = "Zip code is required")
    @Size(min = 3, message = "Zip Code must be at least 5 characters long")
    private String deliveryZip;
    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Taco> tacos = new ArrayList<>();

    @ManyToOne
    private User user;

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
