/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.generated.pg_catalog.tables.GenerateSubscripts;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSubscriptsRecord extends TableRecordImpl<GenerateSubscriptsRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public void setGenerateSubscripts(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public Integer getGenerateSubscripts() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GenerateSubscripts.GENERATE_SUBSCRIPTS.GENERATE_SUBSCRIPTS_;
    }

    @Override
    public Integer component1() {
        return getGenerateSubscripts();
    }

    @Override
    public Integer value1() {
        return getGenerateSubscripts();
    }

    @Override
    public GenerateSubscriptsRecord value1(Integer value) {
        setGenerateSubscripts(value);
        return this;
    }

    @Override
    public GenerateSubscriptsRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenerateSubscriptsRecord
     */
    public GenerateSubscriptsRecord() {
        super(GenerateSubscripts.GENERATE_SUBSCRIPTS);
    }

    /**
     * Create a detached, initialised GenerateSubscriptsRecord
     */
    public GenerateSubscriptsRecord(Integer generateSubscripts) {
        super(GenerateSubscripts.GENERATE_SUBSCRIPTS);

        setGenerateSubscripts(generateSubscripts);
        resetChangedOnNotNull();
    }
}
