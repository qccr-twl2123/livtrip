package com.livtrip.web.domain;

public class SysRoleUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_user.sys_user_id
     *
     * @mbg.generated
     */
    private Integer sysUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_user.sys_role_id
     *
     * @mbg.generated
     */
    private Integer sysRoleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_user.id
     *
     * @return the value of sys_role_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_user.id
     *
     * @param id the value for sys_role_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_user.sys_user_id
     *
     * @return the value of sys_role_user.sys_user_id
     *
     * @mbg.generated
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_user.sys_user_id
     *
     * @param sysUserId the value for sys_role_user.sys_user_id
     *
     * @mbg.generated
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_user.sys_role_id
     *
     * @return the value of sys_role_user.sys_role_id
     *
     * @mbg.generated
     */
    public Integer getSysRoleId() {
        return sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_user.sys_role_id
     *
     * @param sysRoleId the value for sys_role_user.sys_role_id
     *
     * @mbg.generated
     */
    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysRoleUser other = (SysRoleUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysUserId() == null ? other.getSysUserId() == null : this.getSysUserId().equals(other.getSysUserId()))
            && (this.getSysRoleId() == null ? other.getSysRoleId() == null : this.getSysRoleId().equals(other.getSysRoleId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysUserId() == null) ? 0 : getSysUserId().hashCode());
        result = prime * result + ((getSysRoleId() == null) ? 0 : getSysRoleId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append("]");
        return sb.toString();
    }
}