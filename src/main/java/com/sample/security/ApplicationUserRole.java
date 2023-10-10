package com.sample.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.sample.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    USER(Sets.newHashSet(CUSTOMER_READ)),
    ADMIN(Sets.newHashSet(CUSTOMER_READ,CUSTOMER_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
