package test.jperera.ejercicio13o.services;

import test.jperera.ejercicio13o.models.Cliente;
import test.jperera.ejercicio13o.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

//    public Cliente save(DatosDevueltosSinID datosDevueltosSinID) {
//        DatosDevueltos datosDevueltos = new DatosDevueltos(
//                null,
//                datosDevueltosSinID.getNombre(),
//                datosDevueltosSinID.getEdad());
//        return repository.save(datosDevueltos);
//    }

    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Cliente update(Cliente ret) {
        return repository.save(ret);
    }
}
