package cn.edu.hbsi.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User
{
    private Integer id;
    private String name;
    private String password;
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;

    public User() {
        System.out.println("无参构造");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
