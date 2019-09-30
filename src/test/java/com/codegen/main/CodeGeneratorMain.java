package com.codegen.main;

import com.codegen.service.CleanCodePackageManager;
import com.codegen.service.CodeGeneratorManager;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 代码生成器启动项
 * <p>扩展自定义方法参考：https://www.cnblogs.com/se7end/p/9293755.html</>
 * Created by zhh on 2017/09/20.
 */
public class CodeGeneratorMain {


    /**
     * 支持批量生成。map的key为表名，value为实体名
     */
    public static void main(String[] args) {
        CleanCodePackageManager.cleanMainPackage();
        CodeGeneratorManager cgm = new CodeGeneratorManager();

        Map<String, String> map = Maps.newHashMap();
        map.put("uac_menu_button", "UacMenuButton");
        map.put("uac_dept", "UacDept");
        map.put("uac_log", "UacLog");
        map.put("uac_menu", "UacMenu");
        map.put("uac_company", "UacCompany");
        map.put("uac_company_user", "UacCompanyUserKey");
        map.put("uac_post", "UacPost");
        map.put("uac_role", "UacRole");
        map.put("uac_role_action", "UacRoleMenuButtonKey");
        map.put("uac_role_menu", "UacRoleMenuKey");
        map.put("uac_role_user", "UacRoleUserKey");
        map.put("uac_user", "UacUser");
        map.put("uac_user_menu", "UacUserMenuKey");
        cgm.genMuliCodeWithCustomName(map);
    }


}
