package com.example.merchant.reviewer.ServiceImp;

import com.example.merchant.reviewer.Dto.MerchantDto;
import com.example.merchant.reviewer.EntityModel.MerchantEntity;
import com.example.merchant.reviewer.Repository.MerchantRepository;
import com.example.merchant.reviewer.Service.MerchantService;
import com.example.merchant.reviewer.Utils.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImp implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Autowired
    Util util;

    @Override
    public MerchantDto createMerchant(MerchantDto merchantDto) {

        if (merchantRepository.findMerchantByMerchantBusinessName(merchantDto.getMerchantBusinessName())!=null) throw
            new RuntimeException("Record Already Exist! ");

        MerchantEntity merchantEntity = new MerchantEntity();
        BeanUtils.copyProperties(merchantDto, merchantEntity);
        merchantEntity.setMerchantId(util.generateRandomId(30));
        MerchantEntity createdMerchant = merchantRepository.save(merchantEntity);
        MerchantDto returnValue = new MerchantDto();
        BeanUtils.copyProperties(createdMerchant, returnValue);
        return returnValue;
    }
}
