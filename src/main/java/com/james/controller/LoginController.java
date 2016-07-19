/**
 * 
 */
package com.james.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.james.action.User;
import com.james.action.UserValidator;

/**
 * @author james
 *
 */

@Controller
public class LoginController {

	private String viewPageForLogin;
	private String viewPageForSuccess;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLoginPage() {
		
		return new ModelAndView(this.getViewPageForLogin());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(User user, BindingResult result) {
		
		if(result.hasErrors()) {
			return new ModelAndView(this.getViewPageForLogin());
		} else {
			return new ModelAndView(this.getViewPageForSuccess());
		}
	}
	
	@InitBinder
	public void initBinder(DataBinder binder) {
		binder.setValidator(new UserValidator());
	}

	/**
	 * @return the viewPageForLogin
	 */
	public String getViewPageForLogin() {
		return viewPageForLogin;
	}

	/**
	 * @return the viewPageForSuccess
	 */
	public String getViewPageForSuccess() {
		return viewPageForSuccess;
	}

	/**
	 * @param viewPageForLogin the viewPageForLogin to set
	 */
	public void setViewPageForLogin(String viewPageForLogin) {
		this.viewPageForLogin = viewPageForLogin;
	}

	/**
	 * @param viewPageForSuccess the viewPageForSuccess to set
	 */
	public void setViewPageForSuccess(String viewPageForSuccess) {
		this.viewPageForSuccess = viewPageForSuccess;
	}
}
