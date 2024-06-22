/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.generated.pg_catalog.tables.PgStatProgressAnalyze;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressAnalyzeRecord extends TableRecordImpl<PgStatProgressAnalyzeRecord> implements Record12<Integer, Long, String, Long, String, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_analyze.phase</code>.
     */
    public void setPhase(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_analyze.phase</code>.
     */
    public String getPhase() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_total</code>.
     */
    public void setSampleBlksTotal(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_total</code>.
     */
    public Long getSampleBlksTotal() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_scanned</code>.
     */
    public void setSampleBlksScanned(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_scanned</code>.
     */
    public Long getSampleBlksScanned() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_total</code>.
     */
    public void setExtStatsTotal(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_total</code>.
     */
    public Long getExtStatsTotal() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_computed</code>.
     */
    public void setExtStatsComputed(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_computed</code>.
     */
    public Long getExtStatsComputed() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_total</code>.
     */
    public void setChildTablesTotal(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_total</code>.
     */
    public Long getChildTablesTotal() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_done</code>.
     */
    public void setChildTablesDone(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_done</code>.
     */
    public Long getChildTablesDone() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_analyze.current_child_table_relid</code>.
     */
    public void setCurrentChildTableRelid(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_analyze.current_child_table_relid</code>.
     */
    public Long getCurrentChildTableRelid() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Long, String, Long, String, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, Long, String, Long, String, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.PID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.DATID;
    }

    @Override
    public Field<String> field3() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.DATNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.RELID;
    }

    @Override
    public Field<String> field5() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.PHASE;
    }

    @Override
    public Field<Long> field6() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.SAMPLE_BLKS_TOTAL;
    }

    @Override
    public Field<Long> field7() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.SAMPLE_BLKS_SCANNED;
    }

    @Override
    public Field<Long> field8() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.EXT_STATS_TOTAL;
    }

    @Override
    public Field<Long> field9() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.EXT_STATS_COMPUTED;
    }

    @Override
    public Field<Long> field10() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.CHILD_TABLES_TOTAL;
    }

    @Override
    public Field<Long> field11() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.CHILD_TABLES_DONE;
    }

    @Override
    public Field<Long> field12() {
        return PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE.CURRENT_CHILD_TABLE_RELID;
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
        return getPhase();
    }

    @Override
    public Long component6() {
        return getSampleBlksTotal();
    }

    @Override
    public Long component7() {
        return getSampleBlksScanned();
    }

    @Override
    public Long component8() {
        return getExtStatsTotal();
    }

    @Override
    public Long component9() {
        return getExtStatsComputed();
    }

    @Override
    public Long component10() {
        return getChildTablesTotal();
    }

    @Override
    public Long component11() {
        return getChildTablesDone();
    }

    @Override
    public Long component12() {
        return getCurrentChildTableRelid();
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
        return getPhase();
    }

    @Override
    public Long value6() {
        return getSampleBlksTotal();
    }

    @Override
    public Long value7() {
        return getSampleBlksScanned();
    }

    @Override
    public Long value8() {
        return getExtStatsTotal();
    }

    @Override
    public Long value9() {
        return getExtStatsComputed();
    }

    @Override
    public Long value10() {
        return getChildTablesTotal();
    }

    @Override
    public Long value11() {
        return getChildTablesDone();
    }

    @Override
    public Long value12() {
        return getCurrentChildTableRelid();
    }

    @Override
    public PgStatProgressAnalyzeRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value2(Long value) {
        setDatid(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value3(String value) {
        setDatname(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value5(String value) {
        setPhase(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value6(Long value) {
        setSampleBlksTotal(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value7(Long value) {
        setSampleBlksScanned(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value8(Long value) {
        setExtStatsTotal(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value9(Long value) {
        setExtStatsComputed(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value10(Long value) {
        setChildTablesTotal(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value11(Long value) {
        setChildTablesDone(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord value12(Long value) {
        setCurrentChildTableRelid(value);
        return this;
    }

    @Override
    public PgStatProgressAnalyzeRecord values(Integer value1, Long value2, String value3, Long value4, String value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressAnalyzeRecord
     */
    public PgStatProgressAnalyzeRecord() {
        super(PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE);
    }

    /**
     * Create a detached, initialised PgStatProgressAnalyzeRecord
     */
    public PgStatProgressAnalyzeRecord(Integer pid, Long datid, String datname, Long relid, String phase, Long sampleBlksTotal, Long sampleBlksScanned, Long extStatsTotal, Long extStatsComputed, Long childTablesTotal, Long childTablesDone, Long currentChildTableRelid) {
        super(PgStatProgressAnalyze.PG_STAT_PROGRESS_ANALYZE);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setPhase(phase);
        setSampleBlksTotal(sampleBlksTotal);
        setSampleBlksScanned(sampleBlksScanned);
        setExtStatsTotal(extStatsTotal);
        setExtStatsComputed(extStatsComputed);
        setChildTablesTotal(childTablesTotal);
        setChildTablesDone(childTablesDone);
        setCurrentChildTableRelid(currentChildTableRelid);
        resetChangedOnNotNull();
    }
}
