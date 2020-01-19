package com.orange.gmall.gmalluser.service;

import com.orange.gmall.gmalluser.dao.UmsMember;
import com.orange.gmall.gmalluser.dao.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
