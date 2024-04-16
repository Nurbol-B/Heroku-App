package it.academy.myHerokuProd.repo;


import it.academy.myHerokuProd.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
//    Role createRole(Role role);
}