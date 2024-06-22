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
import org.jooq.generated.pg_catalog.tables.records.PgTsConfigMapRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsConfigMap extends TableImpl<PgTsConfigMapRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_config_map</code>
     */
    public static final PgTsConfigMap PG_TS_CONFIG_MAP = new PgTsConfigMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsConfigMapRecord> getRecordType() {
        return PgTsConfigMapRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapcfg</code>.
     */
    public final TableField<PgTsConfigMapRecord, Long> MAPCFG = createField(DSL.name("mapcfg"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.maptokentype</code>.
     */
    public final TableField<PgTsConfigMapRecord, Integer> MAPTOKENTYPE = createField(DSL.name("maptokentype"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapseqno</code>.
     */
    public final TableField<PgTsConfigMapRecord, Integer> MAPSEQNO = createField(DSL.name("mapseqno"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapdict</code>.
     */
    public final TableField<PgTsConfigMapRecord, Long> MAPDICT = createField(DSL.name("mapdict"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgTsConfigMap(Name alias, Table<PgTsConfigMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsConfigMap(Name alias, Table<PgTsConfigMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config_map</code> table
     * reference
     */
    public PgTsConfigMap(String alias) {
        this(DSL.name(alias), PG_TS_CONFIG_MAP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config_map</code> table
     * reference
     */
    public PgTsConfigMap(Name alias) {
        this(alias, PG_TS_CONFIG_MAP);
    }

    /**
     * Create a <code>pg_catalog.pg_ts_config_map</code> table reference
     */
    public PgTsConfigMap() {
        this(DSL.name("pg_ts_config_map"), null);
    }

    public <O extends Record> PgTsConfigMap(Table<O> child, ForeignKey<O, PgTsConfigMapRecord> key) {
        super(child, key, PG_TS_CONFIG_MAP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTsConfigMapRecord> getPrimaryKey() {
        return Keys.PG_TS_CONFIG_MAP_INDEX;
    }

    @Override
    public PgTsConfigMap as(String alias) {
        return new PgTsConfigMap(DSL.name(alias), this);
    }

    @Override
    public PgTsConfigMap as(Name alias) {
        return new PgTsConfigMap(alias, this);
    }

    @Override
    public PgTsConfigMap as(Table<?> alias) {
        return new PgTsConfigMap(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfigMap rename(String name) {
        return new PgTsConfigMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfigMap rename(Name name) {
        return new PgTsConfigMap(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfigMap rename(Table<?> name) {
        return new PgTsConfigMap(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Integer, Integer, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Integer, ? super Integer, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Integer, ? super Integer, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
