/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.generated.pg_catalog.tables.JsonbArrayElements;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbArrayElementsRecord extends TableRecordImpl<JsonbArrayElementsRecord> implements Record1<JSONB> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_array_elements.value</code>.
     */
    public void setValue(JSONB value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_array_elements.value</code>.
     */
    public JSONB getValue() {
        return (JSONB) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<JSONB> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<JSONB> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<JSONB> field1() {
        return JsonbArrayElements.JSONB_ARRAY_ELEMENTS.VALUE;
    }

    @Override
    public JSONB component1() {
        return getValue();
    }

    @Override
    public JSONB value1() {
        return getValue();
    }

    @Override
    public JsonbArrayElementsRecord value1(JSONB value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonbArrayElementsRecord values(JSONB value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbArrayElementsRecord
     */
    public JsonbArrayElementsRecord() {
        super(JsonbArrayElements.JSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create a detached, initialised JsonbArrayElementsRecord
     */
    public JsonbArrayElementsRecord(JSONB value) {
        super(JsonbArrayElements.JSONB_ARRAY_ELEMENTS);

        setValue(value);
        resetChangedOnNotNull();
    }
}
