package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "joyas")
public class JoyaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private Integer stock;
    private Double precio;
    private String imagen;
    private String descripcion;
    private String tipo;
    private Double medida; // la medida de las joyas sera en centimetros (cm)
    private String material;

    // public JoyaModel(Long id, String nombre, Integer stock, Double precio, String
    // imagen, String descripcion,
    // String tipo, Double medida, String material) {
    // this.id = id;
    // this.nombre = nombre;
    // this.stock = stock;
    // this.precio = precio;
    // this.imagen = imagen;
    // this.descripcion = descripcion;
    // this.tipo = tipo;
    // this.medida = medida;
    // this.material = material;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
