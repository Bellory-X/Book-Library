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
import org.jooq.generated.pg_catalog.tables.records.RegexpSplitToTableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegexpSplitToTable extends TableImpl<RegexpSplitToTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.regexp_split_to_table</code>
     */
    public static final RegexpSplitToTable REGEXP_SPLIT_TO_TABLE = new RegexpSplitToTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegexpSplitToTableRecord> getRecordType() {
        return RegexpSplitToTableRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public final TableField<RegexpSplitToTableRecord, String> REGEXP_SPLIT_TO_TABLE_ = createField(DSL.name("regexp_split_to_table"), SQLDataType.CLOB, this, "");

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table
     * reference
     */
    public RegexpSplitToTable(String alias) {
        this(DSL.name(alias), REGEXP_SPLIT_TO_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table
     * reference
     */
    public RegexpSplitToTable(Name alias) {
        this(alias, REGEXP_SPLIT_TO_TABLE);
    }

    /**
     * Create a <code>pg_catalog.regexp_split_to_table</code> table reference
     */
    public RegexpSplitToTable() {
        this(DSL.name("regexp_split_to_table"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public RegexpSplitToTable as(String alias) {
        return new RegexpSplitToTable(DSL.name(alias), this, parameters);
    }

    @Override
    public RegexpSplitToTable as(Name alias) {
        return new RegexpSplitToTable(alias, this, parameters);
    }

    @Override
    public RegexpSplitToTable as(Table<?> alias) {
        return new RegexpSplitToTable(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpSplitToTable rename(String name) {
        return new RegexpSplitToTable(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpSplitToTable rename(Name name) {
        return new RegexpSplitToTable(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpSplitToTable rename(Table<?> name) {
        return new RegexpSplitToTable(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public RegexpSplitToTable call(
          String __1
        , String __2
    ) {
        RegexpSplitToTable result = new RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB),
            DSL.val(__2, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public RegexpSplitToTable call(
          Field<String> __1
        , Field<String> __2
    ) {
        RegexpSplitToTable result = new RegexpSplitToTable(DSL.name("regexp_split_to_table"), null, new Field[] {
            __1,
            __2
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
