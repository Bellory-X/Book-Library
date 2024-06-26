/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.pg_catalog.tables.PgOpfamily;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOpfamilyRecord extends UpdatableRecordImpl<PgOpfamilyRecord> implements Record5<Long, Long, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public void setOpfmethod(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public Long getOpfmethod() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public void setOpfname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public String getOpfname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public void setOpfnamespace(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public Long getOpfnamespace() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public void setOpfowner(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public Long getOpfowner() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, String, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgOpfamily.PG_OPFAMILY.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgOpfamily.PG_OPFAMILY.OPFMETHOD;
    }

    @Override
    public Field<String> field3() {
        return PgOpfamily.PG_OPFAMILY.OPFNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgOpfamily.PG_OPFAMILY.OPFNAMESPACE;
    }

    @Override
    public Field<Long> field5() {
        return PgOpfamily.PG_OPFAMILY.OPFOWNER;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getOpfmethod();
    }

    @Override
    public String component3() {
        return getOpfname();
    }

    @Override
    public Long component4() {
        return getOpfnamespace();
    }

    @Override
    public Long component5() {
        return getOpfowner();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getOpfmethod();
    }

    @Override
    public String value3() {
        return getOpfname();
    }

    @Override
    public Long value4() {
        return getOpfnamespace();
    }

    @Override
    public Long value5() {
        return getOpfowner();
    }

    @Override
    public PgOpfamilyRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgOpfamilyRecord value2(Long value) {
        setOpfmethod(value);
        return this;
    }

    @Override
    public PgOpfamilyRecord value3(String value) {
        setOpfname(value);
        return this;
    }

    @Override
    public PgOpfamilyRecord value4(Long value) {
        setOpfnamespace(value);
        return this;
    }

    @Override
    public PgOpfamilyRecord value5(Long value) {
        setOpfowner(value);
        return this;
    }

    @Override
    public PgOpfamilyRecord values(Long value1, Long value2, String value3, Long value4, Long value5) {
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
     * Create a detached PgOpfamilyRecord
     */
    public PgOpfamilyRecord() {
        super(PgOpfamily.PG_OPFAMILY);
    }

    /**
     * Create a detached, initialised PgOpfamilyRecord
     */
    public PgOpfamilyRecord(Long oid, Long opfmethod, String opfname, Long opfnamespace, Long opfowner) {
        super(PgOpfamily.PG_OPFAMILY);

        setOid(oid);
        setOpfmethod(opfmethod);
        setOpfname(opfname);
        setOpfnamespace(opfnamespace);
        setOpfowner(opfowner);
        resetChangedOnNotNull();
    }
}
