package com.AgroMX.app.controller;

import org.springframework.http.ResponseEntity;

import com.AgroMX.app.model.Privilege;

public interface PrivilegeController {
    ResponseEntity<Privilege> getPrivilegeById(Long id);
    ResponseEntity<Privilege> createPrivilege(Privilege newPrivilege);
    ResponseEntity<Privilege> updatePrivilege(Privilege privilege, Long id);
    ResponseEntity<Void> deletePrivilege(Long id);
}

