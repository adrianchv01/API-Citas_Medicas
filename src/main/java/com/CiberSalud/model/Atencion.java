package com.CiberSalud.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    private int num_atencion;
    private String fecha;
    private String nom_paciente;
    private int cod_tipo;


}
