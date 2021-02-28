package com.example.merchant.reviewer.Controller;

import com.example.merchant.reviewer.Dto.MerchantDto;
import com.example.merchant.reviewer.RequestModel.MerchantDetails;
import com.example.merchant.reviewer.Response.MerchantRest;
import com.example.merchant.reviewer.Service.MerchantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    /*    @CrossOrigin(origins = "http://localhost:8080") */
    @RequestMapping(method = RequestMethod.POST, value = "/merchant-reviewer/merchant/add-merchant")
    public MerchantRest addMerchant(@RequestBody MerchantDetails details) {
        MerchantDto merchantDto = new MerchantDto();
        BeanUtils.copyProperties(details, merchantDto);
        MerchantDto createMerchant = merchantService.createMerchant(merchantDto);
        MerchantRest returnValue = new MerchantRest();
        BeanUtils.copyProperties(createMerchant, returnValue);
        return returnValue;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/merchant-reviewer/merchant/get-merchant/{id}")
    public MerchantRest getMerchant(@PathVariable String id) {
        MerchantDto dto = merchantService.getMerchantByMerchantId(id);
        MerchantRest returnValue = new MerchantRest();
        BeanUtils.copyProperties(dto, returnValue);
        return returnValue;
    }
}
