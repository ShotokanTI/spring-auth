package com.devsuperior.demo.projections;

public interface UserDetailsProjection {
    String getUserName();
    String getUserPassword();
    Long getRoleId();
    String getAuthority();
}
