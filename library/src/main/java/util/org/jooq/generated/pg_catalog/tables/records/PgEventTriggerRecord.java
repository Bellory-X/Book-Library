/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.pg_catalog.tables.PgEventTrigger;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgEventTriggerRecord extends UpdatableRecordImpl<PgEventTriggerRecord> implements Record7<Long, String, String, Long, Long, String, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public void setEvtname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public String getEvtname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public void setEvtevent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public String getEvtevent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public void setEvtowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public Long getEvtowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public void setEvtfoid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public Long getEvtfoid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public void setEvtenabled(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public String getEvtenabled() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public void setEvttags(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public String[] getEvttags() {
        return (String[]) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, Long, Long, String, String[]> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, Long, Long, String, String[]> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgEventTrigger.PG_EVENT_TRIGGER.OID;
    }

    @Override
    public Field<String> field2() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTNAME;
    }

    @Override
    public Field<String> field3() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTEVENT;
    }

    @Override
    public Field<Long> field4() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTOWNER;
    }

    @Override
    public Field<Long> field5() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTFOID;
    }

    @Override
    public Field<String> field6() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTENABLED;
    }

    @Override
    public Field<String[]> field7() {
        return PgEventTrigger.PG_EVENT_TRIGGER.EVTTAGS;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getEvtname();
    }

    @Override
    public String component3() {
        return getEvtevent();
    }

    @Override
    public Long component4() {
        return getEvtowner();
    }

    @Override
    public Long component5() {
        return getEvtfoid();
    }

    @Override
    public String component6() {
        return getEvtenabled();
    }

    @Override
    public String[] component7() {
        return getEvttags();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getEvtname();
    }

    @Override
    public String value3() {
        return getEvtevent();
    }

    @Override
    public Long value4() {
        return getEvtowner();
    }

    @Override
    public Long value5() {
        return getEvtfoid();
    }

    @Override
    public String value6() {
        return getEvtenabled();
    }

    @Override
    public String[] value7() {
        return getEvttags();
    }

    @Override
    public PgEventTriggerRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value2(String value) {
        setEvtname(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value3(String value) {
        setEvtevent(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value4(Long value) {
        setEvtowner(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value5(Long value) {
        setEvtfoid(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value6(String value) {
        setEvtenabled(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord value7(String[] value) {
        setEvttags(value);
        return this;
    }

    @Override
    public PgEventTriggerRecord values(Long value1, String value2, String value3, Long value4, Long value5, String value6, String[] value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEventTriggerRecord
     */
    public PgEventTriggerRecord() {
        super(PgEventTrigger.PG_EVENT_TRIGGER);
    }

    /**
     * Create a detached, initialised PgEventTriggerRecord
     */
    public PgEventTriggerRecord(Long oid, String evtname, String evtevent, Long evtowner, Long evtfoid, String evtenabled, String[] evttags) {
        super(PgEventTrigger.PG_EVENT_TRIGGER);

        setOid(oid);
        setEvtname(evtname);
        setEvtevent(evtevent);
        setEvtowner(evtowner);
        setEvtfoid(evtfoid);
        setEvtenabled(evtenabled);
        setEvttags(evttags);
        resetChangedOnNotNull();
    }
}
