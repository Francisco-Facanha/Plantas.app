package FRANCISCO.model.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

public class Plantas {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

@Column(nullable = false,length = 100)
    private Integer nome_comum;

    @Column(nullable = false, length = 100)
    private Integer nome_cientifico;

@Column(nullable = false, length = 100)
    private Integer tipo;

@Column(nullable = false, length = 100)
    private Integer origem;

@Column(nullable = false, length = 100)
    private Integer porte;

}
