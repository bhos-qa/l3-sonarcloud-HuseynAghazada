package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PermissionManagerTest {
    @Test
    private void testGetRoleName() {
        PermissionManager manager = new PermissionManager();

        // Test the getRoleName method for each enum value
        assertEquals("User", manager.getRoleName());
    }

    @Test
    private void testSetCurrentLevel() {
        PermissionManager manager = new PermissionManager();

        // Test setting the current level
        manager.setRoleName(PermissionLevel.ADMIN);
        assertEquals("Admin", manager.getRoleName());

        manager.setRoleName(PermissionLevel.DEVELOPER);
        assertEquals("Developer", manager.getRoleName());

        manager.setRoleName(PermissionLevel.USER);
        assertEquals("User", manager.getRoleName());
    }
}