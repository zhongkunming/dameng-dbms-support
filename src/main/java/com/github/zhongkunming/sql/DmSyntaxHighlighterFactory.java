package com.github.zhongkunming.sql;

import com.intellij.sql.dialects.base.SqlSyntaxHighlighterFactory;

/**
 * @author zhongkunming
 */
public class DmSyntaxHighlighterFactory extends SqlSyntaxHighlighterFactory.Base {

    protected DmSyntaxHighlighterFactory() {
        super(DmDialect.INSTANCE);
    }
}
