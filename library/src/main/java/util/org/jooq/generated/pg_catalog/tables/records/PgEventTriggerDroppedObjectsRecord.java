/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.generated.pg_catalog.tables.PgEventTriggerDroppedObjects;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgEventTriggerDroppedObjectsRecord extends TableRecordImpl<PgEventTriggerDroppedObjectsRecord> implements Record12<Long, Long, Integer, Boolean, Boolean, Boolean, String, String, String, String, String[], String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.classid</code>.
     */
    public void setClassid(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objid</code>.
     */
    public void setObjid(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.original</code>.
     */
    public void setOriginal(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.original</code>.
     */
    public Boolean getOriginal() {
        return (Boolean) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.normal</code>.
     */
    public void setNormal(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.normal</code>.
     */
    public Boolean getNormal() {
        return (Boolean) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.is_temporary</code>.
     */
    public void setIsTemporary(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.is_temporary</code>.
     */
    public Boolean getIsTemporary() {
        return (Boolean) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_type</code>.
     */
    public void setObjectType(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_type</code>.
     */
    public String getObjectType() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.schema_name</code>.
     */
    public void setSchemaName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_name</code>.
     */
    public void setObjectName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_identity</code>.
     */
    public void setObjectIdentity(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.object_identity</code>.
     */
    public String getObjectIdentity() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_names</code>.
     */
    public void setAddressNames(String[] value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_names</code>.
     */
    public String[] getAddressNames() {
        return (String[]) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_args</code>.
     */
    public void setAddressArgs(String[] value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_dropped_objects.address_args</code>.
     */
    public String[] getAddressArgs() {
        return (String[]) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Integer, Boolean, Boolean, Boolean, String, String, String, String, String[], String[]> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, Integer, Boolean, Boolean, Boolean, String, String, String, String, String[], String[]> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.CLASSID;
    }

    @Override
    public Field<Long> field2() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.OBJID;
    }

    @Override
    public Field<Integer> field3() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.OBJSUBID;
    }

    @Override
    public Field<Boolean> field4() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.ORIGINAL;
    }

    @Override
    public Field<Boolean> field5() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.NORMAL;
    }

    @Override
    public Field<Boolean> field6() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.IS_TEMPORARY;
    }

    @Override
    public Field<String> field7() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.OBJECT_TYPE;
    }

    @Override
    public Field<String> field8() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.SCHEMA_NAME;
    }

    @Override
    public Field<String> field9() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.OBJECT_NAME;
    }

    @Override
    public Field<String> field10() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.OBJECT_IDENTITY;
    }

    @Override
    public Field<String[]> field11() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.ADDRESS_NAMES;
    }

    @Override
    public Field<String[]> field12() {
        return PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS.ADDRESS_ARGS;
    }

    @Override
    public Long component1() {
        return getClassid();
    }

    @Override
    public Long component2() {
        return getObjid();
    }

    @Override
    public Integer component3() {
        return getObjsubid();
    }

    @Override
    public Boolean component4() {
        return getOriginal();
    }

    @Override
    public Boolean component5() {
        return getNormal();
    }

    @Override
    public Boolean component6() {
        return getIsTemporary();
    }

    @Override
    public String component7() {
        return getObjectType();
    }

    @Override
    public String component8() {
        return getSchemaName();
    }

    @Override
    public String component9() {
        return getObjectName();
    }

    @Override
    public String component10() {
        return getObjectIdentity();
    }

    @Override
    public String[] component11() {
        return getAddressNames();
    }

    @Override
    public String[] component12() {
        return getAddressArgs();
    }

    @Override
    public Long value1() {
        return getClassid();
    }

    @Override
    public Long value2() {
        return getObjid();
    }

    @Override
    public Integer value3() {
        return getObjsubid();
    }

    @Override
    public Boolean value4() {
        return getOriginal();
    }

    @Override
    public Boolean value5() {
        return getNormal();
    }

    @Override
    public Boolean value6() {
        return getIsTemporary();
    }

    @Override
    public String value7() {
        return getObjectType();
    }

    @Override
    public String value8() {
        return getSchemaName();
    }

    @Override
    public String value9() {
        return getObjectName();
    }

    @Override
    public String value10() {
        return getObjectIdentity();
    }

    @Override
    public String[] value11() {
        return getAddressNames();
    }

    @Override
    public String[] value12() {
        return getAddressArgs();
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value1(Long value) {
        setClassid(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value2(Long value) {
        setObjid(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value3(Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value4(Boolean value) {
        setOriginal(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value5(Boolean value) {
        setNormal(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value6(Boolean value) {
        setIsTemporary(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value7(String value) {
        setObjectType(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value8(String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value9(String value) {
        setObjectName(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value10(String value) {
        setObjectIdentity(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value11(String[] value) {
        setAddressNames(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord value12(String[] value) {
        setAddressArgs(value);
        return this;
    }

    @Override
    public PgEventTriggerDroppedObjectsRecord values(Long value1, Long value2, Integer value3, Boolean value4, Boolean value5, Boolean value6, String value7, String value8, String value9, String value10, String[] value11, String[] value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEventTriggerDroppedObjectsRecord
     */
    public PgEventTriggerDroppedObjectsRecord() {
        super(PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    /**
     * Create a detached, initialised PgEventTriggerDroppedObjectsRecord
     */
    public PgEventTriggerDroppedObjectsRecord(Long classid, Long objid, Integer objsubid, Boolean original, Boolean normal, Boolean isTemporary, String objectType, String schemaName, String objectName, String objectIdentity, String[] addressNames, String[] addressArgs) {
        super(PgEventTriggerDroppedObjects.PG_EVENT_TRIGGER_DROPPED_OBJECTS);

        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setOriginal(original);
        setNormal(normal);
        setIsTemporary(isTemporary);
        setObjectType(objectType);
        setSchemaName(schemaName);
        setObjectName(objectName);
        setObjectIdentity(objectIdentity);
        setAddressNames(addressNames);
        setAddressArgs(addressArgs);
        resetChangedOnNotNull();
    }
}
