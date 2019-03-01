package com.api.BankruptcyRiskAssessment.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "TestCategory")
@Table(name = "testCategory")
@EntityListeners(AuditingEntityListener.class)
public class TestCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testCategoryId;

    @Column(nullable = false)
    private String name;

    public TestCategory(){}
}
