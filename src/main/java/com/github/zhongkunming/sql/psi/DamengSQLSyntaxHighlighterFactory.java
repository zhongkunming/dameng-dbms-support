package com.github.zhongkunming.sql.psi;

import com.github.zhongkunming.sql.DamengSQLDialect;
import com.intellij.sql.dialects.base.SqlSyntaxHighlighterFactory;

/**
 * @author zhongkun.meng
 */
public class DamengSQLSyntaxHighlighterFactory extends SqlSyntaxHighlighterFactory.Base {

    protected DamengSQLSyntaxHighlighterFactory() {
        super(DamengSQLDialect.INSTANCE);
    }
}
