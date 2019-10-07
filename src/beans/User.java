package beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "user [\n" + " id: " + super.getId() + ",\n" + " name: " + name + ",\n" + " username: " + username + ",\n" 
				+ " email: " + email + ",\n" + 
				" address [\n" + "  street: " + address.getStreet() + ",\n" + "  suite: " + address.getSuite() + ",\n" + 
				"  city: " + address.getCity() + ",\n" + "  zipcode: " + address.getZipCode() + ",\n" + 
				"  geo: [\n" + "   lat: " + address.getGeo().getLat() + ",\n" + "   lng: " + address.getGeo().getLng() + ",\n" +
				"  ],\n" + " ],\n" + " phone: " + phone + ",\n" + " website: " + website + ",\n" +
				" company: [\n" + "  name: " + company.getName() + ",\n" + "  catchPhrase: " + company.getCatchPhrase() + ",\n" +
				"  bs: " + company.getBs() + ",\n" + " " + "],\n" + "]";
	}
	
}
