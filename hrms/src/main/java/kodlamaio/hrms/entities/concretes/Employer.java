package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {

    @Column(name="company_name")
    private String companyName;

    @Column(name="web_address")
    private String webSite;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="is_activated")
    private boolean isActivated;





}
