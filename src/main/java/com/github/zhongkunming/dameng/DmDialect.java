package com.github.zhongkunming.dameng;

import com.intellij.database.Dbms;
import com.intellij.psi.tree.IElementType;
import com.intellij.sql.dialects.base.SqlLanguageDialectBase;
import com.intellij.sql.dialects.base.TokensHelper;
import com.intellij.sql.dialects.functions.SqlFunctionsUtil;
import com.intellij.sql.dialects.oracle.OraDialect;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * @author zhongkunming
 */
public class DmDialect extends SqlLanguageDialectBase {

    public static final DmDialect INSTANCE = new DmDialect();

    protected DmDialect() {
        super("DM");
    }

    @Override
    protected @NotNull TokensHelper createTokensHelper() {
        return new TokensHelper(DmTokens.class, DmReservedKeywords.class, SqlFunctionsUtil.loadFunctionDefinition(this));
    }

    @Override
    public @NotNull Dbms getDbms() {
        return DmDbms.dbms;
    }

    @Override
    public boolean isOperatorSupported(IElementType iElementType) {
        OraDialect instance = OraDialect.INSTANCE;
        return instance.isOperatorSupported(iElementType);
    }

    @Override
    public @NotNull Set<String> getSystemVariables() {
        return Set.of();
    }
}
