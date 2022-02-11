package com.PatikaDev.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String userName;

    @Column(name = "surname")
    private String userLastName;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date")
    private String date;


}
