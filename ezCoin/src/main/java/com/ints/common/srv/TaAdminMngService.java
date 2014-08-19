package com.ints.common.srv;

import com.ints.common.model.TaAdminMng;

public interface TaAdminMngService {
	int checkAdminMngByAdminId(String id, String pass);
	TaAdminMng getAdminMngByAdminId(String id);
}
