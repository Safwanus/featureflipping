package Role;

import java.util.Objects;
import java.util.regex.Pattern;

public class Role {
    private final String name;

    public Role(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        if (name == "") throw new IllegalArgumentException("Name cannot be empty");
        if (name.trim().equals("")) throw new IllegalArgumentException("Name cannot be blank");
        if (name.indexOf(" ") >= 0) throw new IllegalArgumentException("Name cannot contain spaces");

        String regEx = "[a-zA-Z]{1,10}";
        if (!Pattern.compile(regEx).matcher(name).matches()) throw new IllegalArgumentException("Only characters are allowed, in a [1-10] length interval");

        this.name = name.toLowerCase();
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
