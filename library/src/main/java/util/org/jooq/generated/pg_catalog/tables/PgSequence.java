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
import org.jooq.generated.pg_catalog.tables.records.PgSequenceRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequence extends TableImpl<PgSequenceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_sequence</code>
     */
    public static final PgSequence PG_SEQUENCE = new PgSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSequenceRecord> getRecordType() {
        return PgSequenceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQRELID = createField(DSL.name("seqrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQTYPID = createField(DSL.name("seqtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQSTART = createField(DSL.name("seqstart"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQINCREMENT = createField(DSL.name("seqincrement"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQMAX = createField(DSL.name("seqmax"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQMIN = createField(DSL.name("seqmin"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQCACHE = createField(DSL.name("seqcache"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public final TableField<PgSequenceRecord, Boolean> SEQCYCLE = createField(DSL.name("seqcycle"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(String alias) {
        this(DSL.name(alias), PG_SEQUENCE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(Name alias) {
        this(alias, PG_SEQUENCE);
    }

    /**
     * Create a <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence() {
        this(DSL.name("pg_sequence"), null);
    }

    public <O extends Record> PgSequence(Table<O> child, ForeignKey<O, PgSequenceRecord> key) {
        super(child, key, PG_SEQUENCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgSequenceRecord> getPrimaryKey() {
        return Keys.PG_SEQUENCE_SEQRELID_INDEX;
    }

    @Override
    public PgSequence as(String alias) {
        return new PgSequence(DSL.name(alias), this);
    }

    @Override
    public PgSequence as(Name alias) {
        return new PgSequence(alias, this);
    }

    @Override
    public PgSequence as(Table<?> alias) {
        return new PgSequence(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(String name) {
        return new PgSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Name name) {
        return new PgSequence(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Table<?> name) {
        return new PgSequence(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, Long, Long, Long, Long, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
