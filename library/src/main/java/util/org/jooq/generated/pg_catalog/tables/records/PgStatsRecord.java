/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.generated.pg_catalog.tables.PgStats;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatsRecord extends TableRecordImpl<PgStatsRecord> implements Record14<String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.attname</code>.
     */
    public void setAttname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.attname</code>.
     */
    public String getAttname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.inherited</code>.
     */
    public void setInherited(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.inherited</code>.
     */
    public Boolean getInherited() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public void setNullFrac(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public Float getNullFrac() {
        return (Float) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public void setAvgWidth(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public Integer getAvgWidth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public void setNDistinct(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public Float getNDistinct() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public void setMostCommonVals(Object[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public Object[] getMostCommonVals() {
        return (Object[]) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public void setMostCommonFreqs(Float[] value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public Float[] getMostCommonFreqs() {
        return (Float[]) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public void setHistogramBounds(Object[] value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public Object[] getHistogramBounds() {
        return (Object[]) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.correlation</code>.
     */
    public void setCorrelation(Float value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.correlation</code>.
     */
    public Float getCorrelation() {
        return (Float) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public void setMostCommonElems(Object[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public Object[] getMostCommonElems() {
        return (Object[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public void setMostCommonElemFreqs(Float[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public Float[] getMostCommonElemFreqs() {
        return (Float[]) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public void setElemCountHistogram(Float[] value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public Float[] getElemCountHistogram() {
        return (Float[]) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgStats.PG_STATS.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgStats.PG_STATS.TABLENAME;
    }

    @Override
    public Field<String> field3() {
        return PgStats.PG_STATS.ATTNAME;
    }

    @Override
    public Field<Boolean> field4() {
        return PgStats.PG_STATS.INHERITED;
    }

    @Override
    public Field<Float> field5() {
        return PgStats.PG_STATS.NULL_FRAC;
    }

    @Override
    public Field<Integer> field6() {
        return PgStats.PG_STATS.AVG_WIDTH;
    }

    @Override
    public Field<Float> field7() {
        return PgStats.PG_STATS.N_DISTINCT;
    }

    @Override
    public Field<Object[]> field8() {
        return PgStats.PG_STATS.MOST_COMMON_VALS;
    }

    @Override
    public Field<Float[]> field9() {
        return PgStats.PG_STATS.MOST_COMMON_FREQS;
    }

    @Override
    public Field<Object[]> field10() {
        return PgStats.PG_STATS.HISTOGRAM_BOUNDS;
    }

    @Override
    public Field<Float> field11() {
        return PgStats.PG_STATS.CORRELATION;
    }

    @Override
    public Field<Object[]> field12() {
        return PgStats.PG_STATS.MOST_COMMON_ELEMS;
    }

    @Override
    public Field<Float[]> field13() {
        return PgStats.PG_STATS.MOST_COMMON_ELEM_FREQS;
    }

    @Override
    public Field<Float[]> field14() {
        return PgStats.PG_STATS.ELEM_COUNT_HISTOGRAM;
    }

    @Override
    public String component1() {
        return getSchemaname();
    }

    @Override
    public String component2() {
        return getTablename();
    }

    @Override
    public String component3() {
        return getAttname();
    }

    @Override
    public Boolean component4() {
        return getInherited();
    }

    @Override
    public Float component5() {
        return getNullFrac();
    }

    @Override
    public Integer component6() {
        return getAvgWidth();
    }

    @Override
    public Float component7() {
        return getNDistinct();
    }

    @Override
    public Object[] component8() {
        return getMostCommonVals();
    }

    @Override
    public Float[] component9() {
        return getMostCommonFreqs();
    }

    @Override
    public Object[] component10() {
        return getHistogramBounds();
    }

    @Override
    public Float component11() {
        return getCorrelation();
    }

    @Override
    public Object[] component12() {
        return getMostCommonElems();
    }

    @Override
    public Float[] component13() {
        return getMostCommonElemFreqs();
    }

    @Override
    public Float[] component14() {
        return getElemCountHistogram();
    }

    @Override
    public String value1() {
        return getSchemaname();
    }

    @Override
    public String value2() {
        return getTablename();
    }

    @Override
    public String value3() {
        return getAttname();
    }

    @Override
    public Boolean value4() {
        return getInherited();
    }

    @Override
    public Float value5() {
        return getNullFrac();
    }

    @Override
    public Integer value6() {
        return getAvgWidth();
    }

    @Override
    public Float value7() {
        return getNDistinct();
    }

    @Override
    public Object[] value8() {
        return getMostCommonVals();
    }

    @Override
    public Float[] value9() {
        return getMostCommonFreqs();
    }

    @Override
    public Object[] value10() {
        return getHistogramBounds();
    }

    @Override
    public Float value11() {
        return getCorrelation();
    }

    @Override
    public Object[] value12() {
        return getMostCommonElems();
    }

    @Override
    public Float[] value13() {
        return getMostCommonElemFreqs();
    }

    @Override
    public Float[] value14() {
        return getElemCountHistogram();
    }

    @Override
    public PgStatsRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgStatsRecord value2(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgStatsRecord value3(String value) {
        setAttname(value);
        return this;
    }

    @Override
    public PgStatsRecord value4(Boolean value) {
        setInherited(value);
        return this;
    }

    @Override
    public PgStatsRecord value5(Float value) {
        setNullFrac(value);
        return this;
    }

    @Override
    public PgStatsRecord value6(Integer value) {
        setAvgWidth(value);
        return this;
    }

    @Override
    public PgStatsRecord value7(Float value) {
        setNDistinct(value);
        return this;
    }

    @Override
    public PgStatsRecord value8(Object[] value) {
        setMostCommonVals(value);
        return this;
    }

    @Override
    public PgStatsRecord value9(Float[] value) {
        setMostCommonFreqs(value);
        return this;
    }

    @Override
    public PgStatsRecord value10(Object[] value) {
        setHistogramBounds(value);
        return this;
    }

    @Override
    public PgStatsRecord value11(Float value) {
        setCorrelation(value);
        return this;
    }

    @Override
    public PgStatsRecord value12(Object[] value) {
        setMostCommonElems(value);
        return this;
    }

    @Override
    public PgStatsRecord value13(Float[] value) {
        setMostCommonElemFreqs(value);
        return this;
    }

    @Override
    public PgStatsRecord value14(Float[] value) {
        setElemCountHistogram(value);
        return this;
    }

    @Override
    public PgStatsRecord values(String value1, String value2, String value3, Boolean value4, Float value5, Integer value6, Float value7, Object[] value8, Float[] value9, Object[] value10, Float value11, Object[] value12, Float[] value13, Float[] value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatsRecord
     */
    public PgStatsRecord() {
        super(PgStats.PG_STATS);
    }

    /**
     * Create a detached, initialised PgStatsRecord
     */
    public PgStatsRecord(String schemaname, String tablename, String attname, Boolean inherited, Float nullFrac, Integer avgWidth, Float nDistinct, Object[] mostCommonVals, Float[] mostCommonFreqs, Object[] histogramBounds, Float correlation, Object[] mostCommonElems, Float[] mostCommonElemFreqs, Float[] elemCountHistogram) {
        super(PgStats.PG_STATS);

        setSchemaname(schemaname);
        setTablename(tablename);
        setAttname(attname);
        setInherited(inherited);
        setNullFrac(nullFrac);
        setAvgWidth(avgWidth);
        setNDistinct(nDistinct);
        setMostCommonVals(mostCommonVals);
        setMostCommonFreqs(mostCommonFreqs);
        setHistogramBounds(histogramBounds);
        setCorrelation(correlation);
        setMostCommonElems(mostCommonElems);
        setMostCommonElemFreqs(mostCommonElemFreqs);
        setElemCountHistogram(elemCountHistogram);
        resetChangedOnNotNull();
    }
}
