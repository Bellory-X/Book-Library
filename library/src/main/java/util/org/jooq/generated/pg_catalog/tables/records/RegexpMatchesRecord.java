/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.generated.pg_catalog.tables.RegexpMatches;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegexpMatchesRecord extends TableRecordImpl<RegexpMatchesRecord> implements Record1<String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public void setRegexpMatches(String[] value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public String[] getRegexpMatches() {
        return (String[]) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String[]> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String[]> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String[]> field1() {
        return RegexpMatches.REGEXP_MATCHES.REGEXP_MATCHES_;
    }

    @Override
    public String[] component1() {
        return getRegexpMatches();
    }

    @Override
    public String[] value1() {
        return getRegexpMatches();
    }

    @Override
    public RegexpMatchesRecord value1(String[] value) {
        setRegexpMatches(value);
        return this;
    }

    @Override
    public RegexpMatchesRecord values(String[] value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegexpMatchesRecord
     */
    public RegexpMatchesRecord() {
        super(RegexpMatches.REGEXP_MATCHES);
    }

    /**
     * Create a detached, initialised RegexpMatchesRecord
     */
    public RegexpMatchesRecord(String[] regexpMatches) {
        super(RegexpMatches.REGEXP_MATCHES);

        setRegexpMatches(regexpMatches);
        resetChangedOnNotNull();
    }
}
