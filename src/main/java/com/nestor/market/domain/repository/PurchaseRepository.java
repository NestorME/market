package com.nestor.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.nestor.market.domain.Purchase;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
