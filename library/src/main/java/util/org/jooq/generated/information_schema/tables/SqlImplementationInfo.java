/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.SqlImplementationInfoRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqlImplementationInfo extends TableImpl<SqlImplementationInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.sql_implementation_info</code>
     */
    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = new SqlImplementationInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlImplementationInfoRecord> getRecordType() {
        return SqlImplementationInfoRecord.class;
    }

    /**
     * The column
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> IMPLEMENTATION_INFO_ID = createField(DSL.name("implementation_info_id"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> IMPLEMENTATION_INFO_NAME = createField(DSL.name("implementation_info_name"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public final TableField<SqlImplementationInfoRecord, Integer> INTEGER_VALUE = createField(DSL.name("integer_value"), org.jooq.generated.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> CHARACTER_VALUE = createField(DSL.name("character_value"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> COMMENTS = createField(DSL.name("comments"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private SqlImplementationInfo(Name alias, Table<SqlImplementationInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlImplementationInfo(Name alias, Table<SqlImplementationInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.sql_implementation_info</code>
     * table reference
     */
    public SqlImplementationInfo(String alias) {
        this(DSL.name(alias), SQL_IMPLEMENTATION_INFO);
    }

    /**
     * Create an aliased <code>information_schema.sql_implementation_info</code>
     * table reference
     */
    public SqlImplementationInfo(Name alias) {
        this(alias, SQL_IMPLEMENTATION_INFO);
    }

    /**
     * Create a <code>information_schema.sql_implementation_info</code> table
     * reference
     */
    public SqlImplementationInfo() {
        this(DSL.name("sql_implementation_info"), null);
    }

    public <O extends Record> SqlImplementationInfo(Table<O> child, ForeignKey<O, SqlImplementationInfoRecord> key) {
        super(child, key, SQL_IMPLEMENTATION_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SqlImplementationInfo as(String alias) {
        return new SqlImplementationInfo(DSL.name(alias), this);
    }

    @Override
    public SqlImplementationInfo as(Name alias) {
        return new SqlImplementationInfo(alias, this);
    }

    @Override
    public SqlImplementationInfo as(Table<?> alias) {
        return new SqlImplementationInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlImplementationInfo rename(String name) {
        return new SqlImplementationInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlImplementationInfo rename(Name name) {
        return new SqlImplementationInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlImplementationInfo rename(Table<?> name) {
        return new SqlImplementationInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
