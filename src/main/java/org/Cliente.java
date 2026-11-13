package org;
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "Clientes")
public class Cliente {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
@jakarta.persistence.Column(name = "ClienteID", nullable = false)
private java.lang.Integer id;

@jakarta.persistence.Column(name = "Nombre", length = 50)
private java.lang.String nombre;

@jakarta.persistence.Column(name = "Apellido", length = 50)
private java.lang.String apellido;

@jakarta.persistence.Column(name = "Direccion", length = 100)
private java.lang.String direccion;

@jakarta.persistence.Column(name = "Email", length = 100)
private java.lang.String email;

@jakarta.persistence.Column(name = "Telefono", length = 15)
private java.lang.String telefono;

public java.lang.Integer getId() {
  return id;
}public void setId(java.lang.Integer id) {
  this.id = id;
}

public java.lang.String getNombre() {
  return nombre;
}public void setNombre(java.lang.String nombre) {
  this.nombre = nombre;
}

public java.lang.String getApellido() {
  return apellido;
}public void setApellido(java.lang.String apellido) {
  this.apellido = apellido;
}

public java.lang.String getDireccion() {
  return direccion;
}public void setDireccion(java.lang.String direccion) {
  this.direccion = direccion;
}

public java.lang.String getEmail() {
  return email;
}public void setEmail(java.lang.String email) {
  this.email = email;
}

public java.lang.String getTelefono() {
  return telefono;
}public void setTelefono(java.lang.String telefono) {
  this.telefono = telefono;
}

}