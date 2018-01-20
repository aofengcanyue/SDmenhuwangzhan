package com.regex.web.common.dto.sys;
public class SysUser {
    private String userId;
    private String number;
    private String rights;
    private String ip;
    private String phone;
    private String lastLogin;
    private String email;
    private String name;
    private String status;
    private String password;
    private String bz;
    private String username;
    private String roleId;
    private String skin;
    public SysUser() {
        super();
    }
    public SysUser(String userId,String number,String rights,String ip,String phone,String lastLogin,String email,String name,String status,String password,String bz,String username,String roleId,String skin) {
        super();
        this.userId = userId;
        this.number = number;
        this.rights = rights;
        this.ip = ip;
        this.phone = phone;
        this.lastLogin = lastLogin;
        this.email = email;
        this.name = name;
        this.status = status;
        this.password = password;
        this.bz = bz;
        this.username = username;
        this.roleId = roleId;
        this.skin = skin;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRights() {
        return this.rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBz() {
        return this.bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

}
