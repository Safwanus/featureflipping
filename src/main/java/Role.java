import java.util.Objects;


public class Role {
    private final String name;

    public Role(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        if (name == "") throw new IllegalArgumentException("Name cannot be empty");
        if (name.trim().equals("")) throw new IllegalArgumentException("Name cannot be blank");
        if (name.indexOf(" ") >= 0) throw new IllegalArgumentException("Name cannot contain spaces");
        this.name = name;
    }

    public String name(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return name.equals(role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
