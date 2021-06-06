package com.it15301.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.it15301.entity.User;
import com.it15301.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);

		UserBuilder builder = null;
	    if (user != null) {
	      builder = org.springframework.security.core.userdetails.User.withUsername(username);
	      builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
	      builder.roles(user.getAdmin().toString());
	    } else {
	    	System.out.println("null");
	      throw new UsernameNotFoundException("User not found.");
	    }
	    return builder.build();
//		if (user == null) {
//			new UsernameNotFoundException("Login fail!");
//		}
//		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//		GrantedAuthority authority = new SimpleGrantedAuthority(user.getAdmin().toString());
//		grantList.add(authority);
//		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getEmail(),
//				user.getPassword(), grantList);
//		System.out.println("false");
//		return userDetails;
	}

}
