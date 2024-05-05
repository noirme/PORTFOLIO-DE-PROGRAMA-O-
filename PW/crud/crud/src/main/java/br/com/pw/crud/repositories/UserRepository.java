package br.com.pw.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pw.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
