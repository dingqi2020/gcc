package com.gcc.service;

import com.gcc.entity.UserBaseInfo;
import com.gcc.entity.UserCompanyInfo;
import com.gcc.entity.UserPsersonalInfo;

public interface G40004Service {
	UserBaseInfo getBaseInfo(String userid);

	UserCompanyInfo getCompanyInfo(String userid);

	UserPsersonalInfo getPersonalInfo(String userid);
}
