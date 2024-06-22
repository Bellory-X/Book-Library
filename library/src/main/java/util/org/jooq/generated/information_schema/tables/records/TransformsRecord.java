/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.generated.information_schema.tables.Transforms;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransformsRecord extends TableRecordImpl<TransformsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.transforms.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.transforms.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.transforms.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.transforms.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.transforms.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.transforms.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.transforms.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.transforms.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.transforms.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.transforms.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.transforms.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.transforms.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.transforms.group_name</code>.
     */
    public void setGroupName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.transforms.group_name</code>.
     */
    public String getGroupName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.transforms.transform_type</code>.
     */
    public void setTransformType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.transforms.transform_type</code>.
     */
    public String getTransformType() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Transforms.TRANSFORMS.UDT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Transforms.TRANSFORMS.UDT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Transforms.TRANSFORMS.UDT_NAME;
    }

    @Override
    public Field<String> field4() {
        return Transforms.TRANSFORMS.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return Transforms.TRANSFORMS.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return Transforms.TRANSFORMS.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field7() {
        return Transforms.TRANSFORMS.GROUP_NAME;
    }

    @Override
    public Field<String> field8() {
        return Transforms.TRANSFORMS.TRANSFORM_TYPE;
    }

    @Override
    public String component1() {
        return getUdtCatalog();
    }

    @Override
    public String component2() {
        return getUdtSchema();
    }

    @Override
    public String component3() {
        return getUdtName();
    }

    @Override
    public String component4() {
        return getSpecificCatalog();
    }

    @Override
    public String component5() {
        return getSpecificSchema();
    }

    @Override
    public String component6() {
        return getSpecificName();
    }

    @Override
    public String component7() {
        return getGroupName();
    }

    @Override
    public String component8() {
        return getTransformType();
    }

    @Override
    public String value1() {
        return getUdtCatalog();
    }

    @Override
    public String value2() {
        return getUdtSchema();
    }

    @Override
    public String value3() {
        return getUdtName();
    }

    @Override
    public String value4() {
        return getSpecificCatalog();
    }

    @Override
    public String value5() {
        return getSpecificSchema();
    }

    @Override
    public String value6() {
        return getSpecificName();
    }

    @Override
    public String value7() {
        return getGroupName();
    }

    @Override
    public String value8() {
        return getTransformType();
    }

    @Override
    public TransformsRecord value1(String value) {
        setUdtCatalog(value);
        return this;
    }

    @Override
    public TransformsRecord value2(String value) {
        setUdtSchema(value);
        return this;
    }

    @Override
    public TransformsRecord value3(String value) {
        setUdtName(value);
        return this;
    }

    @Override
    public TransformsRecord value4(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public TransformsRecord value5(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public TransformsRecord value6(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public TransformsRecord value7(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public TransformsRecord value8(String value) {
        setTransformType(value);
        return this;
    }

    @Override
    public TransformsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransformsRecord
     */
    public TransformsRecord() {
        super(Transforms.TRANSFORMS);
    }

    /**
     * Create a detached, initialised TransformsRecord
     */
    public TransformsRecord(String udtCatalog, String udtSchema, String udtName, String specificCatalog, String specificSchema, String specificName, String groupName, String transformType) {
        super(Transforms.TRANSFORMS);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setGroupName(groupName);
        setTransformType(transformType);
        resetChangedOnNotNull();
    }
}
