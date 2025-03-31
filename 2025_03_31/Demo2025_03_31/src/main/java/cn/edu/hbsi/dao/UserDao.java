package cn.edu.hbsi.dao;

public interface UserDao
{
    /**
     * 新增用户
     */
    public void addUser();

    /**
     * 删除用户
     */
    public void deleteUser();

    /**
     * 更改用户
     */
    public void updateUser();

    /**
     * 查询用户
     */
    public void selectUser();
}
