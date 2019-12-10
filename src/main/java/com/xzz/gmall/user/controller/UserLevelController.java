package com.xzz.gmall.user.controller;

import com.xzz.gmall.user.bean.UmsMemberLevel;
import com.xzz.gmall.user.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserLevelController {
    @Autowired
    UserLevelService userLevelService;
    @RequestMapping("getUserLevel")
    @ResponseBody
    public List<UmsMemberLevel> getUserLevel(){
        List<UmsMemberLevel> umsMemberLevels = userLevelService.getUserLevel();
        return umsMemberLevels;
    }
}
