package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombreCliente;
    private String correoCliente;
    private Long telefonoCliente;
    private Integer edadCliente;
    private String direccionCliente;
    private String imagen;
    private String nombrePedido;
    private String tipo;
    private Integer cantidad;
    private String descripcion;
    private Double medidaProducto;
    private String estadoPedido;
    private String codigoEntrega;
    private Date fechaRegistro;
    private Date fechaAproximada;
    private Date fechaEntrega;
    private Long idCliente;
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public Long getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(Long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Integer getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(Integer edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getCodigoEntrega() {
        return codigoEntrega;
    }

    public void setCodigoEntrega(String codigoEntrega) {
        this.codigoEntrega = codigoEntrega;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAproximada() {
        return fechaAproximada;
    }

    public void setFechaAproximada(Date fechaAproximada) {
        this.fechaAproximada = fechaAproximada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public Double getMedidaProducto() {
        return medidaProducto;
    }

    public void setMedidaProducto(Double medidaProducto) {
        this.medidaProducto = medidaProducto;
    }

}
