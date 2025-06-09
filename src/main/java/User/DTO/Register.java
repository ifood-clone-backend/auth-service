package User.DTO;


import User.UserRole;

public record Register(String login, String nome, String senha, UserRole role) {
}
