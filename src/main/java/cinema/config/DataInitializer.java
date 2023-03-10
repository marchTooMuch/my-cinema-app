package cinema.config;

import static cinema.model.Role.RoleName.ADMIN;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(ADMIN);
        roleService.add(adminRole);
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
