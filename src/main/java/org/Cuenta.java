package org;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CuentaID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ClienteID")
    private Cliente clienteID;

    @Column(name = "TipoCuenta", length = 50)
    private String tipoCuenta;

    @Column(name = "Saldo", precision = 10, scale = 2)
    private BigDecimal saldo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getClienteID() {
        return clienteID;
    }

    public void setClienteID(Cliente clienteID) {
        this.clienteID = clienteID;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}