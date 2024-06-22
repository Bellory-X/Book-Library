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
import org.jooq.UniqueKey;
import org.jooq.generated.pg_catalog.Keys;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgSubscriptionRelRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSubscriptionRel extends TableImpl<PgSubscriptionRelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_subscription_rel</code>
     */
    public static final PgSubscriptionRel PG_SUBSCRIPTION_REL = new PgSubscriptionRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSubscriptionRelRecord> getRecordType() {
        return PgSubscriptionRelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    public final TableField<PgSubscriptionRelRecord, Long> SRSUBID = createField(DSL.name("srsubid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    public final TableField<PgSubscriptionRelRecord, Long> SRRELID = createField(DSL.name("srrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    public final TableField<PgSubscriptionRelRecord, String> SRSUBSTATE = createField(DSL.name("srsubstate"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgSubscriptionRelRecord, Object> SRSUBLSN = createField(DSL.name("srsublsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    private PgSubscriptionRel(Name alias, Table<PgSubscriptionRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSubscriptionRel(Name alias, Table<PgSubscriptionRelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription_rel</code> table
     * reference
     */
    public PgSubscriptionRel(String alias) {
        this(DSL.name(alias), PG_SUBSCRIPTION_REL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription_rel</code> table
     * reference
     */
    public PgSubscriptionRel(Name alias) {
        this(alias, PG_SUBSCRIPTION_REL);
    }

    /**
     * Create a <code>pg_catalog.pg_subscription_rel</code> table reference
     */
    public PgSubscriptionRel() {
        this(DSL.name("pg_subscription_rel"), null);
    }

    public <O extends Record> PgSubscriptionRel(Table<O> child, ForeignKey<O, PgSubscriptionRelRecord> key) {
        super(child, key, PG_SUBSCRIPTION_REL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgSubscriptionRelRecord> getPrimaryKey() {
        return Keys.PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX;
    }

    @Override
    public PgSubscriptionRel as(String alias) {
        return new PgSubscriptionRel(DSL.name(alias), this);
    }

    @Override
    public PgSubscriptionRel as(Name alias) {
        return new PgSubscriptionRel(alias, this);
    }

    @Override
    public PgSubscriptionRel as(Table<?> alias) {
        return new PgSubscriptionRel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscriptionRel rename(String name) {
        return new PgSubscriptionRel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscriptionRel rename(Name name) {
        return new PgSubscriptionRel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscriptionRel rename(Table<?> name) {
        return new PgSubscriptionRel(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super String, ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super String, ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
