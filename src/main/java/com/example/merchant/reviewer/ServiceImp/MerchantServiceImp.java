package com.example.merchant.reviewer.ServiceImp;

import com.example.merchant.reviewer.EntityModel.MerchantEntity;
import com.example.merchant.reviewer.Repository.MerchantRepository;
import com.example.merchant.reviewer.Service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImp implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public MerchantEntity addMerchant(MerchantEntity merchantEntity) {
        if (merchantRepository.findMerchantByMerchantBusinessName(merchantEntity.getMerchantBusinessName())
                != null) throw new RuntimeException("Already added !!");
        merchantEntity.setMerchantId("hello");
        return merchantRepository.save(merchantEntity);
    }
}
