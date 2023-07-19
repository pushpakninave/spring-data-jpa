package com.aliencodes.distinctentites.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// rather than defining a seperate entity and a table in database we are using annotation called @Embeddable
// through this we can intrisicly use this class inside studentEntity.
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "GUARDIAN_NAME")),
        @AttributeOverride(name = "emailId", column = @Column(name = "GUARDIAN_EMAIL_ID")),
        @AttributeOverride(name = "mobile", column = @Column(name = "GUARDIAN_MOBILE"))
})
public class GuardianEntity {

    private String name;
    private String emailId;
    private String mobile;
}
