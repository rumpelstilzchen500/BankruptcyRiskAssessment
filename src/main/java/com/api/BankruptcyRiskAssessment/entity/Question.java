package com.api.BankruptcyRiskAssessment.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity(name = "TestCategory")
@Table(name = "testCategory")
@EntityListeners(AuditingEntityListener.class)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "testId", nullable = false)
    private Test test;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int points;

}
