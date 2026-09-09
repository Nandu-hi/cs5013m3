// without user opened
public record UserDTO(String username, String email, String fullName) {
    public static UserDTO fromUser(User user) {
        return new UserDTO(user.getUsername(), user.getEmail(), user.getFullName());
    }
}
// with user opened
public record UserDTO(long id, String name, String email, boolean active) {
    public static UserDTO fromUser(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.isActive());
    }
}

Didn't hallucinate here.
It hallucinated while filling main function inside record. It didn't read user file though its open.



