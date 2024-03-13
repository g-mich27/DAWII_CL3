package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserCategoryProjection;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/report")
public class ReportController {

	@Autowired
	private UserService userServi;
    

	@GetMapping("/usersByCategory")
    public List<UserCategoryProjection> getUsersByCategoryReport() {
        return userServi.getUsersByCategory();
    }

}
