/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.pg_catalog.Keys;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgStatisticExtDataRecord;
import org.jooq.generated.pg_catalog.tables.records.PgStatisticRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatisticExtData extends TableImpl<PgStatisticExtDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic_ext_data</code>
     */
    public static final PgStatisticExtData PG_STATISTIC_EXT_DATA = new PgStatisticExtData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatisticExtDataRecord> getRecordType() {
        return PgStatisticExtDataRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    public final TableField<PgStatisticExtDataRecord, Long> STXOID = createField(DSL.name("stxoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxdinherit</code>.
     */
    public final TableField<PgStatisticExtDataRecord, Boolean> STXDINHERIT = createField(DSL.name("stxdinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDNDISTINCT = createField(DSL.name("stxdndistinct"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ndistinct\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDDEPENDENCIES = createField(DSL.name("stxddependencies"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_dependencies\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDMCV = createField(DSL.name("stxdmcv"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_mcv_list\""), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxdexpr</code>.
     */
    public final TableField<PgStatisticExtDataRecord, PgStatisticRecord[]> STXDEXPR = createField(DSL.name("stxdexpr"), org.jooq.generated.pg_catalog.tables.PgStatistic.PG_STATISTIC.getDataType().array(), this, "");

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext_data</code> table
     * reference
     */
    public PgStatisticExtData(String alias) {
        this(DSL.name(alias), PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext_data</code> table
     * reference
     */
    public PgStatisticExtData(Name alias) {
        this(alias, PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create a <code>pg_catalog.pg_statistic_ext_data</code> table reference
     */
    public PgStatisticExtData() {
        this(DSL.name("pg_statistic_ext_data"), null);
    }

    public <O extends Record> PgStatisticExtData(Table<O> child, ForeignKey<O, PgStatisticExtDataRecord> key) {
        super(child, key, PG_STATISTIC_EXT_DATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgStatisticExtDataRecord> getPrimaryKey() {
        return Keys.PG_STATISTIC_EXT_DATA_STXOID_INH_INDEX;
    }

    @Override
    public PgStatisticExtData as(String alias) {
        return new PgStatisticExtData(DSL.name(alias), this);
    }

    @Override
    public PgStatisticExtData as(Name alias) {
        return new PgStatisticExtData(alias, this);
    }

    @Override
    public PgStatisticExtData as(Table<?> alias) {
        return new PgStatisticExtData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(String name) {
        return new PgStatisticExtData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(Name name) {
        return new PgStatisticExtData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(Table<?> name) {
        return new PgStatisticExtData(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Boolean, Object, Object, Object, PgStatisticRecord[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super Boolean, ? super Object, ? super Object, ? super Object, ? super PgStatisticRecord[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Boolean, ? super Object, ? super Object, ? super Object, ? super PgStatisticRecord[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
