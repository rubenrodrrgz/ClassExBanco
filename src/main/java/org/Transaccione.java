package org;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "Transacciones")
public class Transaccione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransaccionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CuentaID")
    private Cuenta cuentaID;

    @Column(name = "TipoTransaccion", length = 50)
    private String tipoTransaccion;

    @Column(name = "Monto", precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(name = "Fecha")
    private Instant fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cuenta getCuentaID() {
        return cuentaID;
    }

    public void setCuentaID(Cuenta cuentaID) {
        this.cuentaID = cuentaID;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

}