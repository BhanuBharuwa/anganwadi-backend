package com.anganwadi.anganwadi.service_impl.service;

import com.anganwadi.anganwadi.domains.dto.LoginUser;
import com.anganwadi.anganwadi.domains.dto.OtpDTO;
import com.anganwadi.anganwadi.domains.dto.SendOtpDTO;
import com.anganwadi.anganwadi.domains.entity.User;

import java.io.IOException;

public interface UserService {



    OtpDTO sendOtp(SendOtpDTO sendOtpDTO) throws IOException;

    OtpDTO verifyOtp(OtpDTO otpDTO);


}
