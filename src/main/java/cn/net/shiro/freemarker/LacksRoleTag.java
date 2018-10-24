package cn.net.shiro.freemarker;

public class LacksRoleTag extends RoleTag {
    @Override
    protected boolean showTagBody(String roleName) {
        boolean hasRole = getSubject() != null && getSubject().hasRole(roleName);
        return !hasRole;
    }
}
