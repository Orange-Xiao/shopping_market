package com.orange.gmall.gmalluser.mapper;

import com.orange.gmall.gmalluser.dao.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
