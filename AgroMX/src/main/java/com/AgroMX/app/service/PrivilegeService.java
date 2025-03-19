package com.AgroMX.app.service;

import java.util.Optional;

import com.AgroMX.app.model.Privilege;

public interface PrivilegeService {
    Privilege createPrivilege(Privilege privilege);
    Optional<Privilege> getPrivilegeById(Long id);
    Optional<Privilege> getPrivilegeByName(String name);
    Privilege updatePrivilege(Long id, Privilege newPrivilege);
    boolean deletePrivilege(Long id);
}