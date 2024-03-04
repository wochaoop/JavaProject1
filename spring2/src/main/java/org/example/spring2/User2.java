package org.example.spring2;

public class User2 {
    private int id;
    private String name;
    private String password;

    // 省略 getter/setter 方法
    public String toString() {
        return "id=" + id + ",name=" + name + ",password=" + password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}