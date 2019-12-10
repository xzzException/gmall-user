package com.xzz.gmall.user.mapper;

import com.xzz.gmall.user.bean.UmsMemberLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserLevelMap {
    List<UmsMemberLevel> selectUserLevel();
}
