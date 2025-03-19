package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Privilege;
import com.AgroMX.app.repository.PrivilegeRepository;
import com.AgroMX.app.service.PrivilegeService;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    private final PrivilegeRepository privilegeRepository;

    @Autowired
    public PrivilegeServiceImpl(PrivilegeRepository privilegeRepository) {
        this.privilegeRepository = privilegeRepository;
    }

    @Override
    public Privilege createPrivilege(Privilege privilege) {
        return privilegeRepository.save(privilege);
    }

    @Override
    public Optional<Privilege> getPrivilegeById(Long id) {
        return privilegeRepository.findById(id);
    }

    @Override
    public Optional<Privilege> getPrivilegeByName(String name) {
        return privilegeRepository.findByName(name); // Necesitas agregar este método en el repositorio
    }

    @Override
    public Privilege updatePrivilege(Long id, Privilege newPrivilege) {
        return privilegeRepository.findById(id)
            .map(privilege -> {
                privilege.setName(newPrivilege.getName());
                return privilegeRepository.save(privilege);
            })
            .orElseThrow(() -> new EntityNotFoundException("Privilege not found with id: " + id));
    }

    @Override
    public boolean deletePrivilege(Long id) {
        if (privilegeRepository.existsById(id)) {
            privilegeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}