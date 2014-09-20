package net.remisan.app.data.form;

import javax.validation.constraints.NotNull;

import net.remisan.app.model.User;
import net.remisan.app.model.impl.HibernateUser;
import net.remisan.base.app.form.AbstractPersistableEntityForm;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserForm extends AbstractPersistableEntityForm<User> {

    protected Long id;

    @NotNull
    @NotEmpty
    @Email
    protected String email;

    @NotNull
    @NotEmpty
    protected String login;
    
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String address2;
    protected String cityName;
    protected String postalCode;
    protected String countryName;
    protected boolean enabled;
//    protected Date accountExpirationDate;
//    protected Date credentialsExpirationDate;
//    protected Set<HibernateRole> roles;
//    protected List<HibernatePerson> persons;
//    protected List<HibernateRatedPerson> personRatings;
//    protected List<HibernateRatedProfile> profileRatings;

    /******************************************************************************
     ********************************* CONSTRUCTOR ********************************
     ******************************************************************************/
    
    public UserForm() {
        super(HibernateUser.class);
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

//    public Date getAccountExpirationDate() {
//        return this.accountExpirationDate;
//    }
//
//    public void setAccountExpirationDate(Date accountExpirationDate) {
//        this.accountExpirationDate = accountExpirationDate;
//    }
//
//    public Date getCredentialsExpirationDate() {
//        return this.credentialsExpirationDate;
//    }
//
//    public void setCredentialsExpirationDate(Date credentialsExpirationDate) {
//        this.credentialsExpirationDate = credentialsExpirationDate;
//    }
//
//    public void addRole(HibernateRole r) {
//        if (this.roles == null) {
//            this.roles = new HashSet<HibernateRole>();
//        }
//        this.roles.add(r);
//    }
//
//    public Set<HibernateRole> getRoles() {
//        return this.roles;
//    }
//
//    public void setRoles(Set<HibernateRole> roles) {
//        this.roles = roles;
//    }
//
//    public List<HibernatePerson> getPersons() {
//        return this.persons;
//    }
//
//    public void setPersons(List<HibernatePerson> persons) {
//        this.persons = persons;
//    }
//
//    public List<HibernateRatedPerson> getPersonRatings() {
//        return this.personRatings;
//    }
//
//    public void setPersonRatings(List<HibernateRatedPerson> personRatings) {
//        this.personRatings = personRatings;
//    }
//
//    public List<HibernateRatedProfile> getProfileRatings() {
//        return this.profileRatings;
//    }
//
//    public void setProfileRatings(List<HibernateRatedProfile> profileRatings) {
//        this.profileRatings = profileRatings;
//    }
}