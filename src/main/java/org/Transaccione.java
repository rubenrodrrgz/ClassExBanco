package org;
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "Transacciones")
public class Transaccione {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
@jakarta.persistence.Column(name = "TransaccionID", nullable = false)
private java.lang.Integer id;

@jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
@jakarta.persistence.JoinColumn(name = "CuentaID")
private org.Cuenta cuentaID;

@jakarta.persistence.Column(name = "TipoTransaccion", length = 50)
private java.lang.String tipoTransaccion;

@jakarta.persistence.Column(name = "Monto", precision = 10, scale = 2)
private java.math.BigDecimal monto;

@jakarta.persistence.Column(name = "Fecha")
private java.time.Instant fecha;

public java.lang.Integer getId() {
  return id;
}public void setId(java.lang.Integer id) {
  this.id = id;
}

public org.Cuenta getCuentaID() {
  return cuentaID;
}public void setCuentaID(org.Cuenta cuentaID) {
  this.cuentaID = cuentaID;
}

public java.lang.String getTipoTransaccion() {
  return tipoTransaccion;
}public void setTipoTransaccion(java.lang.String tipoTransaccion) {
  this.tipoTransaccion = tipoTransaccion;
}

public java.math.BigDecimal getMonto() {
  return monto;
}public void setMonto(java.math.BigDecimal monto) {
  this.monto = monto;
}

public java.time.Instant getFecha() {
  return fecha;
}public void setFecha(java.time.Instant fecha) {
  this.fecha = fecha;
}

}