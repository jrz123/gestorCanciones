
package co.edu.unicauca.serverusers.core.services;

import common.entities.UserDTO;

/**
 *
 * @author adrianfGP
 */
public interface IUserService {
    public boolean userIsRegistred(String username);
    public boolean validateCredentials(String username, String password);
    public boolean registerUser(UserDTO user);
    public String generateToken();
    public boolean validateToken(String token);
}
