/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


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
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.ViewRoutineUsageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewRoutineUsage extends TableImpl<ViewRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.view_routine_usage</code>
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = new ViewRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewRoutineUsageRecord> getRecordType() {
        return ViewRoutineUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.view_routine_usage.table_catalog</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_routine_usage.table_schema</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_routine_usage.table_name</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_routine_usage.specific_catalog</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_routine_usage.specific_schema</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_routine_usage.specific_name</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ViewRoutineUsage(Name alias, Table<ViewRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewRoutineUsage(Name alias, Table<ViewRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_routine_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS table_catalog,
          (nv.nspname)::information_schema.sql_identifier AS table_schema,
          (v.relname)::information_schema.sql_identifier AS table_name,
          (current_database())::information_schema.sql_identifier AS specific_catalog,
          (np.nspname)::information_schema.sql_identifier AS specific_schema,
          (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name
         FROM pg_namespace nv,
          pg_class v,
          pg_depend dv,
          pg_depend dp,
          pg_proc p,
          pg_namespace np
        WHERE ((nv.oid = v.relnamespace) AND (v.relkind = 'v'::"char") AND (v.oid = dv.refobjid) AND (dv.refclassid = ('pg_class'::regclass)::oid) AND (dv.classid = ('pg_rewrite'::regclass)::oid) AND (dv.deptype = 'i'::"char") AND (dv.objid = dp.objid) AND (dp.classid = ('pg_rewrite'::regclass)::oid) AND (dp.refclassid = ('pg_proc'::regclass)::oid) AND (dp.refobjid = p.oid) AND (p.pronamespace = np.oid) AND pg_has_role(p.proowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.view_routine_usage</code>
     * table reference
     */
    public ViewRoutineUsage(String alias) {
        this(DSL.name(alias), VIEW_ROUTINE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.view_routine_usage</code>
     * table reference
     */
    public ViewRoutineUsage(Name alias) {
        this(alias, VIEW_ROUTINE_USAGE);
    }

    /**
     * Create a <code>information_schema.view_routine_usage</code> table
     * reference
     */
    public ViewRoutineUsage() {
        this(DSL.name("view_routine_usage"), null);
    }

    public <O extends Record> ViewRoutineUsage(Table<O> child, ForeignKey<O, ViewRoutineUsageRecord> key) {
        super(child, key, VIEW_ROUTINE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewRoutineUsage as(String alias) {
        return new ViewRoutineUsage(DSL.name(alias), this);
    }

    @Override
    public ViewRoutineUsage as(Name alias) {
        return new ViewRoutineUsage(alias, this);
    }

    @Override
    public ViewRoutineUsage as(Table<?> alias) {
        return new ViewRoutineUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(String name) {
        return new ViewRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(Name name) {
        return new ViewRoutineUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(Table<?> name) {
        return new ViewRoutineUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
