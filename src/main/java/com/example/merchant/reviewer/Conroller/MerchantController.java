package com.example.merchant.reviewer.Conroller;

import com.example.merchant.reviewer.EntityModel.MerchantEntity;
import com.example.merchant.reviewer.Service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(method = RequestMethod.POST, value = "/merchant-reviewer/add-merchant")
    public MerchantEntity addMerchant(@RequestBody MerchantEntity merchantEntity) {
        return merchantService.addMerchant(merchantEntity);
    }
}
