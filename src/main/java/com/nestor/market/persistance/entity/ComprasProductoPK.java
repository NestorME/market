package com.nestor.market.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto; 
}
