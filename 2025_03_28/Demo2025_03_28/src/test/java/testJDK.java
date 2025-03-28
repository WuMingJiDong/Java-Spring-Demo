import cn.edu.hbsi.dao.Impl.UserDaoImpl;
import cn.edu.hbsi.dao.UserDao;
import cn.edu.hbsi.domain.MyProxy;

public class testJDK
{
    public static void main(String[] args) {
        //创建代理对象
        MyProxy myProxy = new MyProxy();
        //创建目标对象
        UserDao userDao = new UserDaoImpl();
        //创建目标对象的代理对象
        UserDao proxyUserDao = (UserDao) myProxy.createProxy(userDao);
        //执行方法
        proxyUserDao.addUser();
        System.out.println("=================");
        proxyUserDao.deleteUser();
    }
}
