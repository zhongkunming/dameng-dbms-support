package com.github.zhongkunming.sql;

import com.intellij.database.Dbms;
import com.intellij.psi.tree.IElementType;
import com.intellij.sql.dialects.base.SqlLanguageDialectBase;
import com.intellij.sql.dialects.base.TokensHelper;
import com.intellij.sql.dialects.oracle.OraDialect;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * @author zhongkun.meng
 */
public class DamengSQLDialect extends SqlLanguageDialectBase {

    public static final DamengSQLDialect INSTANCE = new DamengSQLDialect();

    protected DamengSQLDialect() {
        super("DAMENGSQL");
    }

    @Override
    protected @NotNull TokensHelper createTokensHelper() {
        // todo
        return null;
//        return new TokensHelper(OraTokens.class, OraPlReservedKeywords.class, SqlFunctionsUtil.loadFunctionDefinition(this));
    }

    @Override
    public @NotNull Dbms getDbms() {
        return DamengDbms.dbms;
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
