package com.gupaoedu.mapper;

import com.gupaoedu.pojo.SysRole;


import java.util.List;

public interface RoleMapper {

    List<SysRole> findByUid(Integer uid);
}

