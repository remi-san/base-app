package net.remisan.app.model;

import net.remisan.security.model.SecurityUser;

public interface User extends SecurityUser {

    /******************************************************************************
     ******************************** CONSTANTS ***********************************
     ******************************************************************************/

    String IS = "IS";

    /******************************************************************************
     ****************************** GETTERS / SETTERS *****************************
     ******************************************************************************/

    Long getId();

    void setId(Long id);

    String getEmail();

    void setEmail(String email);

    String getLogin();

    void setLogin(String login);
    
    String getFirstName();
    
    void setFirstName(String firstName);
    
    String getLastName();
    
    void setLastName(String lastName);
    
    String getAddress();
    
    void setAddress(String address);
    
    String getAddress2();
    
    void setAddress2(String address);
    
    String getCityName();
    
    void setCityName(String city);
    
    String getPostalCode();
    
    void setPostalCode(String postalCode);
    
    String getCountryName();
    
    void setCountryName(String countryName);

    /******************************************************************************
     ****************************** UTILITY FUNCTIONS *****************************
     ******************************************************************************/

    boolean equals(Object obj);

    String toString();

}