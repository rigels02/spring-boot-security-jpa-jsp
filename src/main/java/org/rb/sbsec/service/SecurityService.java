package org.rb.sbsec.service;

/**
 *
 * @author raitis
 */
public interface SecurityService {

String findLoggedInUsername();

void autologin(String username, String password);

}
