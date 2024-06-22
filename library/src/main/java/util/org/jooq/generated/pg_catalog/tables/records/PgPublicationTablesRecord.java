/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.pg_catalog.tables.PgPublicationTables;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPublicationTablesRecord extends TableRecordImpl<PgPublicationTablesRecord> implements Record5<String, String, String, String[], String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public void setPubname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public String getPubname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public void setTablename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public String getTablename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.attnames</code>.
     */
    public void setAttnames(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.attnames</code>.
     */
    public String[] getAttnames() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_tables.rowfilter</code>.
     */
    public void setRowfilter(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_tables.rowfilter</code>.
     */
    public String getRowfilter() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String[], String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String[], String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.PUBNAME;
    }

    @Override
    public Field<String> field2() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.SCHEMANAME;
    }

    @Override
    public Field<String> field3() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.TABLENAME;
    }

    @Override
    public Field<String[]> field4() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.ATTNAMES;
    }

    @Override
    public Field<String> field5() {
        return PgPublicationTables.PG_PUBLICATION_TABLES.ROWFILTER;
    }

    @Override
    public String component1() {
        return getPubname();
    }

    @Override
    public String component2() {
        return getSchemaname();
    }

    @Override
    public String component3() {
        return getTablename();
    }

    @Override
    public String[] component4() {
        return getAttnames();
    }

    @Override
    public String component5() {
        return getRowfilter();
    }

    @Override
    public String value1() {
        return getPubname();
    }

    @Override
    public String value2() {
        return getSchemaname();
    }

    @Override
    public String value3() {
        return getTablename();
    }

    @Override
    public String[] value4() {
        return getAttnames();
    }

    @Override
    public String value5() {
        return getRowfilter();
    }

    @Override
    public PgPublicationTablesRecord value1(String value) {
        setPubname(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value3(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value4(String[] value) {
        setAttnames(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord value5(String value) {
        setRowfilter(value);
        return this;
    }

    @Override
    public PgPublicationTablesRecord values(String value1, String value2, String value3, String[] value4, String value5) {
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
     * Create a detached PgPublicationTablesRecord
     */
    public PgPublicationTablesRecord() {
        super(PgPublicationTables.PG_PUBLICATION_TABLES);
    }

    /**
     * Create a detached, initialised PgPublicationTablesRecord
     */
    public PgPublicationTablesRecord(String pubname, String schemaname, String tablename, String[] attnames, String rowfilter) {
        super(PgPublicationTables.PG_PUBLICATION_TABLES);

        setPubname(pubname);
        setSchemaname(schemaname);
        setTablename(tablename);
        setAttnames(attnames);
        setRowfilter(rowfilter);
        resetChangedOnNotNull();
    }
}
