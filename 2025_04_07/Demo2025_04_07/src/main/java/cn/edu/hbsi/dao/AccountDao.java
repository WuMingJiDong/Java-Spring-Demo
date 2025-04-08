package cn.edu.hbsi.dao;

public interface AccountDao
{
    //转账
    public void transfer(String outUser,String inUser,Double money);
}
