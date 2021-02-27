package com.example.merchant.reviewer.Repository;

import com.example.merchant.reviewer.EntityModel.MerchantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<MerchantEntity,Long> {
    MerchantEntity findMerchantByMerchantBusinessName(String merchantBusinessName);
}
