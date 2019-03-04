package com.api.BankruptcyRiskAssessment.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity (name = "Users")
@Table (name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Size(min = 5, max = 20)
    private String firstName;

    @Column(nullable = false)
    @Size(min = 5, max = 20)
    private String lastName;

    @Column(nullable = true)
    @Size(min = 5, max = 20)
    private String surname;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    private Long phone;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "departmentId", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;
}
