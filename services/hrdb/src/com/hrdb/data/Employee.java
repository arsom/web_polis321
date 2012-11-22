
package com.hrdb.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  hrdb.Employee
 *  09/27/2555 10:29:21
 * 
 */
public class Employee {

    private Integer eid;
    private com.hrdb.data.Employee employee;
    private Department department;
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private Date birthdate;
    private String picurl;
    private String twitterid;
    private Integer tenantid;
    private Set<com.hrdb.data.Employee> employees = new HashSet<com.hrdb.data.Employee>();
    private Set<com.hrdb.data.Vacation> vacations = new HashSet<com.hrdb.data.Vacation>();

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public com.hrdb.data.Employee getEmployee() {
        return employee;
    }

    public void setEmployee(com.hrdb.data.Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getTwitterid() {
        return twitterid;
    }

    public void setTwitterid(String twitterid) {
        this.twitterid = twitterid;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Set<com.hrdb.data.Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<com.hrdb.data.Employee> employees) {
        this.employees = employees;
    }

    public Set<com.hrdb.data.Vacation> getVacations() {
        return vacations;
    }

    public void setVacations(Set<com.hrdb.data.Vacation> vacations) {
        this.vacations = vacations;
    }

}
