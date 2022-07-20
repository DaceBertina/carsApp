package com.webapp.carsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ConfigUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepo;

    @Override
    public UserDetails loadUserByUsername(String e_mail) throws UsernameNotFoundException {
        User user = usersRepo.findByEmail(e_mail);
        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }
        return new ConfigUserDetails(user);
    }
}
