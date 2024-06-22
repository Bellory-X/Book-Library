/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables;


import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.generated.pg_catalog.tables.records.PgStatWalReceiverRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatWalReceiver extends TableImpl<PgStatWalReceiverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_wal_receiver</code>
     */
    public static final PgStatWalReceiver PG_STAT_WAL_RECEIVER = new PgStatWalReceiver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatWalReceiverRecord> getRecordType() {
        return PgStatWalReceiverRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.pid</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.status</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> RECEIVE_START_LSN = createField(DSL.name("receive_start_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_wal_receiver.receive_start_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVE_START_TLI = createField(DSL.name("receive_start_tli"), SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> WRITTEN_LSN = createField(DSL.name("written_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> FLUSHED_LSN = createField(DSL.name("flushed_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.received_tli</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> RECEIVED_TLI = createField(DSL.name("received_tli"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_send_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_wal_receiver.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatWalReceiverRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.latest_end_time</code>.
     */
    public final TableField<PgStatWalReceiverRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.slot_name</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> SLOT_NAME = createField(DSL.name("slot_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.sender_host</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> SENDER_HOST = createField(DSL.name("sender_host"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.sender_port</code>.
     */
    public final TableField<PgStatWalReceiverRecord, Integer> SENDER_PORT = createField(DSL.name("sender_port"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_wal_receiver.conninfo</code>.
     */
    public final TableField<PgStatWalReceiverRecord, String> CONNINFO = createField(DSL.name("conninfo"), SQLDataType.CLOB, this, "");

    private PgStatWalReceiver(Name alias, Table<PgStatWalReceiverRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatWalReceiver(Name alias, Table<PgStatWalReceiverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_wal_receiver" as  SELECT s.pid,
          s.status,
          s.receive_start_lsn,
          s.receive_start_tli,
          s.written_lsn,
          s.flushed_lsn,
          s.received_tli,
          s.last_msg_send_time,
          s.last_msg_receipt_time,
          s.latest_end_lsn,
          s.latest_end_time,
          s.slot_name,
          s.sender_host,
          s.sender_port,
          s.conninfo
         FROM pg_stat_get_wal_receiver() s(pid, status, receive_start_lsn, receive_start_tli, written_lsn, flushed_lsn, received_tli, last_msg_send_time, last_msg_receipt_time, latest_end_lsn, latest_end_time, slot_name, sender_host, sender_port, conninfo)
        WHERE (s.pid IS NOT NULL);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal_receiver</code> table
     * reference
     */
    public PgStatWalReceiver(String alias) {
        this(DSL.name(alias), PG_STAT_WAL_RECEIVER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_wal_receiver</code> table
     * reference
     */
    public PgStatWalReceiver(Name alias) {
        this(alias, PG_STAT_WAL_RECEIVER);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_wal_receiver</code> table reference
     */
    public PgStatWalReceiver() {
        this(DSL.name("pg_stat_wal_receiver"), null);
    }

    public <O extends Record> PgStatWalReceiver(Table<O> child, ForeignKey<O, PgStatWalReceiverRecord> key) {
        super(child, key, PG_STAT_WAL_RECEIVER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatWalReceiver as(String alias) {
        return new PgStatWalReceiver(DSL.name(alias), this);
    }

    @Override
    public PgStatWalReceiver as(Name alias) {
        return new PgStatWalReceiver(alias, this);
    }

    @Override
    public PgStatWalReceiver as(Table<?> alias) {
        return new PgStatWalReceiver(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWalReceiver rename(String name) {
        return new PgStatWalReceiver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWalReceiver rename(Name name) {
        return new PgStatWalReceiver(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatWalReceiver rename(Table<?> name) {
        return new PgStatWalReceiver(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, Object, Integer, Object, Object, Integer, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime, String, String, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super Integer, ? super String, ? super Object, ? super Integer, ? super Object, ? super Object, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super Integer, ? super String, ? super Object, ? super Integer, ? super Object, ? super Object, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
