package com.cloud.user.model;

import com.cloud.common.model.SysPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * https://github.com/shenzhuan/mallplus on 2018/9/30.
 */
public class SysPermissionNode extends SysPermission {
    @Getter
    @Setter
    private List<SysPermissionNode> children;
}
