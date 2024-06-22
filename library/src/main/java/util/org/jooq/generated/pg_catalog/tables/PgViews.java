/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgViewsRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgViews extends TableImpl<PgViewsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_views</code>
     */
    public static final PgViews PG_VIEWS = new PgViews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgViewsRecord> getRecordType() {
        return PgViewsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_views.schemaname</code>.
     */
    public final TableField<PgViewsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.viewname</code>.
     */
    public final TableField<PgViewsRecord, String> VIEWNAME = createField(DSL.name("viewname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.viewowner</code>.
     */
    public final TableField<PgViewsRecord, String> VIEWOWNER = createField(DSL.name("viewowner"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.definition</code>.
     */
    public final TableField<PgViewsRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB, this, "");

    private PgViews(Name alias, Table<PgViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgViews(Name alias, Table<PgViewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_views" as  SELECT n.nspname AS schemaname,
          c.relname AS viewname,
          pg_get_userbyid(c.relowner) AS viewowner,
          pg_get_viewdef(c.oid) AS definition
         FROM (pg_class c
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE (c.relkind = 'v'::"char");
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews(String alias) {
        this(DSL.name(alias), PG_VIEWS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews(Name alias) {
        this(alias, PG_VIEWS);
    }

    /**
     * Create a <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews() {
        this(DSL.name("pg_views"), null);
    }

    public <O extends Record> PgViews(Table<O> child, ForeignKey<O, PgViewsRecord> key) {
        super(child, key, PG_VIEWS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgViews as(String alias) {
        return new PgViews(DSL.name(alias), this);
    }

    @Override
    public PgViews as(Name alias) {
        return new PgViews(alias, this);
    }

    @Override
    public PgViews as(Table<?> alias) {
        return new PgViews(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgViews rename(String name) {
        return new PgViews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgViews rename(Name name) {
        return new PgViews(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgViews rename(Table<?> name) {
        return new PgViews(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}