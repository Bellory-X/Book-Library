/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.generated.pg_catalog.tables.PgShowReplicationOriginStatus;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShowReplicationOriginStatusRecord extends TableRecordImpl<PgShowReplicationOriginStatusRecord> implements Record4<Long, String, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    public void setLocalId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    public Long getLocalId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    public void setExternalId(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(1);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setRemoteLsn(Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getRemoteLsn() {
        return get(2);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setLocalLsn(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getLocalLsn() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, Object, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS.LOCAL_ID;
    }

    @Override
    public Field<String> field2() {
        return PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS.EXTERNAL_ID;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field3() {
        return PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS.REMOTE_LSN;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field4() {
        return PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS.LOCAL_LSN;
    }

    @Override
    public Long component1() {
        return getLocalId();
    }

    @Override
    public String component2() {
        return getExternalId();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component3() {
        return getRemoteLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component4() {
        return getLocalLsn();
    }

    @Override
    public Long value1() {
        return getLocalId();
    }

    @Override
    public String value2() {
        return getExternalId();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value3() {
        return getRemoteLsn();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value4() {
        return getLocalLsn();
    }

    @Override
    public PgShowReplicationOriginStatusRecord value1(Long value) {
        setLocalId(value);
        return this;
    }

    @Override
    public PgShowReplicationOriginStatusRecord value2(String value) {
        setExternalId(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgShowReplicationOriginStatusRecord value3(Object value) {
        setRemoteLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgShowReplicationOriginStatusRecord value4(Object value) {
        setLocalLsn(value);
        return this;
    }

    @Override
    public PgShowReplicationOriginStatusRecord values(Long value1, String value2, Object value3, Object value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShowReplicationOriginStatusRecord
     */
    public PgShowReplicationOriginStatusRecord() {
        super(PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create a detached, initialised PgShowReplicationOriginStatusRecord
     */
    public PgShowReplicationOriginStatusRecord(Long localId, String externalId, Object remoteLsn, Object localLsn) {
        super(PgShowReplicationOriginStatus.PG_SHOW_REPLICATION_ORIGIN_STATUS);

        setLocalId(localId);
        setExternalId(externalId);
        setRemoteLsn(remoteLsn);
        setLocalLsn(localLsn);
        resetChangedOnNotNull();
    }
}
