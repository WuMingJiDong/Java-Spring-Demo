package cn.edu.hbsi;

public class User2
{
    private Integer id;
    private String name;
    private String password;
    private User1 user1;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", user1=" + user1 +
                '}';
    }
}
