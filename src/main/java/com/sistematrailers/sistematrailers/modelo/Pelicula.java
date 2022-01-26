package com.sistematrailers.sistematrailers.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    @Getter @Setter
    private Integer Id;

    @NotBlank
    @Getter @Setter
    private String titulo;

    @NotBlank
    @Getter @Setter
    private String sinopsis;

    @NotNull
    @Getter @Setter
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaEstreno;

    @NotBlank
    @Getter @Setter
    private String youtubeTrailerId;

    @Getter @Setter
    private String rutaPortada;

    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "genero_pelicula", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_genero"))
    @Getter @Setter
    private List<Genero> generos;

    @Transient
    @Getter @Setter
    private MultipartFile portada;

    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, String sinopsis,
                    LocalDate fechaEstreno, String youtubeTrailerId, String rutaPortada,
                    List<Genero> generos, MultipartFile portada) {
        super();
        this.Id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.youtubeTrailerId = youtubeTrailerId;
        this.rutaPortada = rutaPortada;
        this.generos = generos;
        this.portada = portada;
    }

    public Pelicula(String titulo, String sinopsis,
                    LocalDate fechaEstreno, String youtubeTrailerId, String rutaPortada,
                    List<Genero> generos, MultipartFile portada) {
        super();
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.youtubeTrailerId = youtubeTrailerId;
        this.rutaPortada = rutaPortada;
        this.generos = generos;
        this.portada = portada;
    }
}
