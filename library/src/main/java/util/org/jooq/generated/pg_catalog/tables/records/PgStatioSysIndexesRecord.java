/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.pg_catalog.tables.PgStatioSysIndexes;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatioSysIndexesRecord extends TableRecordImpl<PgStatioSysIndexesRecord> implements Record7<Long, Long, String, String, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public void setRelname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public String getRelname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public void setIdxBlksRead(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public Long getIdxBlksRead() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public Long getIdxBlksHit() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, String, String, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.RELID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.INDEXRELID;
    }

    @Override
    public Field<String> field3() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.SCHEMANAME;
    }

    @Override
    public Field<String> field4() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.RELNAME;
    }

    @Override
    public Field<String> field5() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.INDEXRELNAME;
    }

    @Override
    public Field<Long> field6() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.IDX_BLKS_READ;
    }

    @Override
    public Field<Long> field7() {
        return PgStatioSysIndexes.PG_STATIO_SYS_INDEXES.IDX_BLKS_HIT;
    }

    @Override
    public Long component1() {
        return getRelid();
    }

    @Override
    public Long component2() {
        return getIndexrelid();
    }

    @Override
    public String component3() {
        return getSchemaname();
    }

    @Override
    public String component4() {
        return getRelname();
    }

    @Override
    public String component5() {
        return getIndexrelname();
    }

    @Override
    public Long component6() {
        return getIdxBlksRead();
    }

    @Override
    public Long component7() {
        return getIdxBlksHit();
    }

    @Override
    public Long value1() {
        return getRelid();
    }

    @Override
    public Long value2() {
        return getIndexrelid();
    }

    @Override
    public String value3() {
        return getSchemaname();
    }

    @Override
    public String value4() {
        return getRelname();
    }

    @Override
    public String value5() {
        return getIndexrelname();
    }

    @Override
    public Long value6() {
        return getIdxBlksRead();
    }

    @Override
    public Long value7() {
        return getIdxBlksHit();
    }

    @Override
    public PgStatioSysIndexesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value2(Long value) {
        setIndexrelid(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value3(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value4(String value) {
        setRelname(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value5(String value) {
        setIndexrelname(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value6(Long value) {
        setIdxBlksRead(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord value7(Long value) {
        setIdxBlksHit(value);
        return this;
    }

    @Override
    public PgStatioSysIndexesRecord values(Long value1, Long value2, String value3, String value4, String value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatioSysIndexesRecord
     */
    public PgStatioSysIndexesRecord() {
        super(PgStatioSysIndexes.PG_STATIO_SYS_INDEXES);
    }

    /**
     * Create a detached, initialised PgStatioSysIndexesRecord
     */
    public PgStatioSysIndexesRecord(Long relid, Long indexrelid, String schemaname, String relname, String indexrelname, Long idxBlksRead, Long idxBlksHit) {
        super(PgStatioSysIndexes.PG_STATIO_SYS_INDEXES);

        setRelid(relid);
        setIndexrelid(indexrelid);
        setSchemaname(schemaname);
        setRelname(relname);
        setIndexrelname(indexrelname);
        setIdxBlksRead(idxBlksRead);
        setIdxBlksHit(idxBlksHit);
        resetChangedOnNotNull();
    }
}
