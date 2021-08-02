package com.github.mhoc4.PersonManagerAPI.utils;

import com.github.mhoc4.PersonManagerAPI.dto.request.PhoneDTO;
import com.github.mhoc4.PersonManagerAPI.entity.Phone;
import com.github.mhoc4.PersonManagerAPI.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(18)999999999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
