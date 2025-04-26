package cn.edu.hbsi.dao;

import cn.edu.hbsi.domain.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface AccountDao extends BaseMapper<Account>
{
    //转账
    public void transfer(String outUser,String inUser,Double money);
}
