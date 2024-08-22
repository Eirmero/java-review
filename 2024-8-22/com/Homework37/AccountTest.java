package com.Homework37;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("张献忠");
        System.out.println("个人基础资料如下：\n" + "姓名： "+ account.getName() + "\n存款： " + account.getBalance()
        + "\n密码： " + account.getPwd());
    }
}
