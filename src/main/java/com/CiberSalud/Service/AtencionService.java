package com.CiberSalud.Service;

import com.CiberSalud.Repository.IAtencionRepository;
import com.CiberSalud.model.Atencion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtencionService {

    @Autowired
    private IAtencionRepository atencionRepo;

    public Atencion RegistroAtencion(Atencion a){
        return atencionRepo.save(a);
    }
    public List<Atencion> ListarAtencion(){
        return atencionRepo.findAll();
    }

    public Optional<Atencion> BuscarAtencion(int id){
        return atencionRepo.findById(id);
    }

}
