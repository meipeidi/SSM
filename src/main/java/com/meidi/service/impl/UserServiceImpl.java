package com.meidi.service.impl;


import com.meidi.dao.mapping.TbUserMapper;
import com.meidi.dao.mapping.ext.TbUserMapperExt;
import com.meidi.dao.pojo.TbUser;
import com.meidi.dao.pojo.ext.TbUserExt;
import com.meidi.service.UserService;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    TbUserMapper tbUserMapper;

    @Resource
    TbUserMapperExt tbUserMapperExt;

    public List<TbUser> getUsers() {
        return null;
    }
    @Override
    public TbUserExt getUserAndComsume(Integer id) {
        return tbUserMapperExt.selectComsumeByPriKey(id);
    }


}
