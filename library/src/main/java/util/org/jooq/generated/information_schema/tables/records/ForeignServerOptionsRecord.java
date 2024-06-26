/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.generated.information_schema.tables.ForeignServerOptions;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignServerOptionsRecord extends TableRecordImpl<ForeignServerOptionsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.FOREIGN_SERVER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.FOREIGN_SERVER_NAME;
    }

    @Override
    public Field<String> field3() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.OPTION_NAME;
    }

    @Override
    public Field<String> field4() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.OPTION_VALUE;
    }

    @Override
    public String component1() {
        return getForeignServerCatalog();
    }

    @Override
    public String component2() {
        return getForeignServerName();
    }

    @Override
    public String component3() {
        return getOptionName();
    }

    @Override
    public String component4() {
        return getOptionValue();
    }

    @Override
    public String value1() {
        return getForeignServerCatalog();
    }

    @Override
    public String value2() {
        return getForeignServerName();
    }

    @Override
    public String value3() {
        return getOptionName();
    }

    @Override
    public String value4() {
        return getOptionValue();
    }

    @Override
    public ForeignServerOptionsRecord value1(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    public ForeignServerOptionsRecord value2(String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    public ForeignServerOptionsRecord value3(String value) {
        setOptionName(value);
        return this;
    }

    @Override
    public ForeignServerOptionsRecord value4(String value) {
        setOptionValue(value);
        return this;
    }

    @Override
    public ForeignServerOptionsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignServerOptionsRecord
     */
    public ForeignServerOptionsRecord() {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);
    }

    /**
     * Create a detached, initialised ForeignServerOptionsRecord
     */
    public ForeignServerOptionsRecord(String foreignServerCatalog, String foreignServerName, String optionName, String optionValue) {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);

        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }
}
