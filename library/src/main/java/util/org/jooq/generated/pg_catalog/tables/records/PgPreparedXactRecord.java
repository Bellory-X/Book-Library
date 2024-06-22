/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.pg_catalog.tables.PgPreparedXact;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPreparedXactRecord extends TableRecordImpl<PgPreparedXactRecord> implements Record5<Long, String, OffsetDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public void setTransaction(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public Long getTransaction() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public void setGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public String getGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public void setPrepared(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public OffsetDateTime getPrepared() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public void setOwnerid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public Long getOwnerid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public void setDbid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public Long getDbid() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, OffsetDateTime, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, OffsetDateTime, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgPreparedXact.PG_PREPARED_XACT.TRANSACTION;
    }

    @Override
    public Field<String> field2() {
        return PgPreparedXact.PG_PREPARED_XACT.GID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return PgPreparedXact.PG_PREPARED_XACT.PREPARED;
    }

    @Override
    public Field<Long> field4() {
        return PgPreparedXact.PG_PREPARED_XACT.OWNERID;
    }

    @Override
    public Field<Long> field5() {
        return PgPreparedXact.PG_PREPARED_XACT.DBID;
    }

    @Override
    public Long component1() {
        return getTransaction();
    }

    @Override
    public String component2() {
        return getGid();
    }

    @Override
    public OffsetDateTime component3() {
        return getPrepared();
    }

    @Override
    public Long component4() {
        return getOwnerid();
    }

    @Override
    public Long component5() {
        return getDbid();
    }

    @Override
    public Long value1() {
        return getTransaction();
    }

    @Override
    public String value2() {
        return getGid();
    }

    @Override
    public OffsetDateTime value3() {
        return getPrepared();
    }

    @Override
    public Long value4() {
        return getOwnerid();
    }

    @Override
    public Long value5() {
        return getDbid();
    }

    @Override
    public PgPreparedXactRecord value1(Long value) {
        setTransaction(value);
        return this;
    }

    @Override
    public PgPreparedXactRecord value2(String value) {
        setGid(value);
        return this;
    }

    @Override
    public PgPreparedXactRecord value3(OffsetDateTime value) {
        setPrepared(value);
        return this;
    }

    @Override
    public PgPreparedXactRecord value4(Long value) {
        setOwnerid(value);
        return this;
    }

    @Override
    public PgPreparedXactRecord value5(Long value) {
        setDbid(value);
        return this;
    }

    @Override
    public PgPreparedXactRecord values(Long value1, String value2, OffsetDateTime value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPreparedXactRecord
     */
    public PgPreparedXactRecord() {
        super(PgPreparedXact.PG_PREPARED_XACT);
    }

    /**
     * Create a detached, initialised PgPreparedXactRecord
     */
    public PgPreparedXactRecord(Long transaction, String gid, OffsetDateTime prepared, Long ownerid, Long dbid) {
        super(PgPreparedXact.PG_PREPARED_XACT);

        setTransaction(transaction);
        setGid(gid);
        setPrepared(prepared);
        setOwnerid(ownerid);
        setDbid(dbid);
        resetChangedOnNotNull();
    }
}
