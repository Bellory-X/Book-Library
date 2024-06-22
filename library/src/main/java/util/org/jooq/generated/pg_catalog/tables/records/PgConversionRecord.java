/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.generated.pg_catalog.tables.PgConversion;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgConversionRecord extends UpdatableRecordImpl<PgConversionRecord> implements Record8<Long, String, Long, Long, Integer, Integer, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_conversion.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public void setConname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conname</code>.
     */
    public String getConname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public void setConnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.connamespace</code>.
     */
    public Long getConnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public void setConowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conowner</code>.
     */
    public Long getConowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public void setConforencoding(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conforencoding</code>.
     */
    public Integer getConforencoding() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public void setContoencoding(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.contoencoding</code>.
     */
    public Integer getContoencoding() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public void setConproc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.conproc</code>.
     */
    public String getConproc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public void setCondefault(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_conversion.condefault</code>.
     */
    public Boolean getCondefault() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, Long, Integer, Integer, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, Long, Long, Integer, Integer, String, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgConversion.PG_CONVERSION.OID;
    }

    @Override
    public Field<String> field2() {
        return PgConversion.PG_CONVERSION.CONNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgConversion.PG_CONVERSION.CONNAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgConversion.PG_CONVERSION.CONOWNER;
    }

    @Override
    public Field<Integer> field5() {
        return PgConversion.PG_CONVERSION.CONFORENCODING;
    }

    @Override
    public Field<Integer> field6() {
        return PgConversion.PG_CONVERSION.CONTOENCODING;
    }

    @Override
    public Field<String> field7() {
        return PgConversion.PG_CONVERSION.CONPROC;
    }

    @Override
    public Field<Boolean> field8() {
        return PgConversion.PG_CONVERSION.CONDEFAULT;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getConname();
    }

    @Override
    public Long component3() {
        return getConnamespace();
    }

    @Override
    public Long component4() {
        return getConowner();
    }

    @Override
    public Integer component5() {
        return getConforencoding();
    }

    @Override
    public Integer component6() {
        return getContoencoding();
    }

    @Override
    public String component7() {
        return getConproc();
    }

    @Override
    public Boolean component8() {
        return getCondefault();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getConname();
    }

    @Override
    public Long value3() {
        return getConnamespace();
    }

    @Override
    public Long value4() {
        return getConowner();
    }

    @Override
    public Integer value5() {
        return getConforencoding();
    }

    @Override
    public Integer value6() {
        return getContoencoding();
    }

    @Override
    public String value7() {
        return getConproc();
    }

    @Override
    public Boolean value8() {
        return getCondefault();
    }

    @Override
    public PgConversionRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgConversionRecord value2(String value) {
        setConname(value);
        return this;
    }

    @Override
    public PgConversionRecord value3(Long value) {
        setConnamespace(value);
        return this;
    }

    @Override
    public PgConversionRecord value4(Long value) {
        setConowner(value);
        return this;
    }

    @Override
    public PgConversionRecord value5(Integer value) {
        setConforencoding(value);
        return this;
    }

    @Override
    public PgConversionRecord value6(Integer value) {
        setContoencoding(value);
        return this;
    }

    @Override
    public PgConversionRecord value7(String value) {
        setConproc(value);
        return this;
    }

    @Override
    public PgConversionRecord value8(Boolean value) {
        setCondefault(value);
        return this;
    }

    @Override
    public PgConversionRecord values(Long value1, String value2, Long value3, Long value4, Integer value5, Integer value6, String value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgConversionRecord
     */
    public PgConversionRecord() {
        super(PgConversion.PG_CONVERSION);
    }

    /**
     * Create a detached, initialised PgConversionRecord
     */
    public PgConversionRecord(Long oid, String conname, Long connamespace, Long conowner, Integer conforencoding, Integer contoencoding, String conproc, Boolean condefault) {
        super(PgConversion.PG_CONVERSION);

        setOid(oid);
        setConname(conname);
        setConnamespace(connamespace);
        setConowner(conowner);
        setConforencoding(conforencoding);
        setContoencoding(contoencoding);
        setConproc(conproc);
        setCondefault(condefault);
        resetChangedOnNotNull();
    }
}
