package com.nestor.market.persistance.crud;

import java.util.List;
import java.util.Optional;

import com.nestor.market.persistance.entity.Compra;

import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByIdCliente(String idCliente);
}
