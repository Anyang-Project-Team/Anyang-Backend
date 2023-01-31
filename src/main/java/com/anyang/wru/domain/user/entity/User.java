package com.anyang.wru.domain.user.entity;

import com.anyang.wru.global.common.Timestamped;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", columnDefinition = "NOT NULL")
    private String email;


    @Builder
    public User(String email) {
        this.email = email;
    }
    
}
