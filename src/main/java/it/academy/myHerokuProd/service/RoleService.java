package it.academy.myHerokuProd.service;

import it.academy.myHerokuProd.entity.Role;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface RoleService {
    ResponseEntity<Long> save(Role role);
//    ResponseEntity<Long> create(Role role);

    List<Role> allRoles();

}