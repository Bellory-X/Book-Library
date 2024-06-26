/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.generated.pg_catalog.tables.PgStatProgressCluster;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressClusterRecord extends TableRecordImpl<PgStatProgressClusterRecord> implements Record12<Integer, Long, String, Long, String, String, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    public void setCommand(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    public void setPhase(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    public String getPhase() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    public void setClusterIndexRelid(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    public Long getClusterIndexRelid() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    public void setHeapTuplesScanned(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    public Long getHeapTuplesScanned() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    public void setHeapTuplesWritten(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    public Long getHeapTuplesWritten() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    public void setHeapBlksTotal(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    public Long getHeapBlksTotal() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    public void setHeapBlksScanned(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    public Long getHeapBlksScanned() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    public void setIndexRebuildCount(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    public Long getIndexRebuildCount() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Long, String, Long, String, String, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, Long, String, Long, String, String, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.PID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.DATID;
    }

    @Override
    public Field<String> field3() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.DATNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.RELID;
    }

    @Override
    public Field<String> field5() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.COMMAND;
    }

    @Override
    public Field<String> field6() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.PHASE;
    }

    @Override
    public Field<Long> field7() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.CLUSTER_INDEX_RELID;
    }

    @Override
    public Field<Long> field8() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.HEAP_TUPLES_SCANNED;
    }

    @Override
    public Field<Long> field9() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.HEAP_TUPLES_WRITTEN;
    }

    @Override
    public Field<Long> field10() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.HEAP_BLKS_TOTAL;
    }

    @Override
    public Field<Long> field11() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.HEAP_BLKS_SCANNED;
    }

    @Override
    public Field<Long> field12() {
        return PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER.INDEX_REBUILD_COUNT;
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
        return getPhase();
    }

    @Override
    public Long component7() {
        return getClusterIndexRelid();
    }

    @Override
    public Long component8() {
        return getHeapTuplesScanned();
    }

    @Override
    public Long component9() {
        return getHeapTuplesWritten();
    }

    @Override
    public Long component10() {
        return getHeapBlksTotal();
    }

    @Override
    public Long component11() {
        return getHeapBlksScanned();
    }

    @Override
    public Long component12() {
        return getIndexRebuildCount();
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
        return getPhase();
    }

    @Override
    public Long value7() {
        return getClusterIndexRelid();
    }

    @Override
    public Long value8() {
        return getHeapTuplesScanned();
    }

    @Override
    public Long value9() {
        return getHeapTuplesWritten();
    }

    @Override
    public Long value10() {
        return getHeapBlksTotal();
    }

    @Override
    public Long value11() {
        return getHeapBlksScanned();
    }

    @Override
    public Long value12() {
        return getIndexRebuildCount();
    }

    @Override
    public PgStatProgressClusterRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value2(Long value) {
        setDatid(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value3(String value) {
        setDatname(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value5(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value6(String value) {
        setPhase(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value7(Long value) {
        setClusterIndexRelid(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value8(Long value) {
        setHeapTuplesScanned(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value9(Long value) {
        setHeapTuplesWritten(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value10(Long value) {
        setHeapBlksTotal(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value11(Long value) {
        setHeapBlksScanned(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord value12(Long value) {
        setIndexRebuildCount(value);
        return this;
    }

    @Override
    public PgStatProgressClusterRecord values(Integer value1, Long value2, String value3, Long value4, String value5, String value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12) {
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
     * Create a detached PgStatProgressClusterRecord
     */
    public PgStatProgressClusterRecord() {
        super(PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER);
    }

    /**
     * Create a detached, initialised PgStatProgressClusterRecord
     */
    public PgStatProgressClusterRecord(Integer pid, Long datid, String datname, Long relid, String command, String phase, Long clusterIndexRelid, Long heapTuplesScanned, Long heapTuplesWritten, Long heapBlksTotal, Long heapBlksScanned, Long indexRebuildCount) {
        super(PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setCommand(command);
        setPhase(phase);
        setClusterIndexRelid(clusterIndexRelid);
        setHeapTuplesScanned(heapTuplesScanned);
        setHeapTuplesWritten(heapTuplesWritten);
        setHeapBlksTotal(heapBlksTotal);
        setHeapBlksScanned(heapBlksScanned);
        setIndexRebuildCount(indexRebuildCount);
        resetChangedOnNotNull();
    }
}
