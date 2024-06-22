/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.GenerateSubscriptsRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSubscripts extends TableImpl<GenerateSubscriptsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.generate_subscripts</code>
     */
    public static final GenerateSubscripts GENERATE_SUBSCRIPTS = new GenerateSubscripts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenerateSubscriptsRecord> getRecordType() {
        return GenerateSubscriptsRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public final TableField<GenerateSubscriptsRecord, Integer> GENERATE_SUBSCRIPTS_ = createField(DSL.name("generate_subscripts"), SQLDataType.INTEGER, this, "");

    private GenerateSubscripts(Name alias, Table<GenerateSubscriptsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.OTHER.array()),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.BOOLEAN)
        });
    }

    private GenerateSubscripts(Name alias, Table<GenerateSubscriptsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.generate_subscripts</code> table
     * reference
     */
    public GenerateSubscripts(String alias) {
        this(DSL.name(alias), GENERATE_SUBSCRIPTS);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_subscripts</code> table
     * reference
     */
    public GenerateSubscripts(Name alias) {
        this(alias, GENERATE_SUBSCRIPTS);
    }

    /**
     * Create a <code>pg_catalog.generate_subscripts</code> table reference
     */
    public GenerateSubscripts() {
        this(DSL.name("generate_subscripts"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public GenerateSubscripts as(String alias) {
        return new GenerateSubscripts(DSL.name(alias), this, parameters);
    }

    @Override
    public GenerateSubscripts as(Name alias) {
        return new GenerateSubscripts(alias, this, parameters);
    }

    @Override
    public GenerateSubscripts as(Table<?> alias) {
        return new GenerateSubscripts(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSubscripts rename(String name) {
        return new GenerateSubscripts(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSubscripts rename(Name name) {
        return new GenerateSubscripts(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSubscripts rename(Table<?> name) {
        return new GenerateSubscripts(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GenerateSubscripts call(
          Object[] __1
        , Integer __2
        , Boolean __3
    ) {
        GenerateSubscripts result = new GenerateSubscripts(DSL.name("generate_subscripts"), null, new Field[] {
            DSL.val(__1, SQLDataType.OTHER.array()),
            DSL.val(__2, SQLDataType.INTEGER),
            DSL.val(__3, SQLDataType.BOOLEAN)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GenerateSubscripts call(
          Field<Object[]> __1
        , Field<Integer> __2
        , Field<Boolean> __3
    ) {
        GenerateSubscripts result = new GenerateSubscripts(DSL.name("generate_subscripts"), null, new Field[] {
            __1,
            __2,
            __3
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
