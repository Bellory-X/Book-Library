/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.information_schema.tables.DataTypePrivileges;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataTypePrivilegesRecord extends TableRecordImpl<DataTypePrivilegesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    public void setObjectCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    public String getObjectCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    public void setObjectType(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    public String getObjectType() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DataTypePrivileges.DATA_TYPE_PRIVILEGES.OBJECT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return DataTypePrivileges.DATA_TYPE_PRIVILEGES.OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return DataTypePrivileges.DATA_TYPE_PRIVILEGES.OBJECT_NAME;
    }

    @Override
    public Field<String> field4() {
        return DataTypePrivileges.DATA_TYPE_PRIVILEGES.OBJECT_TYPE;
    }

    @Override
    public Field<String> field5() {
        return DataTypePrivileges.DATA_TYPE_PRIVILEGES.DTD_IDENTIFIER;
    }

    @Override
    public String component1() {
        return getObjectCatalog();
    }

    @Override
    public String component2() {
        return getObjectSchema();
    }

    @Override
    public String component3() {
        return getObjectName();
    }

    @Override
    public String component4() {
        return getObjectType();
    }

    @Override
    public String component5() {
        return getDtdIdentifier();
    }

    @Override
    public String value1() {
        return getObjectCatalog();
    }

    @Override
    public String value2() {
        return getObjectSchema();
    }

    @Override
    public String value3() {
        return getObjectName();
    }

    @Override
    public String value4() {
        return getObjectType();
    }

    @Override
    public String value5() {
        return getDtdIdentifier();
    }

    @Override
    public DataTypePrivilegesRecord value1(String value) {
        setObjectCatalog(value);
        return this;
    }

    @Override
    public DataTypePrivilegesRecord value2(String value) {
        setObjectSchema(value);
        return this;
    }

    @Override
    public DataTypePrivilegesRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    @Override
    public DataTypePrivilegesRecord value4(String value) {
        setObjectType(value);
        return this;
    }

    @Override
    public DataTypePrivilegesRecord value5(String value) {
        setDtdIdentifier(value);
        return this;
    }

    @Override
    public DataTypePrivilegesRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached DataTypePrivilegesRecord
     */
    public DataTypePrivilegesRecord() {
        super(DataTypePrivileges.DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create a detached, initialised DataTypePrivilegesRecord
     */
    public DataTypePrivilegesRecord(String objectCatalog, String objectSchema, String objectName, String objectType, String dtdIdentifier) {
        super(DataTypePrivileges.DATA_TYPE_PRIVILEGES);

        setObjectCatalog(objectCatalog);
        setObjectSchema(objectSchema);
        setObjectName(objectName);
        setObjectType(objectType);
        setDtdIdentifier(dtdIdentifier);
        resetChangedOnNotNull();
    }
}
