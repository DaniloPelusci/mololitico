package br.com.pelusci.fullstack.core.repository;

import br.com.pelusci.fullstack.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
