/**
 * Field-based POJO representing a user in the system.
 * <p>
 * This class encapsulates user information including identity, contact, and status.
 * It provides full getter/setter access for all fields and a canonical string representation.
 * </p>
 *
 * <p>
 * <strong>Note:</strong> Session M3 Part A suggests converting this class into a 
 * compact record (see UserDTO.java for the target record implementation).
 * </p>
 *
 * @author System
 * @version 1.0
 */
public class User {
    /** Unique identifier for the user. */
    private long id;
    
    /** Full name of the user. */
    private String name;
    
    /** Email address of the user. */
    private String email;
    
    /** Flag indicating whether the user account is active. */
    private boolean active;

    /**
     * Constructs an empty User with default field values.
     */
    public User() {}

    /**
     * Constructs a User with all field values initialized.
     *
     * @param id     the unique identifier for the user
     * @param name   the full name of the user
     * @param email  the email address of the user
     * @param active whether the user account is active
     */
    public User(long id, String name, String email, boolean active) {
        this.id     = id;
        this.name   = name;
        this.email  = email;
        this.active = active;
    }

    /**
     * Returns the unique identifier of this user.
     *
     * @return the user's ID
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the full name of this user.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email address of this user.
     *
     * @return the user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns whether this user account is active.
     *
     * @return true if the user is active, false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the unique identifier of this user.
     *
     * @param id the user ID to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the full name of this user.
     *
     * @param name the user name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the email address of this user.
     *
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the active status of this user account.
     *
     * @param a true to activate, false to deactivate
     */
    public void setActive(boolean a) {
        this.active = a;
    }

    /**
     * Returns a string representation of this user.
     *
     * @return a formatted string showing all user fields
     */
    @Override
    public String toString() {
       return "User{id=" + id + ", name=" + name + ", email=" + email
            + ", active=" + active + "}";
    }
}
