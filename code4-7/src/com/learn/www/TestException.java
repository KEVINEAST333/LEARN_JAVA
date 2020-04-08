package com.learn.www;
import java.util.Scanner;
public class TestException {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String a = scanner.nextLine();
        System.out.println("请输入密码");
        int password = scanner.nextInt();

        admin.setName(a);
        admin.setPassword(password);
        try {
            if(admin.getName().equals("wangdong") && admin.getPassword() == 123456) {
                System.out.println("登录成功");
            }
            else {
                throw new Error("用户名密码不匹配");
            }
        }
        catch (Error error) {
            error.printStackTrace();
        }
        }

}
