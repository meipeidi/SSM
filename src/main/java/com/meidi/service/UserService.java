package com.meidi.service;


import com.meidi.dao.pojo.TbUser;
import com.meidi.dao.pojo.ext.TbUserExt;

import java.util.List;

public interface UserService {
    public List<TbUser> getUsers();

    TbUserExt getUserAndComsume(Integer id);
//    public Integer addUser(TbUser tbUser);
//    public Integer delUser(TbUser tbUser);
//    public Integer modifyUser(TbUser tbUser);
//    public List<TbUser> getUsers(String username);
}
