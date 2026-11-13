package org;
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "Cuentas")
public class Cuenta {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
@jakarta.persistence.Column(name = "CuentaID", nullable = false)
private java.lang.Integer id;

@jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
@jakarta.persistence.JoinColumn(name = "ClienteID")
private org.Cliente clienteID;

@jakarta.persistence.Column(name = "TipoCuenta", length = 50)
private java.lang.String tipoCuenta;

@jakarta.persistence.Column(name = "Saldo", precision = 10, scale = 2)
private java.math.BigDecimal saldo;

public java.lang.Integer getId() {
  return id;
}public void setId(java.lang.Integer id) {
  this.id = id;
}

public org.Cliente getClienteID() {
  return clienteID;
}public void setClienteID(org.Cliente clienteID) {
  this.clienteID = clienteID;
}

public java.lang.String getTipoCuenta() {
  return tipoCuenta;
}public void setTipoCuenta(java.lang.String tipoCuenta) {
  this.tipoCuenta = tipoCuenta;
}

public java.math.BigDecimal getSaldo() {
  return saldo;
}public void setSaldo(java.math.BigDecimal saldo) {
  this.saldo = saldo;
}

}