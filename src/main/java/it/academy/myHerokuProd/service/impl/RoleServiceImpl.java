package it.academy.myHerokuProd.service.impl;

import it.academy.myHerokuProd.entity.Role;
import it.academy.myHerokuProd.repo.RoleRepo;
import it.academy.myHerokuProd.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepo roleRepo;

    @Override
    public ResponseEntity<Long> save(Role roleDto) {
        Role savedRole = roleRepo.save(roleDto);
        return new ResponseEntity<>(savedRole.getId(), HttpStatus.CREATED);
    }

//    @Override
//    public ResponseEntity<Long> create(Role role) {
//        Role createRole = roleRepo.createRole(role);
//        return new ResponseEntity<>(createRole.getId(), HttpStatus.CREATED);
//    }

    @Override
    public List<Role> allRoles() {
        return roleRepo.findAll();
    }
}