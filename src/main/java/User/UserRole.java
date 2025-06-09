package User;

import lombok.Getter;
public enum UserRole {

    ADMIN("ROLE_ADMIN"),
    CLIENT("ROLE_CLIENT"),
    RESTAURANT("ROLE_RESTAURANT");

    @Getter
    private final String role;

    UserRole(String role){
        this.role = role;
    }

}
