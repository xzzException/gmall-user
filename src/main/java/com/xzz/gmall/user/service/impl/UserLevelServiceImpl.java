package com.xzz.gmall.user.service.impl;

import com.xzz.gmall.user.bean.UmsMemberLevel;
import com.xzz.gmall.user.mapper.UserLevelMap;
import com.xzz.gmall.user.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLevelServiceImpl implements UserLevelService {
    @Autowired
    UserLevelMap userLevelMap;

    @Override
    public List<UmsMemberLevel> getUserLevel() {
        List<UmsMemberLevel> umsLevel = userLevelMap.selectUserLevel();
        return umsLevel;
    }
}
