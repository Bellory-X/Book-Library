/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.jooq.generated.pg_catalog.tables.PgStatDatabase;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatDatabaseRecord extends TableRecordImpl<PgStatDatabaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_database.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.numbackends</code>.
     */
    public void setNumbackends(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.numbackends</code>.
     */
    public Integer getNumbackends() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.xact_commit</code>.
     */
    public void setXactCommit(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.xact_commit</code>.
     */
    public Long getXactCommit() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.xact_rollback</code>.
     */
    public void setXactRollback(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.xact_rollback</code>.
     */
    public Long getXactRollback() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.blks_read</code>.
     */
    public void setBlksRead(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.blks_read</code>.
     */
    public Long getBlksRead() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.blks_hit</code>.
     */
    public void setBlksHit(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.blks_hit</code>.
     */
    public Long getBlksHit() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.tup_returned</code>.
     */
    public void setTupReturned(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.tup_returned</code>.
     */
    public Long getTupReturned() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.tup_fetched</code>.
     */
    public void setTupFetched(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.tup_fetched</code>.
     */
    public Long getTupFetched() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.tup_inserted</code>.
     */
    public void setTupInserted(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.tup_inserted</code>.
     */
    public Long getTupInserted() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.tup_updated</code>.
     */
    public void setTupUpdated(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.tup_updated</code>.
     */
    public Long getTupUpdated() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.tup_deleted</code>.
     */
    public void setTupDeleted(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.tup_deleted</code>.
     */
    public Long getTupDeleted() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.conflicts</code>.
     */
    public void setConflicts(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.conflicts</code>.
     */
    public Long getConflicts() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.temp_files</code>.
     */
    public void setTempFiles(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.temp_files</code>.
     */
    public Long getTempFiles() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.temp_bytes</code>.
     */
    public void setTempBytes(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.temp_bytes</code>.
     */
    public Long getTempBytes() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.deadlocks</code>.
     */
    public void setDeadlocks(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.deadlocks</code>.
     */
    public Long getDeadlocks() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.checksum_failures</code>.
     */
    public void setChecksumFailures(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.checksum_failures</code>.
     */
    public Long getChecksumFailures() {
        return (Long) get(16);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database.checksum_last_failure</code>.
     */
    public void setChecksumLastFailure(OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database.checksum_last_failure</code>.
     */
    public OffsetDateTime getChecksumLastFailure() {
        return (OffsetDateTime) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.blk_read_time</code>.
     */
    public void setBlkReadTime(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.blk_read_time</code>.
     */
    public Double getBlkReadTime() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.blk_write_time</code>.
     */
    public void setBlkWriteTime(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.blk_write_time</code>.
     */
    public Double getBlkWriteTime() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.session_time</code>.
     */
    public void setSessionTime(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.session_time</code>.
     */
    public Double getSessionTime() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.active_time</code>.
     */
    public void setActiveTime(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.active_time</code>.
     */
    public Double getActiveTime() {
        return (Double) get(21);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database.idle_in_transaction_time</code>.
     */
    public void setIdleInTransactionTime(Double value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database.idle_in_transaction_time</code>.
     */
    public Double getIdleInTransactionTime() {
        return (Double) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.sessions</code>.
     */
    public void setSessions(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.sessions</code>.
     */
    public Long getSessions() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.sessions_abandoned</code>.
     */
    public void setSessionsAbandoned(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.sessions_abandoned</code>.
     */
    public Long getSessionsAbandoned() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.sessions_fatal</code>.
     */
    public void setSessionsFatal(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.sessions_fatal</code>.
     */
    public Long getSessionsFatal() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.sessions_killed</code>.
     */
    public void setSessionsKilled(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.sessions_killed</code>.
     */
    public Long getSessionsKilled() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(27);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatDatabaseRecord
     */
    public PgStatDatabaseRecord() {
        super(PgStatDatabase.PG_STAT_DATABASE);
    }

    /**
     * Create a detached, initialised PgStatDatabaseRecord
     */
    public PgStatDatabaseRecord(Long datid, String datname, Integer numbackends, Long xactCommit, Long xactRollback, Long blksRead, Long blksHit, Long tupReturned, Long tupFetched, Long tupInserted, Long tupUpdated, Long tupDeleted, Long conflicts, Long tempFiles, Long tempBytes, Long deadlocks, Long checksumFailures, OffsetDateTime checksumLastFailure, Double blkReadTime, Double blkWriteTime, Double sessionTime, Double activeTime, Double idleInTransactionTime, Long sessions, Long sessionsAbandoned, Long sessionsFatal, Long sessionsKilled, OffsetDateTime statsReset) {
        super(PgStatDatabase.PG_STAT_DATABASE);

        setDatid(datid);
        setDatname(datname);
        setNumbackends(numbackends);
        setXactCommit(xactCommit);
        setXactRollback(xactRollback);
        setBlksRead(blksRead);
        setBlksHit(blksHit);
        setTupReturned(tupReturned);
        setTupFetched(tupFetched);
        setTupInserted(tupInserted);
        setTupUpdated(tupUpdated);
        setTupDeleted(tupDeleted);
        setConflicts(conflicts);
        setTempFiles(tempFiles);
        setTempBytes(tempBytes);
        setDeadlocks(deadlocks);
        setChecksumFailures(checksumFailures);
        setChecksumLastFailure(checksumLastFailure);
        setBlkReadTime(blkReadTime);
        setBlkWriteTime(blkWriteTime);
        setSessionTime(sessionTime);
        setActiveTime(activeTime);
        setIdleInTransactionTime(idleInTransactionTime);
        setSessions(sessions);
        setSessionsAbandoned(sessionsAbandoned);
        setSessionsFatal(sessionsFatal);
        setSessionsKilled(sessionsKilled);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }
}
