package cn.edu.hbsi.dao;

import cn.edu.hbsi.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountDao
{
    //根据id查询账户信息
    public Account selectAccountById(Integer id);
}
