/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.pg_catalog.tables.PgStatSubscriptionStats;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSubscriptionStatsRecord extends TableRecordImpl<PgStatSubscriptionStatsRecord> implements Record5<Long, String, Long, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription_stats.subid</code>.
     */
    public void setSubid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription_stats.subid</code>.
     */
    public Long getSubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_subscription_stats.subname</code>.
     */
    public void setSubname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_subscription_stats.subname</code>.
     */
    public String getSubname() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_subscription_stats.apply_error_count</code>.
     */
    public void setApplyErrorCount(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_subscription_stats.apply_error_count</code>.
     */
    public Long getApplyErrorCount() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_subscription_stats.sync_error_count</code>.
     */
    public void setSyncErrorCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_subscription_stats.sync_error_count</code>.
     */
    public Long getSyncErrorCount() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_subscription_stats.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_subscription_stats.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, Long, Long, OffsetDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS.SUBID;
    }

    @Override
    public Field<String> field2() {
        return PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS.SUBNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS.APPLY_ERROR_COUNT;
    }

    @Override
    public Field<Long> field4() {
        return PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS.SYNC_ERROR_COUNT;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS.STATS_RESET;
    }

    @Override
    public Long component1() {
        return getSubid();
    }

    @Override
    public String component2() {
        return getSubname();
    }

    @Override
    public Long component3() {
        return getApplyErrorCount();
    }

    @Override
    public Long component4() {
        return getSyncErrorCount();
    }

    @Override
    public OffsetDateTime component5() {
        return getStatsReset();
    }

    @Override
    public Long value1() {
        return getSubid();
    }

    @Override
    public String value2() {
        return getSubname();
    }

    @Override
    public Long value3() {
        return getApplyErrorCount();
    }

    @Override
    public Long value4() {
        return getSyncErrorCount();
    }

    @Override
    public OffsetDateTime value5() {
        return getStatsReset();
    }

    @Override
    public PgStatSubscriptionStatsRecord value1(Long value) {
        setSubid(value);
        return this;
    }

    @Override
    public PgStatSubscriptionStatsRecord value2(String value) {
        setSubname(value);
        return this;
    }

    @Override
    public PgStatSubscriptionStatsRecord value3(Long value) {
        setApplyErrorCount(value);
        return this;
    }

    @Override
    public PgStatSubscriptionStatsRecord value4(Long value) {
        setSyncErrorCount(value);
        return this;
    }

    @Override
    public PgStatSubscriptionStatsRecord value5(OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    public PgStatSubscriptionStatsRecord values(Long value1, String value2, Long value3, Long value4, OffsetDateTime value5) {
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
     * Create a detached PgStatSubscriptionStatsRecord
     */
    public PgStatSubscriptionStatsRecord() {
        super(PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS);
    }

    /**
     * Create a detached, initialised PgStatSubscriptionStatsRecord
     */
    public PgStatSubscriptionStatsRecord(Long subid, String subname, Long applyErrorCount, Long syncErrorCount, OffsetDateTime statsReset) {
        super(PgStatSubscriptionStats.PG_STAT_SUBSCRIPTION_STATS);

        setSubid(subid);
        setSubname(subname);
        setApplyErrorCount(applyErrorCount);
        setSyncErrorCount(syncErrorCount);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }
}
