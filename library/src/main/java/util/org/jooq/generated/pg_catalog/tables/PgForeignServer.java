/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.pg_catalog.Keys;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgForeignServerRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignServer extends TableImpl<PgForeignServerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_server</code>
     */
    public static final PgForeignServer PG_FOREIGN_SERVER = new PgForeignServer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignServerRecord> getRecordType() {
        return PgForeignServerRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public final TableField<PgForeignServerRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVNAME = createField(DSL.name("srvname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public final TableField<PgForeignServerRecord, Long> SRVOWNER = createField(DSL.name("srvowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public final TableField<PgForeignServerRecord, Long> SRVFDW = createField(DSL.name("srvfdw"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVTYPE = createField(DSL.name("srvtype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVVERSION = createField(DSL.name("srvversion"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public final TableField<PgForeignServerRecord, String[]> SRVACL = createField(DSL.name("srvacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public final TableField<PgForeignServerRecord, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.array(), this, "");

    private PgForeignServer(Name alias, Table<PgForeignServerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignServer(Name alias, Table<PgForeignServerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    public PgForeignServer(String alias) {
        this(DSL.name(alias), PG_FOREIGN_SERVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table
     * reference
     */
    public PgForeignServer(Name alias) {
        this(alias, PG_FOREIGN_SERVER);
    }

    /**
     * Create a <code>pg_catalog.pg_foreign_server</code> table reference
     */
    public PgForeignServer() {
        this(DSL.name("pg_foreign_server"), null);
    }

    public <O extends Record> PgForeignServer(Table<O> child, ForeignKey<O, PgForeignServerRecord> key) {
        super(child, key, PG_FOREIGN_SERVER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgForeignServerRecord> getPrimaryKey() {
        return Keys.PG_FOREIGN_SERVER_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgForeignServerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_FOREIGN_SERVER_NAME_INDEX);
    }

    @Override
    public PgForeignServer as(String alias) {
        return new PgForeignServer(DSL.name(alias), this);
    }

    @Override
    public PgForeignServer as(Name alias) {
        return new PgForeignServer(alias, this);
    }

    @Override
    public PgForeignServer as(Table<?> alias) {
        return new PgForeignServer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignServer rename(String name) {
        return new PgForeignServer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignServer rename(Name name) {
        return new PgForeignServer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignServer rename(Table<?> name) {
        return new PgForeignServer(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, Long, String, String, String[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super Long, ? super Long, ? super String, ? super String, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super Long, ? super Long, ? super String, ? super String, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
