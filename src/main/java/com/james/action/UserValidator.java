/**
 * 
 */
package com.james.action;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author james
 *
 */
public class UserValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(User.class);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		User user = (User)target;
		
		if(!"james".equals(user.getUsername())) {
			errors.rejectValue("username", "", null, "wrong username");
		} else {
			if(!"password".equals(user.getPassword1())) {
				errors.rejectValue("password1", "", null, "wrong password");
			} else {
				if(!user.getPassword1().equals(user.getPassword2())) {
					errors.rejectValue("password2", "", null, "passwords are not match");
				}
			}
		}

	}

}
