/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.ColumnUdtUsageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnUdtUsage extends TableImpl<ColumnUdtUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_udt_usage</code>
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = new ColumnUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnUdtUsageRecord> getRecordType() {
        return ColumnUdtUsageRecord.class;
    }

    /**
     * The column <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.table_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_udt_usage.column_name</code>.
     */
    public final TableField<ColumnUdtUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnUdtUsage(Name alias, Table<ColumnUdtUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_udt_usage" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,
          (COALESCE(nbt.nspname, nt.nspname))::information_schema.sql_identifier AS udt_schema,
          (COALESCE(bt.typname, t.typname))::information_schema.sql_identifier AS udt_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name
         FROM pg_attribute a,
          pg_class c,
          pg_namespace nc,
          ((pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid)))
           LEFT JOIN (pg_type bt
           JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typtype = 'd'::"char") AND (t.typbasetype = bt.oid))))
        WHERE ((a.attrelid = c.oid) AND (a.atttypid = t.oid) AND (nc.oid = c.relnamespace) AND (a.attnum > 0) AND (NOT a.attisdropped) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND pg_has_role(COALESCE(bt.typowner, t.typowner), 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(String alias) {
        this(DSL.name(alias), COLUMN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_udt_usage</code> table
     * reference
     */
    public ColumnUdtUsage(Name alias) {
        this(alias, COLUMN_UDT_USAGE);
    }

    /**
     * Create a <code>information_schema.column_udt_usage</code> table reference
     */
    public ColumnUdtUsage() {
        this(DSL.name("column_udt_usage"), null);
    }

    public <O extends Record> ColumnUdtUsage(Table<O> child, ForeignKey<O, ColumnUdtUsageRecord> key) {
        super(child, key, COLUMN_UDT_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnUdtUsage as(String alias) {
        return new ColumnUdtUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnUdtUsage as(Name alias) {
        return new ColumnUdtUsage(alias, this);
    }

    @Override
    public ColumnUdtUsage as(Table<?> alias) {
        return new ColumnUdtUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(String name) {
        return new ColumnUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Name name) {
        return new ColumnUdtUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnUdtUsage rename(Table<?> name) {
        return new ColumnUdtUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
