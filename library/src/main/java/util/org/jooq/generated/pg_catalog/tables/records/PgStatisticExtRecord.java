/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.generated.pg_catalog.tables.PgStatisticExt;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatisticExtRecord extends UpdatableRecordImpl<PgStatisticExtRecord> implements Record9<Long, Long, String, Long, Long, Integer, Object[], String[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    public void setStxrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxrelid</code>.
     */
    public Long getStxrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    public void setStxname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxname</code>.
     */
    public String getStxname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    public void setStxnamespace(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxnamespace</code>.
     */
    public Long getStxnamespace() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    public void setStxowner(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxowner</code>.
     */
    public Long getStxowner() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxstattarget</code>.
     */
    public void setStxstattarget(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxstattarget</code>.
     */
    public Integer getStxstattarget() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    public void setStxkeys(Object[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxkeys</code>.
     */
    public Object[] getStxkeys() {
        return (Object[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    public void setStxkind(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext.stxkind</code>.
     */
    public String[] getStxkind() {
        return (String[]) get(7);
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
    public void setStxexprs(Object value) {
        set(8, value);
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
    public Object getStxexprs() {
        return get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Long, Long, Integer, Object[], String[], Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, String, Long, Long, Integer, Object[], String[], Object> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatisticExt.PG_STATISTIC_EXT.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXRELID;
    }

    @Override
    public Field<String> field3() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXNAMESPACE;
    }

    @Override
    public Field<Long> field5() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXOWNER;
    }

    @Override
    public Field<Integer> field6() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXSTATTARGET;
    }

    @Override
    public Field<Object[]> field7() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXKEYS;
    }

    @Override
    public Field<String[]> field8() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXKIND;
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
    public Field<Object> field9() {
        return PgStatisticExt.PG_STATISTIC_EXT.STXEXPRS;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getStxrelid();
    }

    @Override
    public String component3() {
        return getStxname();
    }

    @Override
    public Long component4() {
        return getStxnamespace();
    }

    @Override
    public Long component5() {
        return getStxowner();
    }

    @Override
    public Integer component6() {
        return getStxstattarget();
    }

    @Override
    public Object[] component7() {
        return getStxkeys();
    }

    @Override
    public String[] component8() {
        return getStxkind();
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
    public Object component9() {
        return getStxexprs();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getStxrelid();
    }

    @Override
    public String value3() {
        return getStxname();
    }

    @Override
    public Long value4() {
        return getStxnamespace();
    }

    @Override
    public Long value5() {
        return getStxowner();
    }

    @Override
    public Integer value6() {
        return getStxstattarget();
    }

    @Override
    public Object[] value7() {
        return getStxkeys();
    }

    @Override
    public String[] value8() {
        return getStxkind();
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
    public Object value9() {
        return getStxexprs();
    }

    @Override
    public PgStatisticExtRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value2(Long value) {
        setStxrelid(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value3(String value) {
        setStxname(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value4(Long value) {
        setStxnamespace(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value5(Long value) {
        setStxowner(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value6(Integer value) {
        setStxstattarget(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value7(Object[] value) {
        setStxkeys(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord value8(String[] value) {
        setStxkind(value);
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
    public PgStatisticExtRecord value9(Object value) {
        setStxexprs(value);
        return this;
    }

    @Override
    public PgStatisticExtRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Integer value6, Object[] value7, String[] value8, Object value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatisticExtRecord
     */
    public PgStatisticExtRecord() {
        super(PgStatisticExt.PG_STATISTIC_EXT);
    }

    /**
     * Create a detached, initialised PgStatisticExtRecord
     */
    public PgStatisticExtRecord(Long oid, Long stxrelid, String stxname, Long stxnamespace, Long stxowner, Integer stxstattarget, Object[] stxkeys, String[] stxkind, Object stxexprs) {
        super(PgStatisticExt.PG_STATISTIC_EXT);

        setOid(oid);
        setStxrelid(stxrelid);
        setStxname(stxname);
        setStxnamespace(stxnamespace);
        setStxowner(stxowner);
        setStxstattarget(stxstattarget);
        setStxkeys(stxkeys);
        setStxkind(stxkind);
        setStxexprs(stxexprs);
        resetChangedOnNotNull();
    }
}
