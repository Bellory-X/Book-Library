/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgRolesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgRoles extends TableImpl<PgRolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_roles</code>
     */
    public static final PgRoles PG_ROLES = new PgRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRolesRecord> getRecordType() {
        return PgRolesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_roles.rolname</code>.
     */
    public final TableField<PgRolesRecord, String> ROLNAME = createField(DSL.name("rolname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLSUPER = createField(DSL.name("rolsuper"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLINHERIT = createField(DSL.name("rolinherit"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCREATEROLE = createField(DSL.name("rolcreaterole"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCREATEDB = createField(DSL.name("rolcreatedb"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLCANLOGIN = createField(DSL.name("rolcanlogin"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLREPLICATION = createField(DSL.name("rolreplication"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public final TableField<PgRolesRecord, Integer> ROLCONNLIMIT = createField(DSL.name("rolconnlimit"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public final TableField<PgRolesRecord, String> ROLPASSWORD = createField(DSL.name("rolpassword"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public final TableField<PgRolesRecord, OffsetDateTime> ROLVALIDUNTIL = createField(DSL.name("rolvaliduntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public final TableField<PgRolesRecord, Boolean> ROLBYPASSRLS = createField(DSL.name("rolbypassrls"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public final TableField<PgRolesRecord, String[]> ROLCONFIG = createField(DSL.name("rolconfig"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_roles.oid</code>.
     */
    public final TableField<PgRolesRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    private PgRoles(Name alias, Table<PgRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRoles(Name alias, Table<PgRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_roles" as  SELECT pg_authid.rolname,
         pg_authid.rolsuper,
         pg_authid.rolinherit,
         pg_authid.rolcreaterole,
         pg_authid.rolcreatedb,
         pg_authid.rolcanlogin,
         pg_authid.rolreplication,
         pg_authid.rolconnlimit,
         '********'::text AS rolpassword,
         pg_authid.rolvaliduntil,
         pg_authid.rolbypassrls,
         s.setconfig AS rolconfig,
         pg_authid.oid
        FROM (pg_authid
          LEFT JOIN pg_db_role_setting s ON (((pg_authid.oid = s.setrole) AND (s.setdatabase = (0)::oid))));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles(String alias) {
        this(DSL.name(alias), PG_ROLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles(Name alias) {
        this(alias, PG_ROLES);
    }

    /**
     * Create a <code>pg_catalog.pg_roles</code> table reference
     */
    public PgRoles() {
        this(DSL.name("pg_roles"), null);
    }

    public <O extends Record> PgRoles(Table<O> child, ForeignKey<O, PgRolesRecord> key) {
        super(child, key, PG_ROLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgRoles as(String alias) {
        return new PgRoles(DSL.name(alias), this);
    }

    @Override
    public PgRoles as(Name alias) {
        return new PgRoles(alias, this);
    }

    @Override
    public PgRoles as(Table<?> alias) {
        return new PgRoles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRoles rename(String name) {
        return new PgRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRoles rename(Name name) {
        return new PgRoles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRoles rename(Table<?> name) {
        return new PgRoles(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime, Boolean, String[], Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, ? super String, ? super OffsetDateTime, ? super Boolean, ? super String[], ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, ? super String, ? super OffsetDateTime, ? super Boolean, ? super String[], ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
