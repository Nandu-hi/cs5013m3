/**
 * Session M3 Part A / B: replace this empty record header with the
 * fields Copilot suggests once you re-trigger ghost text after
 * opening User.java in a second tab. Then add a static
 * {@code fromUser(User)} mapper as described in Part B.
 */
public record UserDTO(String username, String email, String fullName) {
    public static UserDTO fromUser(User user) {
        return new UserDTO(user.getName(), user.getEmail(), user.getName());
    }
}
