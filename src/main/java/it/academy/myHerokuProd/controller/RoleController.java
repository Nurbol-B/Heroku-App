package it.academy.myHerokuProd.controller;

import it.academy.myHerokuProd.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import it.academy.myHerokuProd.service.RoleService;

import java.util.List;


@RequiredArgsConstructor
@Controller
@RequestMapping("/api/roles")
public class RoleController {
    private final RoleService service;

    @PostMapping
    public ResponseEntity<Long> save(@RequestBody Role roleDto) {
        return service.save(roleDto);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Role>> getAll() {
        List<Role> roles = service.allRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @PostMapping("/create/v2")
    public ResponseEntity<Long> createRole(@RequestBody Role roleDto){
        return service.save(roleDto);
    }
}