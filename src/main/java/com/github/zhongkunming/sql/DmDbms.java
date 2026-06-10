package com.github.zhongkunming.sql;

import com.intellij.database.Dbms;
import com.intellij.icons.AllIcons;

/**
 * @author zhongkunming
 */
public class DmDbms {

//    public static final Dbms dbms = Dbms.create("DAMENG", "DAMENG",
//            () -> IconLoader.getIcon("/icons/dameng.svg", DamengDbms.class), "dameng|dm|DAMENG|DM");

    public static final Dbms dbms = Dbms.create("DAMENG", "DAMENG",
            () -> AllIcons.Providers.Oracle,
            "dameng|dm|DAMENG|DM");
}
