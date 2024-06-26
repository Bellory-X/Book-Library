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
import org.jooq.generated.pg_catalog.tables.records.PgTablespaceDatabasesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTablespaceDatabases extends TableImpl<PgTablespaceDatabasesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_tablespace_databases</code>
     */
    public static final PgTablespaceDatabases PG_TABLESPACE_DATABASES = new PgTablespaceDatabases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTablespaceDatabasesRecord> getRecordType() {
        return PgTablespaceDatabasesRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public final TableField<PgTablespaceDatabasesRecord, Long> PG_TABLESPACE_DATABASES_ = createField(DSL.name("pg_tablespace_databases"), SQLDataType.BIGINT, this, "");

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgTablespaceDatabases(Name alias, Table<PgTablespaceDatabasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace_databases</code> table
     * reference
     */
    public PgTablespaceDatabases(String alias) {
        this(DSL.name(alias), PG_TABLESPACE_DATABASES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace_databases</code> table
     * reference
     */
    public PgTablespaceDatabases(Name alias) {
        this(alias, PG_TABLESPACE_DATABASES);
    }

    /**
     * Create a <code>pg_catalog.pg_tablespace_databases</code> table reference
     */
    public PgTablespaceDatabases() {
        this(DSL.name("pg_tablespace_databases"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgTablespaceDatabases as(String alias) {
        return new PgTablespaceDatabases(DSL.name(alias), this, parameters);
    }

    @Override
    public PgTablespaceDatabases as(Name alias) {
        return new PgTablespaceDatabases(alias, this, parameters);
    }

    @Override
    public PgTablespaceDatabases as(Table<?> alias) {
        return new PgTablespaceDatabases(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespaceDatabases rename(String name) {
        return new PgTablespaceDatabases(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespaceDatabases rename(Name name) {
        return new PgTablespaceDatabases(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespaceDatabases rename(Table<?> name) {
        return new PgTablespaceDatabases(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgTablespaceDatabases call(
          Long __1
    ) {
        PgTablespaceDatabases result = new PgTablespaceDatabases(DSL.name("pg_tablespace_databases"), null, new Field[] {
            DSL.val(__1, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgTablespaceDatabases call(
          Field<Long> __1
    ) {
        PgTablespaceDatabases result = new PgTablespaceDatabases(DSL.name("pg_tablespace_databases"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
