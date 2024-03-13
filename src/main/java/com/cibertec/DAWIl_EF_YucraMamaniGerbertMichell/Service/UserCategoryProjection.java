package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.User;

public interface UserCategoryProjection {
	String getCategoryName();
    List<User> getUsers();
}
