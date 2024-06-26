/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.generated.information_schema.tables.RoutineTableUsage;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineTableUsageRecord extends TableRecordImpl<RoutineTableUsageRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.routine_table_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_table_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field4() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.ROUTINE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.ROUTINE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.ROUTINE_NAME;
    }

    @Override
    public Field<String> field7() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field8() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field9() {
        return RoutineTableUsage.ROUTINE_TABLE_USAGE.TABLE_NAME;
    }

    @Override
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    public String component3() {
        return getSpecificName();
    }

    @Override
    public String component4() {
        return getRoutineCatalog();
    }

    @Override
    public String component5() {
        return getRoutineSchema();
    }

    @Override
    public String component6() {
        return getRoutineName();
    }

    @Override
    public String component7() {
        return getTableCatalog();
    }

    @Override
    public String component8() {
        return getTableSchema();
    }

    @Override
    public String component9() {
        return getTableName();
    }

    @Override
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    public String value3() {
        return getSpecificName();
    }

    @Override
    public String value4() {
        return getRoutineCatalog();
    }

    @Override
    public String value5() {
        return getRoutineSchema();
    }

    @Override
    public String value6() {
        return getRoutineName();
    }

    @Override
    public String value7() {
        return getTableCatalog();
    }

    @Override
    public String value8() {
        return getTableSchema();
    }

    @Override
    public String value9() {
        return getTableName();
    }

    @Override
    public RoutineTableUsageRecord value1(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value2(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value3(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value4(String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value5(String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value6(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value7(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value8(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord value9(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public RoutineTableUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutineTableUsageRecord
     */
    public RoutineTableUsageRecord() {
        super(RoutineTableUsage.ROUTINE_TABLE_USAGE);
    }

    /**
     * Create a detached, initialised RoutineTableUsageRecord
     */
    public RoutineTableUsageRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String tableCatalog, String tableSchema, String tableName) {
        super(RoutineTableUsage.ROUTINE_TABLE_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        resetChangedOnNotNull();
    }
}
