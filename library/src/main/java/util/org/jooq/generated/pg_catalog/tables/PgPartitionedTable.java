/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


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
import org.jooq.generated.pg_catalog.tables.records.PgPartitionedTableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPartitionedTable extends TableImpl<PgPartitionedTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_partitioned_table</code>
     */
    public static final PgPartitionedTable PG_PARTITIONED_TABLE = new PgPartitionedTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPartitionedTableRecord> getRecordType() {
        return PgPartitionedTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public final TableField<PgPartitionedTableRecord, Long> PARTRELID = createField(DSL.name("partrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public final TableField<PgPartitionedTableRecord, String> PARTSTRAT = createField(DSL.name("partstrat"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public final TableField<PgPartitionedTableRecord, Short> PARTNATTS = createField(DSL.name("partnatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partdefid</code>.
     */
    public final TableField<PgPartitionedTableRecord, Long> PARTDEFID = createField(DSL.name("partdefid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public final TableField<PgPartitionedTableRecord, Object[]> PARTATTRS = createField(DSL.name("partattrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public final TableField<PgPartitionedTableRecord, Object[]> PARTCLASS = createField(DSL.name("partclass"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public final TableField<PgPartitionedTableRecord, Object[]> PARTCOLLATION = createField(DSL.name("partcollation"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgPartitionedTableRecord, Object> PARTEXPRS = createField(DSL.name("partexprs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgPartitionedTable(Name alias, Table<PgPartitionedTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPartitionedTable(Name alias, Table<PgPartitionedTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partitioned_table</code> table
     * reference
     */
    public PgPartitionedTable(String alias) {
        this(DSL.name(alias), PG_PARTITIONED_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partitioned_table</code> table
     * reference
     */
    public PgPartitionedTable(Name alias) {
        this(alias, PG_PARTITIONED_TABLE);
    }

    /**
     * Create a <code>pg_catalog.pg_partitioned_table</code> table reference
     */
    public PgPartitionedTable() {
        this(DSL.name("pg_partitioned_table"), null);
    }

    public <O extends Record> PgPartitionedTable(Table<O> child, ForeignKey<O, PgPartitionedTableRecord> key) {
        super(child, key, PG_PARTITIONED_TABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgPartitionedTableRecord> getPrimaryKey() {
        return Keys.PG_PARTITIONED_TABLE_PARTRELID_INDEX;
    }

    @Override
    public PgPartitionedTable as(String alias) {
        return new PgPartitionedTable(DSL.name(alias), this);
    }

    @Override
    public PgPartitionedTable as(Name alias) {
        return new PgPartitionedTable(alias, this);
    }

    @Override
    public PgPartitionedTable as(Table<?> alias) {
        return new PgPartitionedTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionedTable rename(String name) {
        return new PgPartitionedTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionedTable rename(Name name) {
        return new PgPartitionedTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionedTable rename(Table<?> name) {
        return new PgPartitionedTable(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Short, Long, Object[], Object[], Object[], Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super Short, ? super Long, ? super Object[], ? super Object[], ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super Short, ? super Long, ? super Object[], ? super Object[], ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
