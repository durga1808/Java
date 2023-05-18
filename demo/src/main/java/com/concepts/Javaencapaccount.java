package com.concepts;

public class Javaencapaccount {
    private long acc_no;
    private String name,email;
    private float salary;

    public long getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(long newacc_no)
    {
        this.acc_no=newacc_no;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname)
    {
        this.name=newname;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String newemail)
    {
        this.email=newemail;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float newsalary)
    {
        this.salary=newsalary;
    }
}
