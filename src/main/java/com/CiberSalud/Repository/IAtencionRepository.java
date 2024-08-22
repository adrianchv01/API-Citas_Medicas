package com.CiberSalud.Repository;

import com.CiberSalud.model.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAtencionRepository extends JpaRepository<Atencion, Integer> {

}
