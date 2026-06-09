package com.github.zhongkunming.sql;

import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.sql.dialects.base.SqlElementFactoryBase;
import com.intellij.sql.dialects.base.SqlParserDefinitionBase;
import com.intellij.sql.dialects.sql92.Sql92ParserDefinition;
import com.intellij.sql.psi.stubs.elementTypes.SqlFileElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author zhongkun.meng
 */
public class DamengSQLParserDefinition extends SqlParserDefinitionBase {

    private static final SqlParserDefinitionBase sql92ParserDefinition = new Sql92ParserDefinition();

    private static final IFileElementType DAMENG_SQL_FILE = new SqlFileElementType("DAMENG_SQL_FILE", DamengSQLDialect.INSTANCE);

    @Override
    protected SqlElementFactoryBase createElementFactory() {
        return sql92ParserDefinition.getElementFactory();
    }

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return sql92ParserDefinition.createLexer(project);
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return sql92ParserDefinition.createParser(project);
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return DAMENG_SQL_FILE;
    }
}
