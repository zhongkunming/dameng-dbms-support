package com.github.zhongkunming.dameng;

import com.intellij.sql.dialects.base.SqlSyntaxHighlighterFactory;

/**
 * @author zhongkunming
 */
public class DmSyntaxHighlighterFactory extends SqlSyntaxHighlighterFactory.Base {

    protected DmSyntaxHighlighterFactory() {
        super(DmDialect.INSTANCE);
    }
}
