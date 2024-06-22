/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;
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
import org.jooq.UniqueKey;
import org.jooq.generated.pg_catalog.Keys;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgOpclassRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOpclass extends TableImpl<PgOpclassRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_opclass</code>
     */
    public static final PgOpclass PG_OPCLASS = new PgOpclass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOpclassRecord> getRecordType() {
        return PgOpclassRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_opclass.oid</code>.
     */
    public final TableField<PgOpclassRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCMETHOD = createField(DSL.name("opcmethod"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public final TableField<PgOpclassRecord, String> OPCNAME = createField(DSL.name("opcname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCNAMESPACE = createField(DSL.name("opcnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCOWNER = createField(DSL.name("opcowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCFAMILY = createField(DSL.name("opcfamily"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCINTYPE = createField(DSL.name("opcintype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public final TableField<PgOpclassRecord, Boolean> OPCDEFAULT = createField(DSL.name("opcdefault"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public final TableField<PgOpclassRecord, Long> OPCKEYTYPE = createField(DSL.name("opckeytype"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgOpclass(Name alias, Table<PgOpclassRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOpclass(Name alias, Table<PgOpclassRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opclass</code> table reference
     */
    public PgOpclass(String alias) {
        this(DSL.name(alias), PG_OPCLASS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opclass</code> table reference
     */
    public PgOpclass(Name alias) {
        this(alias, PG_OPCLASS);
    }

    /**
     * Create a <code>pg_catalog.pg_opclass</code> table reference
     */
    public PgOpclass() {
        this(DSL.name("pg_opclass"), null);
    }

    public <O extends Record> PgOpclass(Table<O> child, ForeignKey<O, PgOpclassRecord> key) {
        super(child, key, PG_OPCLASS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgOpclassRecord> getPrimaryKey() {
        return Keys.PG_OPCLASS_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgOpclassRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_OPCLASS_AM_NAME_NSP_INDEX);
    }

    @Override
    public PgOpclass as(String alias) {
        return new PgOpclass(DSL.name(alias), this);
    }

    @Override
    public PgOpclass as(Name alias) {
        return new PgOpclass(alias, this);
    }

    @Override
    public PgOpclass as(Table<?> alias) {
        return new PgOpclass(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpclass rename(String name) {
        return new PgOpclass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpclass rename(Name name) {
        return new PgOpclass(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpclass rename(Table<?> name) {
        return new PgOpclass(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Long, Long, Long, Long, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
