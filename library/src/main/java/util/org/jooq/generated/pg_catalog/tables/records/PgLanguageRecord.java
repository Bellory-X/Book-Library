/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.generated.pg_catalog.tables.PgLanguage;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLanguageRecord extends UpdatableRecordImpl<PgLanguageRecord> implements Record9<Long, String, Long, Boolean, Boolean, Long, Long, Long, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_language.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public void setLanname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public String getLanname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public void setLanowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public Long getLanowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public void setLanispl(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public Boolean getLanispl() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public void setLanpltrusted(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public Boolean getLanpltrusted() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public void setLanplcallfoid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public Long getLanplcallfoid() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public void setLaninline(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public Long getLaninline() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public void setLanvalidator(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public Long getLanvalidator() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public void setLanacl(String[] value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public String[] getLanacl() {
        return (String[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, Boolean, Boolean, Long, Long, Long, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, Long, Boolean, Boolean, Long, Long, Long, String[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgLanguage.PG_LANGUAGE.OID;
    }

    @Override
    public Field<String> field2() {
        return PgLanguage.PG_LANGUAGE.LANNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgLanguage.PG_LANGUAGE.LANOWNER;
    }

    @Override
    public Field<Boolean> field4() {
        return PgLanguage.PG_LANGUAGE.LANISPL;
    }

    @Override
    public Field<Boolean> field5() {
        return PgLanguage.PG_LANGUAGE.LANPLTRUSTED;
    }

    @Override
    public Field<Long> field6() {
        return PgLanguage.PG_LANGUAGE.LANPLCALLFOID;
    }

    @Override
    public Field<Long> field7() {
        return PgLanguage.PG_LANGUAGE.LANINLINE;
    }

    @Override
    public Field<Long> field8() {
        return PgLanguage.PG_LANGUAGE.LANVALIDATOR;
    }

    @Override
    public Field<String[]> field9() {
        return PgLanguage.PG_LANGUAGE.LANACL;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getLanname();
    }

    @Override
    public Long component3() {
        return getLanowner();
    }

    @Override
    public Boolean component4() {
        return getLanispl();
    }

    @Override
    public Boolean component5() {
        return getLanpltrusted();
    }

    @Override
    public Long component6() {
        return getLanplcallfoid();
    }

    @Override
    public Long component7() {
        return getLaninline();
    }

    @Override
    public Long component8() {
        return getLanvalidator();
    }

    @Override
    public String[] component9() {
        return getLanacl();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getLanname();
    }

    @Override
    public Long value3() {
        return getLanowner();
    }

    @Override
    public Boolean value4() {
        return getLanispl();
    }

    @Override
    public Boolean value5() {
        return getLanpltrusted();
    }

    @Override
    public Long value6() {
        return getLanplcallfoid();
    }

    @Override
    public Long value7() {
        return getLaninline();
    }

    @Override
    public Long value8() {
        return getLanvalidator();
    }

    @Override
    public String[] value9() {
        return getLanacl();
    }

    @Override
    public PgLanguageRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgLanguageRecord value2(String value) {
        setLanname(value);
        return this;
    }

    @Override
    public PgLanguageRecord value3(Long value) {
        setLanowner(value);
        return this;
    }

    @Override
    public PgLanguageRecord value4(Boolean value) {
        setLanispl(value);
        return this;
    }

    @Override
    public PgLanguageRecord value5(Boolean value) {
        setLanpltrusted(value);
        return this;
    }

    @Override
    public PgLanguageRecord value6(Long value) {
        setLanplcallfoid(value);
        return this;
    }

    @Override
    public PgLanguageRecord value7(Long value) {
        setLaninline(value);
        return this;
    }

    @Override
    public PgLanguageRecord value8(Long value) {
        setLanvalidator(value);
        return this;
    }

    @Override
    public PgLanguageRecord value9(String[] value) {
        setLanacl(value);
        return this;
    }

    @Override
    public PgLanguageRecord values(Long value1, String value2, Long value3, Boolean value4, Boolean value5, Long value6, Long value7, Long value8, String[] value9) {
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
     * Create a detached PgLanguageRecord
     */
    public PgLanguageRecord() {
        super(PgLanguage.PG_LANGUAGE);
    }

    /**
     * Create a detached, initialised PgLanguageRecord
     */
    public PgLanguageRecord(Long oid, String lanname, Long lanowner, Boolean lanispl, Boolean lanpltrusted, Long lanplcallfoid, Long laninline, Long lanvalidator, String[] lanacl) {
        super(PgLanguage.PG_LANGUAGE);

        setOid(oid);
        setLanname(lanname);
        setLanowner(lanowner);
        setLanispl(lanispl);
        setLanpltrusted(lanpltrusted);
        setLanplcallfoid(lanplcallfoid);
        setLaninline(laninline);
        setLanvalidator(lanvalidator);
        setLanacl(lanacl);
        resetChangedOnNotNull();
    }
}
