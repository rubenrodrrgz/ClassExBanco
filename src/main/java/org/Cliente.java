package org;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
@NamedQueries({
        @NamedQuery(name = "Cliente.cogerTodosLosUsuarios", query = "select c from Cliente c ")
})
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClienteID", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 50)
    private String nombre;

    @Column(name = "Apellido", length = 50)
    private String apellido;

    @Column(name = "Direccion", length = 100)
    private String direccion;

    @Column(name = "Email", length = 100)
    private String email;

    @Column(name = "Telefono", length = 15)
    private String telefono;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}