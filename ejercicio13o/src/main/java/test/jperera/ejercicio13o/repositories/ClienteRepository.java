package test.jperera.ejercicio13o.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.jperera.ejercicio13o.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
