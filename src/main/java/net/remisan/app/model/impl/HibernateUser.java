package net.remisan.app.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import net.remisan.app.model.User;
import net.remisan.security.model.SecurityRole;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@XmlRootElement
@Table(name = "users", schema = "credentials")
public class HibernateUser implements User {

    private static final long serialVersionUID = 2695136190358836587L;

    /******************************************************************************
     ******************************* PROPERTIES ***********************************
     ******************************************************************************/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotNull
    @NotEmpty
    @Email
    @Column(name = "user_email", nullable = false, length = 255)
    private String email;

    @NotNull
    @NotEmpty
    @Column(name = "user_login", unique = true, nullable = false, length = 255)
    private String login;

    @XmlTransient
    @JsonIgnore
    @Column(name = "user_password", nullable = false, length = 255)
    private String password;

    @Transient
    @XmlTransient
    @JsonIgnore
    private String plainPassword;
    
    @Transient
    @XmlTransient
    @JsonIgnore
    private String plainPasswordConfirmation;
    
    @Column(name = "user_first_name", length = 255)
    private String firstName;
    
    @Column(name = "user_last_name", length = 255)
    private String lastName;
    
    @Column(name = "user_address", length = 255)
    private String address;
    
    @Column(name = "user_address2", length = 255)
    private String address2;
    
    @Column(name = "user_city_name", length = 150)
    private String cityName;
    
    @Column(name = "user_postal_code", length = 15)
    private String postalCode;
    
    @Column(name = "user_country_name", length = 150)
    private String countryName;

    @Column(name = "user_enabled")
    private boolean enabled;

    @XmlTransient
    @JsonIgnore
    @Column(name = "user_activation_token", length = 50, unique = true)
    private String activationToken;

    @Column(name = "user_creation_date")
    private Date creationDate;

    @Column(name = "user_account_expiration_date")
    @Null
    private Date accountExpirationDate;

    @Column(name = "user_credentials_expiration_date")
    @Null
    private Date credentialsExpirationDate;

    @Column(name = "user_locking_date")
    @Null
    private Date lockingDate;
    
    @XmlTransient
    @JsonIgnore
    @ManyToMany(cascade = CascadeType.MERGE, targetEntity = HibernateRole.class)
    @JoinTable(
        name = "user_roles", schema = "credentials",
        joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "user_id") },
        inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "role_id") }
    )
    private Set<SecurityRole> roles;

    /******************************************************************************
     ******************************* CONSTRUCTORS *********************************
     ******************************************************************************/

    public HibernateUser() {
    }

    public HibernateUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public HibernateUser(String login, String password, String email) {
        this(login, password);
        this.email = email;
    }

    /******************************************************************************
     ****************************** GETTERS / SETTERS *****************************
     ******************************************************************************/

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @XmlTransient
    @JsonIgnore
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    @XmlTransient
    @JsonIgnore
    public String getPlainPassword() {
        return this.plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }
    
    @Transient
    @XmlTransient
    @JsonIgnore
    public String getPlainPasswordConfirmation() {
        return this.plainPasswordConfirmation;
    }

    public void setPlainPasswordConfirmation(String plainPasswordConfirmation) {
        this.plainPasswordConfirmation = plainPasswordConfirmation;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlTransient
    @JsonIgnore
    public String getActivationToken() {
        return this.activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getAccountExpirationDate() {
        return this.accountExpirationDate;
    }

    public void setAccountExpirationDate(Date accountExpirationDate) {
        this.accountExpirationDate = accountExpirationDate;
    }

    public Date getCredentialsExpirationDate() {
        return this.credentialsExpirationDate;
    }

    public void setCredentialsExpirationDate(Date credentialsExpirationDate) {
        this.credentialsExpirationDate = credentialsExpirationDate;
    }

    public Date getLockingDate() {
        return this.lockingDate;
    }

    public void setLockingDate(Date lockingDate) {
        this.lockingDate = lockingDate;
    }

    public void addRole(SecurityRole r) {
        if (this.roles == null) {
            this.roles = new HashSet<SecurityRole>();
        }
        this.roles.add(r);
    }

    @XmlTransient
    @JsonIgnore
    public Set<SecurityRole> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<SecurityRole> roles) {
        this.roles = roles;
    }

    /******************************************************************************
     ****************************** UTILITY FUNCTIONS *****************************
     ******************************************************************************/

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HibernateUser)) {
            return false;
        }

        HibernateUser other = (HibernateUser) obj;

        return this.getId() == other.getId()
                && (this.getEmail() == null && other.getEmail() == null || this
                        .getEmail() != null
                        && this.getEmail().equals(other.getEmail()))
                && (this.getLogin() == null && other.getLogin() == null || this
                        .getLogin() != null
                        && this.getLogin().equals(other.getLogin()))
                && (this.getPassword() == null && other.getPassword() == null || this
                        .getPassword() != null
                        && this.getPassword().equals(other.getPassword()));
    }

    @Override
    public String toString() {
        return "[" + this.id + "] " + this.login + " (" + this.email + ")";
    }
    
    @Transient
    @XmlTransient
    @JsonIgnore
    public boolean isNew() {
        return this.id == null;
    }
}
