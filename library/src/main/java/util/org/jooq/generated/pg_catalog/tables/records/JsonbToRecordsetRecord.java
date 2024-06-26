/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.generated.pg_catalog.tables.JsonbToRecordset;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbToRecordsetRecord extends TableRecordImpl<JsonbToRecordsetRecord> implements Record1<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public void setJsonbToRecordset(Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public Record getJsonbToRecordset() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Record> field1() {
        return JsonbToRecordset.JSONB_TO_RECORDSET.JSONB_TO_RECORDSET_;
    }

    @Override
    public Record component1() {
        return getJsonbToRecordset();
    }

    @Override
    public Record value1() {
        return getJsonbToRecordset();
    }

    @Override
    public JsonbToRecordsetRecord value1(Record value) {
        setJsonbToRecordset(value);
        return this;
    }

    @Override
    public JsonbToRecordsetRecord values(Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord() {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);
    }

    /**
     * Create a detached, initialised JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord(Record jsonbToRecordset) {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);

        setJsonbToRecordset(jsonbToRecordset);
        resetChangedOnNotNull();
    }
}
