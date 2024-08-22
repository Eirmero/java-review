package com.Homework37;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    public Account(String name) {
        this.name = name;
        this.balance = 20;
        this.pwd = "000000";
    }

    public Account(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("Name must be between 2 and 4 characters");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance() {
        if (balance > 20 ){
            this.balance = balance ;
        }else {
            System.out.println("Balance must be greater than 20");
        }
    }



    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6) {
            this.pwd = pwd;
        }else {
            System.out.println("Password must be 6 characters");
        }

    }
}
