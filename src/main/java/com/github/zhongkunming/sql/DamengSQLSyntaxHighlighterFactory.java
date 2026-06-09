package com.github.zhongkunming.sql;

import com.intellij.sql.dialects.base.SqlSyntaxHighlighterFactory;

/**
 * @author zhongkunming
 */
public class DamengSQLSyntaxHighlighterFactory extends SqlSyntaxHighlighterFactory.Base {

    protected DamengSQLSyntaxHighlighterFactory() {
        super(DamengSQLDialect.INSTANCE);
    }
}
