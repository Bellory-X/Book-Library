/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.generated.pg_catalog.tables.PgCursors;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCursorsRecord extends TableRecordImpl<PgCursorsRecord> implements Record6<String, String, Boolean, Boolean, Boolean, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public void setIsHoldable(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public Boolean getIsHoldable() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public void setIsBinary(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public Boolean getIsBinary() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public void setIsScrollable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public Boolean getIsScrollable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public void setCreationTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public OffsetDateTime getCreationTime() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, Boolean, Boolean, Boolean, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, Boolean, Boolean, Boolean, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgCursors.PG_CURSORS.NAME;
    }

    @Override
    public Field<String> field2() {
        return PgCursors.PG_CURSORS.STATEMENT;
    }

    @Override
    public Field<Boolean> field3() {
        return PgCursors.PG_CURSORS.IS_HOLDABLE;
    }

    @Override
    public Field<Boolean> field4() {
        return PgCursors.PG_CURSORS.IS_BINARY;
    }

    @Override
    public Field<Boolean> field5() {
        return PgCursors.PG_CURSORS.IS_SCROLLABLE;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return PgCursors.PG_CURSORS.CREATION_TIME;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getStatement();
    }

    @Override
    public Boolean component3() {
        return getIsHoldable();
    }

    @Override
    public Boolean component4() {
        return getIsBinary();
    }

    @Override
    public Boolean component5() {
        return getIsScrollable();
    }

    @Override
    public OffsetDateTime component6() {
        return getCreationTime();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getStatement();
    }

    @Override
    public Boolean value3() {
        return getIsHoldable();
    }

    @Override
    public Boolean value4() {
        return getIsBinary();
    }

    @Override
    public Boolean value5() {
        return getIsScrollable();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreationTime();
    }

    @Override
    public PgCursorsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgCursorsRecord value2(String value) {
        setStatement(value);
        return this;
    }

    @Override
    public PgCursorsRecord value3(Boolean value) {
        setIsHoldable(value);
        return this;
    }

    @Override
    public PgCursorsRecord value4(Boolean value) {
        setIsBinary(value);
        return this;
    }

    @Override
    public PgCursorsRecord value5(Boolean value) {
        setIsScrollable(value);
        return this;
    }

    @Override
    public PgCursorsRecord value6(OffsetDateTime value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public PgCursorsRecord values(String value1, String value2, Boolean value3, Boolean value4, Boolean value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCursorsRecord
     */
    public PgCursorsRecord() {
        super(PgCursors.PG_CURSORS);
    }

    /**
     * Create a detached, initialised PgCursorsRecord
     */
    public PgCursorsRecord(String name, String statement, Boolean isHoldable, Boolean isBinary, Boolean isScrollable, OffsetDateTime creationTime) {
        super(PgCursors.PG_CURSORS);

        setName(name);
        setStatement(statement);
        setIsHoldable(isHoldable);
        setIsBinary(isBinary);
        setIsScrollable(isScrollable);
        setCreationTime(creationTime);
        resetChangedOnNotNull();
    }
}
