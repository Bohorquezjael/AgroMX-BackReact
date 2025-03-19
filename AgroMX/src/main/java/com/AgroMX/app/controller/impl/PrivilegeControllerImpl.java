package com.AgroMX.app.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgroMX.app.controller.PrivilegeController;
import com.AgroMX.app.model.Privilege;
import com.AgroMX.app.service.PrivilegeService;

@CrossOrigin(origins = "*")
@RequestMapping("/privileges")
@RestController
public class PrivilegeControllerImpl implements PrivilegeController {

    private static final Logger logger = LoggerFactory.getLogger(PrivilegeControllerImpl.class);
    private final PrivilegeService privilegeService;

    public PrivilegeControllerImpl(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Privilege> getPrivilegeById(@PathVariable Long id) {
        return privilegeService.getPrivilegeById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @PostMapping
    public ResponseEntity<Privilege> createPrivilege(@RequestBody Privilege newPrivilege) {
        Privilege createdPrivilege = privilegeService.createPrivilege(newPrivilege);
        return ResponseEntity.status(201).body(createdPrivilege);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Privilege> updatePrivilege(@RequestBody Privilege privilege, @PathVariable Long id) {
        Privilege updatedPrivilege = privilegeService.updatePrivilege(id, privilege);
        if (updatedPrivilege == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedPrivilege);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrivilege(@PathVariable Long id) {
        if (!privilegeService.deletePrivilege(id)) {
            logger.error("Privilege with ID {} not found for deletion", id);
            return ResponseEntity.notFound().build();
        }
        logger.info("Deleted privilege with ID {}", id);
        return ResponseEntity.noContent().build();
    }
}