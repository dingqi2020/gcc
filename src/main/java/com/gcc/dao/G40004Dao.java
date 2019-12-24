package com.gcc.dao;

import com.gcc.entity.UserBaseInfo;
import com.gcc.entity.UserCompanyInfo;
import com.gcc.entity.UserPsersonalInfo;

public interface G40004Dao {

	UserBaseInfo getUserBaseInfoByUserID(String userid);

	UserCompanyInfo getUserCompanyInfoByUserID(String userid);

	UserPsersonalInfo getUserPersonalInfoByUserID(String userid);
}
