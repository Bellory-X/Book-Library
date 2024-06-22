/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Record2;
import org.jooq.generated.pg_catalog.tables.PgAttribute;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAttributeRecord extends UpdatableRecordImpl<PgAttributeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public void setAttrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public Long getAttrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public void setAttname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public String getAttname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public void setAtttypid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public Long getAtttypid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public void setAttstattarget(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public Integer getAttstattarget() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public void setAttlen(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public Short getAttlen() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public void setAttnum(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public Short getAttnum() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public void setAttndims(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public Integer getAttndims() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public void setAttcacheoff(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public Integer getAttcacheoff() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public void setAtttypmod(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public Integer getAtttypmod() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public void setAttbyval(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public Boolean getAttbyval() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public void setAttalign(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public String getAttalign() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public void setAttstorage(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public String getAttstorage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcompression</code>.
     */
    public void setAttcompression(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcompression</code>.
     */
    public String getAttcompression() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public void setAttnotnull(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public Boolean getAttnotnull() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public void setAtthasdef(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public Boolean getAtthasdef() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atthasmissing</code>.
     */
    public void setAtthasmissing(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atthasmissing</code>.
     */
    public Boolean getAtthasmissing() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public void setAttidentity(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public String getAttidentity() {
        return (String) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attgenerated</code>.
     */
    public void setAttgenerated(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attgenerated</code>.
     */
    public String getAttgenerated() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public void setAttisdropped(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public Boolean getAttisdropped() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public void setAttislocal(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public Boolean getAttislocal() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public void setAttinhcount(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public Integer getAttinhcount() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public void setAttcollation(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public Long getAttcollation() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public void setAttacl(String[] value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public String[] getAttacl() {
        return (String[]) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public void setAttoptions(String[] value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public String[] getAttoptions() {
        return (String[]) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public void setAttfdwoptions(String[] value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public String[] getAttfdwoptions() {
        return (String[]) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attmissingval</code>.
     */
    public void setAttmissingval(Object[] value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attmissingval</code>.
     */
    public Object[] getAttmissingval() {
        return (Object[]) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAttributeRecord
     */
    public PgAttributeRecord() {
        super(PgAttribute.PG_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised PgAttributeRecord
     */
    public PgAttributeRecord(Long attrelid, String attname, Long atttypid, Integer attstattarget, Short attlen, Short attnum, Integer attndims, Integer attcacheoff, Integer atttypmod, Boolean attbyval, String attalign, String attstorage, String attcompression, Boolean attnotnull, Boolean atthasdef, Boolean atthasmissing, String attidentity, String attgenerated, Boolean attisdropped, Boolean attislocal, Integer attinhcount, Long attcollation, String[] attacl, String[] attoptions, String[] attfdwoptions, Object[] attmissingval) {
        super(PgAttribute.PG_ATTRIBUTE);

        setAttrelid(attrelid);
        setAttname(attname);
        setAtttypid(atttypid);
        setAttstattarget(attstattarget);
        setAttlen(attlen);
        setAttnum(attnum);
        setAttndims(attndims);
        setAttcacheoff(attcacheoff);
        setAtttypmod(atttypmod);
        setAttbyval(attbyval);
        setAttalign(attalign);
        setAttstorage(attstorage);
        setAttcompression(attcompression);
        setAttnotnull(attnotnull);
        setAtthasdef(atthasdef);
        setAtthasmissing(atthasmissing);
        setAttidentity(attidentity);
        setAttgenerated(attgenerated);
        setAttisdropped(attisdropped);
        setAttislocal(attislocal);
        setAttinhcount(attinhcount);
        setAttcollation(attcollation);
        setAttacl(attacl);
        setAttoptions(attoptions);
        setAttfdwoptions(attfdwoptions);
        setAttmissingval(attmissingval);
        resetChangedOnNotNull();
    }
}
