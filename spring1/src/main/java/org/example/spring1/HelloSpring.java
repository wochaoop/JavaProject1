package org.example.spring1;

public class HelloSpring {
    private String userName;
    private String studentId;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void show() {
        System.out.println(userName + ": 欢迎来到 Spring");
        System.out.println("学号：" + studentId);
    }
}
