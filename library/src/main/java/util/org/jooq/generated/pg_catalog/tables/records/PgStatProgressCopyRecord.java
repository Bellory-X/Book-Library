/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.generated.pg_catalog.tables.PgStatProgressCopy;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressCopyRecord extends TableRecordImpl<PgStatProgressCopyRecord> implements Record10<Integer, Long, String, Long, String, String, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.command</code>.
     */
    public void setCommand(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.command</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.bytes_processed</code>.
     */
    public void setBytesProcessed(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.bytes_processed</code>.
     */
    public Long getBytesProcessed() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.bytes_total</code>.
     */
    public void setBytesTotal(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.bytes_total</code>.
     */
    public Long getBytesTotal() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_copy.tuples_processed</code>.
     */
    public void setTuplesProcessed(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_copy.tuples_processed</code>.
     */
    public Long getTuplesProcessed() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.tuples_excluded</code>.
     */
    public void setTuplesExcluded(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.tuples_excluded</code>.
     */
    public Long getTuplesExcluded() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Long, String, Long, String, String, Long, Long, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, Long, String, Long, String, String, Long, Long, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.PID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.DATID;
    }

    @Override
    public Field<String> field3() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.DATNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.RELID;
    }

    @Override
    public Field<String> field5() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.COMMAND;
    }

    @Override
    public Field<String> field6() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.TYPE;
    }

    @Override
    public Field<Long> field7() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.BYTES_PROCESSED;
    }

    @Override
    public Field<Long> field8() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.BYTES_TOTAL;
    }

    @Override
    public Field<Long> field9() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.TUPLES_PROCESSED;
    }

    @Override
    public Field<Long> field10() {
        return PgStatProgressCopy.PG_STAT_PROGRESS_COPY.TUPLES_EXCLUDED;
    }

    @Override
    public Integer component1() {
        return getPid();
    }

    @Override
    public Long component2() {
        return getDatid();
    }

    @Override
    public String component3() {
        return getDatname();
    }

    @Override
    public Long component4() {
        return getRelid();
    }

    @Override
    public String component5() {
        return getCommand();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public Long component7() {
        return getBytesProcessed();
    }

    @Override
    public Long component8() {
        return getBytesTotal();
    }

    @Override
    public Long component9() {
        return getTuplesProcessed();
    }

    @Override
    public Long component10() {
        return getTuplesExcluded();
    }

    @Override
    public Integer value1() {
        return getPid();
    }

    @Override
    public Long value2() {
        return getDatid();
    }

    @Override
    public String value3() {
        return getDatname();
    }

    @Override
    public Long value4() {
        return getRelid();
    }

    @Override
    public String value5() {
        return getCommand();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public Long value7() {
        return getBytesProcessed();
    }

    @Override
    public Long value8() {
        return getBytesTotal();
    }

    @Override
    public Long value9() {
        return getTuplesProcessed();
    }

    @Override
    public Long value10() {
        return getTuplesExcluded();
    }

    @Override
    public PgStatProgressCopyRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value2(Long value) {
        setDatid(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value3(String value) {
        setDatname(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value5(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value7(Long value) {
        setBytesProcessed(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value8(Long value) {
        setBytesTotal(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value9(Long value) {
        setTuplesProcessed(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord value10(Long value) {
        setTuplesExcluded(value);
        return this;
    }

    @Override
    public PgStatProgressCopyRecord values(Integer value1, Long value2, String value3, Long value4, String value5, String value6, Long value7, Long value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressCopyRecord
     */
    public PgStatProgressCopyRecord() {
        super(PgStatProgressCopy.PG_STAT_PROGRESS_COPY);
    }

    /**
     * Create a detached, initialised PgStatProgressCopyRecord
     */
    public PgStatProgressCopyRecord(Integer pid, Long datid, String datname, Long relid, String command, String type, Long bytesProcessed, Long bytesTotal, Long tuplesProcessed, Long tuplesExcluded) {
        super(PgStatProgressCopy.PG_STAT_PROGRESS_COPY);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setCommand(command);
        setType(type);
        setBytesProcessed(bytesProcessed);
        setBytesTotal(bytesTotal);
        setTuplesProcessed(tuplesProcessed);
        setTuplesExcluded(tuplesExcluded);
        resetChangedOnNotNull();
    }
}
