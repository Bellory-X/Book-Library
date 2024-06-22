/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


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
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.RoleUsageGrantsRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleUsageGrants extends TableImpl<RoleUsageGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_usage_grants</code>
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = new RoleUsageGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUsageGrantsRecord> getRecordType() {
        return RoleUsageGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_usage_grants.grantor</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.grantee</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_name</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), org.jooq.generated.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), org.jooq.generated.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_usage_grants" as  SELECT usage_privileges.grantor,
          usage_privileges.grantee,
          usage_privileges.object_catalog,
          usage_privileges.object_schema,
          usage_privileges.object_name,
          usage_privileges.object_type,
          usage_privileges.privilege_type,
          usage_privileges.is_grantable
         FROM information_schema.usage_privileges
        WHERE (((usage_privileges.grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((usage_privileges.grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants(String alias) {
        this(DSL.name(alias), ROLE_USAGE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants(Name alias) {
        this(alias, ROLE_USAGE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants() {
        this(DSL.name("role_usage_grants"), null);
    }

    public <O extends Record> RoleUsageGrants(Table<O> child, ForeignKey<O, RoleUsageGrantsRecord> key) {
        super(child, key, ROLE_USAGE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleUsageGrants as(String alias) {
        return new RoleUsageGrants(DSL.name(alias), this);
    }

    @Override
    public RoleUsageGrants as(Name alias) {
        return new RoleUsageGrants(alias, this);
    }

    @Override
    public RoleUsageGrants as(Table<?> alias) {
        return new RoleUsageGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(String name) {
        return new RoleUsageGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(Name name) {
        return new RoleUsageGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(Table<?> name) {
        return new RoleUsageGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}