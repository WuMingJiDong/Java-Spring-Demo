package cn.edu.hbsi;

public class User1
{
    private Integer id;
    private String name;
    private String password;

    public User1(){

    }

    public User1(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
