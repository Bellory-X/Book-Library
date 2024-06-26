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
import org.jooq.generated.information_schema.tables.records.DataTypePrivilegesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataTypePrivileges extends TableImpl<DataTypePrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.data_type_privileges</code>
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = new DataTypePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataTypePrivilegesRecord> getRecordType() {
        return DataTypePrivilegesRecord.class;
    }

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "data_type_privileges" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,
         x.objschema AS object_schema,
         x.objname AS object_name,
         (x.objtype)::information_schema.character_data AS object_type,
         x.objdtdid AS dtd_identifier
        FROM ( SELECT attributes.udt_schema,
                 attributes.udt_name,
                 'USER-DEFINED TYPE'::text AS text,
                 attributes.dtd_identifier
                FROM information_schema.attributes
             UNION ALL
              SELECT columns.table_schema,
                 columns.table_name,
                 'TABLE'::text AS text,
                 columns.dtd_identifier
                FROM information_schema.columns
             UNION ALL
              SELECT domains.domain_schema,
                 domains.domain_name,
                 'DOMAIN'::text AS text,
                 domains.dtd_identifier
                FROM information_schema.domains
             UNION ALL
              SELECT parameters.specific_schema,
                 parameters.specific_name,
                 'ROUTINE'::text AS text,
                 parameters.dtd_identifier
                FROM information_schema.parameters
             UNION ALL
              SELECT routines.specific_schema,
                 routines.specific_name,
                 'ROUTINE'::text AS text,
                 routines.dtd_identifier
                FROM information_schema.routines) x(objschema, objname, objtype, objdtdid);
        """));
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    public DataTypePrivileges(String alias) {
        this(DSL.name(alias), DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    public DataTypePrivileges(Name alias) {
        this(alias, DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.data_type_privileges</code> table
     * reference
     */
    public DataTypePrivileges() {
        this(DSL.name("data_type_privileges"), null);
    }

    public <O extends Record> DataTypePrivileges(Table<O> child, ForeignKey<O, DataTypePrivilegesRecord> key) {
        super(child, key, DATA_TYPE_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DataTypePrivileges as(String alias) {
        return new DataTypePrivileges(DSL.name(alias), this);
    }

    @Override
    public DataTypePrivileges as(Name alias) {
        return new DataTypePrivileges(alias, this);
    }

    @Override
    public DataTypePrivileges as(Table<?> alias) {
        return new DataTypePrivileges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(String name) {
        return new DataTypePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(Name name) {
        return new DataTypePrivileges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(Table<?> name) {
        return new DataTypePrivileges(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
