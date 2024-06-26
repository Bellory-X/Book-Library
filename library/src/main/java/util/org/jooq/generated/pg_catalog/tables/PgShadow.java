/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgShadowRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShadow extends TableImpl<PgShadowRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_shadow</code>
     */
    public static final PgShadow PG_SHADOW = new PgShadow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShadowRecord> getRecordType() {
        return PgShadowRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shadow.usename</code>.
     */
    public final TableField<PgShadowRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usesysid</code>.
     */
    public final TableField<PgShadowRecord, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usecreatedb</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USECREATEDB = createField(DSL.name("usecreatedb"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usesuper</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USESUPER = createField(DSL.name("usesuper"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.userepl</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USEREPL = createField(DSL.name("userepl"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usebypassrls</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USEBYPASSRLS = createField(DSL.name("usebypassrls"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.passwd</code>.
     */
    public final TableField<PgShadowRecord, String> PASSWD = createField(DSL.name("passwd"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.valuntil</code>.
     */
    public final TableField<PgShadowRecord, OffsetDateTime> VALUNTIL = createField(DSL.name("valuntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.useconfig</code>.
     */
    public final TableField<PgShadowRecord, String[]> USECONFIG = createField(DSL.name("useconfig"), SQLDataType.CLOB.array(), this, "");

    private PgShadow(Name alias, Table<PgShadowRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShadow(Name alias, Table<PgShadowRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_shadow" as  SELECT pg_authid.rolname AS usename,
          pg_authid.oid AS usesysid,
          pg_authid.rolcreatedb AS usecreatedb,
          pg_authid.rolsuper AS usesuper,
          pg_authid.rolreplication AS userepl,
          pg_authid.rolbypassrls AS usebypassrls,
          pg_authid.rolpassword AS passwd,
          pg_authid.rolvaliduntil AS valuntil,
          s.setconfig AS useconfig
         FROM (pg_authid
           LEFT JOIN pg_db_role_setting s ON (((pg_authid.oid = s.setrole) AND (s.setdatabase = (0)::oid))))
        WHERE pg_authid.rolcanlogin;
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shadow</code> table reference
     */
    public PgShadow(String alias) {
        this(DSL.name(alias), PG_SHADOW);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shadow</code> table reference
     */
    public PgShadow(Name alias) {
        this(alias, PG_SHADOW);
    }

    /**
     * Create a <code>pg_catalog.pg_shadow</code> table reference
     */
    public PgShadow() {
        this(DSL.name("pg_shadow"), null);
    }

    public <O extends Record> PgShadow(Table<O> child, ForeignKey<O, PgShadowRecord> key) {
        super(child, key, PG_SHADOW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgShadow as(String alias) {
        return new PgShadow(DSL.name(alias), this);
    }

    @Override
    public PgShadow as(Name alias) {
        return new PgShadow(alias, this);
    }

    @Override
    public PgShadow as(Table<?> alias) {
        return new PgShadow(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShadow rename(String name) {
        return new PgShadow(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShadow rename(Name name) {
        return new PgShadow(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShadow rename(Table<?> name) {
        return new PgShadow(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super OffsetDateTime, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
