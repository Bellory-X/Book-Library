/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.pg_catalog.Keys;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgAuthidRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAuthid extends TableImpl<PgAuthidRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_authid</code>
     */
    public static final PgAuthid PG_AUTHID = new PgAuthid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAuthidRecord> getRecordType() {
        return PgAuthidRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_authid.oid</code>.
     */
    public final TableField<PgAuthidRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolname</code>.
     */
    public final TableField<PgAuthidRecord, String> ROLNAME = createField(DSL.name("rolname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLSUPER = createField(DSL.name("rolsuper"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLINHERIT = createField(DSL.name("rolinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLCREATEROLE = createField(DSL.name("rolcreaterole"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLCREATEDB = createField(DSL.name("rolcreatedb"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLCANLOGIN = createField(DSL.name("rolcanlogin"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLREPLICATION = createField(DSL.name("rolreplication"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public final TableField<PgAuthidRecord, Boolean> ROLBYPASSRLS = createField(DSL.name("rolbypassrls"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public final TableField<PgAuthidRecord, Integer> ROLCONNLIMIT = createField(DSL.name("rolconnlimit"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public final TableField<PgAuthidRecord, String> ROLPASSWORD = createField(DSL.name("rolpassword"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public final TableField<PgAuthidRecord, OffsetDateTime> ROLVALIDUNTIL = createField(DSL.name("rolvaliduntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgAuthid(Name alias, Table<PgAuthidRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAuthid(Name alias, Table<PgAuthidRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_authid</code> table reference
     */
    public PgAuthid(String alias) {
        this(DSL.name(alias), PG_AUTHID);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_authid</code> table reference
     */
    public PgAuthid(Name alias) {
        this(alias, PG_AUTHID);
    }

    /**
     * Create a <code>pg_catalog.pg_authid</code> table reference
     */
    public PgAuthid() {
        this(DSL.name("pg_authid"), null);
    }

    public <O extends Record> PgAuthid(Table<O> child, ForeignKey<O, PgAuthidRecord> key) {
        super(child, key, PG_AUTHID);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgAuthidRecord> getPrimaryKey() {
        return Keys.PG_AUTHID_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgAuthidRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AUTHID_ROLNAME_INDEX);
    }

    @Override
    public PgAuthid as(String alias) {
        return new PgAuthid(DSL.name(alias), this);
    }

    @Override
    public PgAuthid as(Name alias) {
        return new PgAuthid(alias, this);
    }

    @Override
    public PgAuthid as(Table<?> alias) {
        return new PgAuthid(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthid rename(String name) {
        return new PgAuthid(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthid rename(Name name) {
        return new PgAuthid(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthid rename(Table<?> name) {
        return new PgAuthid(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Integer, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
