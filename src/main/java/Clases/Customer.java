package Clases;

import Tipos.Address;
import Tipos.Phone;

public class Customer {
    private String id;
    private Address address;
    private Phone phone;
    private String email;
    private Account account;
    private WebUser webUser;

    public Customer(String id, Address address, Phone phone, String email, Account account, WebUser webUser) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.account = account;
        this.webUser = webUser;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public WebUser getWebUser() {
        return webUser;
    }

    public void setWebUser(WebUser webUser) {
        this.webUser = webUser;
    }
}

//LINKED HASH SET
// los list items son linked hash set en shopping cart
// en shopping cart hay que meter una linked hash set
// el propio list item deberia tener una referencia : shopping cart dentro de list item
