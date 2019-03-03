package com.api.BankruptcyRiskAssessment.entity.efficiencyFactor;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity(name = "CompanyEfficiencyFactor")
@Table (name = "companyEfficiencyFactor")
@EntityListeners(AuditingEntityListener.class)
public class CompanyEfficiencyFactor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer efficiencyFactor;

    @Column(nullable = false)
    private Date date;
}
