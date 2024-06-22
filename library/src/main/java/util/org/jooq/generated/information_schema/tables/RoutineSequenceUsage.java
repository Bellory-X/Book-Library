/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


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
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.RoutineSequenceUsageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineSequenceUsage extends TableImpl<RoutineSequenceUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_sequence_usage</code>
     */
    public static final RoutineSequenceUsage ROUTINE_SEQUENCE_USAGE = new RoutineSequenceUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineSequenceUsageRecord> getRecordType() {
        return RoutineSequenceUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.specific_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.routine_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_catalog</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_CATALOG = createField(DSL.name("sequence_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_schema</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("sequence_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_sequence_usage.sequence_name</code>.
     */
    public final TableField<RoutineSequenceUsageRecord, String> SEQUENCE_NAME = createField(DSL.name("sequence_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineSequenceUsage(Name alias, Table<RoutineSequenceUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "routine_sequence_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,
          (np.nspname)::information_schema.sql_identifier AS specific_schema,
          (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
          (current_database())::information_schema.sql_identifier AS routine_catalog,
          (np.nspname)::information_schema.sql_identifier AS routine_schema,
          (p.proname)::information_schema.sql_identifier AS routine_name,
          (current_database())::information_schema.sql_identifier AS sequence_catalog,
          (ns.nspname)::information_schema.sql_identifier AS sequence_schema,
          (s.relname)::information_schema.sql_identifier AS sequence_name
         FROM pg_namespace np,
          pg_proc p,
          pg_depend d,
          pg_class s,
          pg_namespace ns
        WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = s.oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (s.relnamespace = ns.oid) AND (s.relkind = 'S'::"char") AND pg_has_role(s.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.routine_sequence_usage</code>
     * table reference
     */
    public RoutineSequenceUsage(String alias) {
        this(DSL.name(alias), ROUTINE_SEQUENCE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_sequence_usage</code>
     * table reference
     */
    public RoutineSequenceUsage(Name alias) {
        this(alias, ROUTINE_SEQUENCE_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_sequence_usage</code> table
     * reference
     */
    public RoutineSequenceUsage() {
        this(DSL.name("routine_sequence_usage"), null);
    }

    public <O extends Record> RoutineSequenceUsage(Table<O> child, ForeignKey<O, RoutineSequenceUsageRecord> key) {
        super(child, key, ROUTINE_SEQUENCE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineSequenceUsage as(String alias) {
        return new RoutineSequenceUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineSequenceUsage as(Name alias) {
        return new RoutineSequenceUsage(alias, this);
    }

    @Override
    public RoutineSequenceUsage as(Table<?> alias) {
        return new RoutineSequenceUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(String name) {
        return new RoutineSequenceUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(Name name) {
        return new RoutineSequenceUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineSequenceUsage rename(Table<?> name) {
        return new RoutineSequenceUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
