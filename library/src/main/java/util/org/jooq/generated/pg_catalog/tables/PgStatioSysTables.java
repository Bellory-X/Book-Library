/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgStatioSysTablesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatioSysTables extends TableImpl<PgStatioSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_sys_tables</code>
     */
    public static final PgStatioSysTables PG_STATIO_SYS_TABLES = new PgStatioSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioSysTablesRecord> getRecordType() {
        return PgStatioSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.relid</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatioSysTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.relname</code>.
     */
    public final TableField<PgStatioSysTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.heap_blks_read</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> HEAP_BLKS_READ = createField(DSL.name("heap_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.heap_blks_hit</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> HEAP_BLKS_HIT = createField(DSL.name("heap_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.idx_blks_read</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> IDX_BLKS_READ = createField(DSL.name("idx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.idx_blks_hit</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> IDX_BLKS_HIT = createField(DSL.name("idx_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.toast_blks_read</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> TOAST_BLKS_READ = createField(DSL.name("toast_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.toast_blks_hit</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> TOAST_BLKS_HIT = createField(DSL.name("toast_blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.tidx_blks_read</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> TIDX_BLKS_READ = createField(DSL.name("tidx_blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_tables.tidx_blks_hit</code>.
     */
    public final TableField<PgStatioSysTablesRecord, Long> TIDX_BLKS_HIT = createField(DSL.name("tidx_blks_hit"), SQLDataType.BIGINT, this, "");

    private PgStatioSysTables(Name alias, Table<PgStatioSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysTables(Name alias, Table<PgStatioSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_statio_sys_tables" as  SELECT pg_statio_all_tables.relid,
          pg_statio_all_tables.schemaname,
          pg_statio_all_tables.relname,
          pg_statio_all_tables.heap_blks_read,
          pg_statio_all_tables.heap_blks_hit,
          pg_statio_all_tables.idx_blks_read,
          pg_statio_all_tables.idx_blks_hit,
          pg_statio_all_tables.toast_blks_read,
          pg_statio_all_tables.toast_blks_hit,
          pg_statio_all_tables.tidx_blks_read,
          pg_statio_all_tables.tidx_blks_hit
         FROM pg_statio_all_tables
        WHERE ((pg_statio_all_tables.schemaname = ANY (ARRAY['pg_catalog'::name, 'information_schema'::name])) OR (pg_statio_all_tables.schemaname ~ '^pg_toast'::text));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_tables</code> table
     * reference
     */
    public PgStatioSysTables(String alias) {
        this(DSL.name(alias), PG_STATIO_SYS_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_tables</code> table
     * reference
     */
    public PgStatioSysTables(Name alias) {
        this(alias, PG_STATIO_SYS_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_statio_sys_tables</code> table reference
     */
    public PgStatioSysTables() {
        this(DSL.name("pg_statio_sys_tables"), null);
    }

    public <O extends Record> PgStatioSysTables(Table<O> child, ForeignKey<O, PgStatioSysTablesRecord> key) {
        super(child, key, PG_STATIO_SYS_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatioSysTables as(String alias) {
        return new PgStatioSysTables(DSL.name(alias), this);
    }

    @Override
    public PgStatioSysTables as(Name alias) {
        return new PgStatioSysTables(alias, this);
    }

    @Override
    public PgStatioSysTables as(Table<?> alias) {
        return new PgStatioSysTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysTables rename(String name) {
        return new PgStatioSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysTables rename(Name name) {
        return new PgStatioSysTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioSysTables rename(Table<?> name) {
        return new PgStatioSysTables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
