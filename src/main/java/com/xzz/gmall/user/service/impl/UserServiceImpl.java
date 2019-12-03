package com.xzz.gmall.user.service.impl;

import com.xzz.gmall.user.bean.UmsMember;
import com.xzz.gmall.user.mapper.UserMapper;
import com.xzz.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }
}
