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
import org.jooq.generated.information_schema.tables.records.ColumnDomainUsageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnDomainUsage extends TableImpl<ColumnDomainUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_domain_usage</code>
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = new ColumnDomainUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnDomainUsageRecord> getRecordType() {
        return ColumnDomainUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    public final TableField<ColumnDomainUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnDomainUsage(Name alias, Table<ColumnDomainUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnDomainUsage(Name alias, Table<ColumnDomainUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_domain_usage" as  SELECT (current_database())::information_schema.sql_identifier AS domain_catalog,
          (nt.nspname)::information_schema.sql_identifier AS domain_schema,
          (t.typname)::information_schema.sql_identifier AS domain_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name
         FROM pg_type t,
          pg_namespace nt,
          pg_class c,
          pg_namespace nc,
          pg_attribute a
        WHERE ((t.typnamespace = nt.oid) AND (c.relnamespace = nc.oid) AND (a.attrelid = c.oid) AND (a.atttypid = t.oid) AND (t.typtype = 'd'::"char") AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (a.attnum > 0) AND (NOT a.attisdropped) AND pg_has_role(t.typowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code>
     * table reference
     */
    public ColumnDomainUsage(String alias) {
        this(DSL.name(alias), COLUMN_DOMAIN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_domain_usage</code>
     * table reference
     */
    public ColumnDomainUsage(Name alias) {
        this(alias, COLUMN_DOMAIN_USAGE);
    }

    /**
     * Create a <code>information_schema.column_domain_usage</code> table
     * reference
     */
    public ColumnDomainUsage() {
        this(DSL.name("column_domain_usage"), null);
    }

    public <O extends Record> ColumnDomainUsage(Table<O> child, ForeignKey<O, ColumnDomainUsageRecord> key) {
        super(child, key, COLUMN_DOMAIN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnDomainUsage as(String alias) {
        return new ColumnDomainUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnDomainUsage as(Name alias) {
        return new ColumnDomainUsage(alias, this);
    }

    @Override
    public ColumnDomainUsage as(Table<?> alias) {
        return new ColumnDomainUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnDomainUsage rename(String name) {
        return new ColumnDomainUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnDomainUsage rename(Name name) {
        return new ColumnDomainUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnDomainUsage rename(Table<?> name) {
        return new ColumnDomainUsage(name.getQualifiedName(), null);
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
