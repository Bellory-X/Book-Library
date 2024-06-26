/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
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
import org.jooq.generated.pg_catalog.tables.records.PgAuthMembersRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAuthMembers extends TableImpl<PgAuthMembersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_auth_members</code>
     */
    public static final PgAuthMembers PG_AUTH_MEMBERS = new PgAuthMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAuthMembersRecord> getRecordType() {
        return PgAuthMembersRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> ROLEID = createField(DSL.name("roleid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.member</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> MEMBER = createField(DSL.name("member"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public final TableField<PgAuthMembersRecord, Long> GRANTOR = createField(DSL.name("grantor"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public final TableField<PgAuthMembersRecord, Boolean> ADMIN_OPTION = createField(DSL.name("admin_option"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgAuthMembers(Name alias, Table<PgAuthMembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAuthMembers(Name alias, Table<PgAuthMembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers(String alias) {
        this(DSL.name(alias), PG_AUTH_MEMBERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers(Name alias) {
        this(alias, PG_AUTH_MEMBERS);
    }

    /**
     * Create a <code>pg_catalog.pg_auth_members</code> table reference
     */
    public PgAuthMembers() {
        this(DSL.name("pg_auth_members"), null);
    }

    public <O extends Record> PgAuthMembers(Table<O> child, ForeignKey<O, PgAuthMembersRecord> key) {
        super(child, key, PG_AUTH_MEMBERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgAuthMembersRecord> getPrimaryKey() {
        return Keys.PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX;
    }

    @Override
    public List<UniqueKey<PgAuthMembersRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX);
    }

    @Override
    public PgAuthMembers as(String alias) {
        return new PgAuthMembers(DSL.name(alias), this);
    }

    @Override
    public PgAuthMembers as(Name alias) {
        return new PgAuthMembers(alias, this);
    }

    @Override
    public PgAuthMembers as(Table<?> alias) {
        return new PgAuthMembers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(String name) {
        return new PgAuthMembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(Name name) {
        return new PgAuthMembers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAuthMembers rename(Table<?> name) {
        return new PgAuthMembers(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
