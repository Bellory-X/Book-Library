/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.generated.pg_catalog.tables.PgRoles;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgRolesRecord extends TableRecordImpl<PgRolesRecord> implements Record13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime, Boolean, String[], Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_roles.rolname</code>.
     */
    public void setRolname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolname</code>.
     */
    public String getRolname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public void setRolsuper(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolsuper</code>.
     */
    public Boolean getRolsuper() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public void setRolinherit(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolinherit</code>.
     */
    public Boolean getRolinherit() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public void setRolcreaterole(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcreaterole</code>.
     */
    public Boolean getRolcreaterole() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public void setRolcreatedb(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcreatedb</code>.
     */
    public Boolean getRolcreatedb() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public void setRolcanlogin(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolcanlogin</code>.
     */
    public Boolean getRolcanlogin() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public void setRolreplication(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolreplication</code>.
     */
    public Boolean getRolreplication() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public void setRolconnlimit(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolconnlimit</code>.
     */
    public Integer getRolconnlimit() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public void setRolpassword(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolpassword</code>.
     */
    public String getRolpassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolvaliduntil</code>.
     */
    public OffsetDateTime getRolvaliduntil() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public void setRolbypassrls(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolbypassrls</code>.
     */
    public Boolean getRolbypassrls() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public void setRolconfig(String[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.rolconfig</code>.
     */
    public String[] getRolconfig() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_roles.oid</code>.
     */
    public void setOid(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_roles.oid</code>.
     */
    public Long getOid() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime, Boolean, String[], Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, String, OffsetDateTime, Boolean, String[], Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgRoles.PG_ROLES.ROLNAME;
    }

    @Override
    public Field<Boolean> field2() {
        return PgRoles.PG_ROLES.ROLSUPER;
    }

    @Override
    public Field<Boolean> field3() {
        return PgRoles.PG_ROLES.ROLINHERIT;
    }

    @Override
    public Field<Boolean> field4() {
        return PgRoles.PG_ROLES.ROLCREATEROLE;
    }

    @Override
    public Field<Boolean> field5() {
        return PgRoles.PG_ROLES.ROLCREATEDB;
    }

    @Override
    public Field<Boolean> field6() {
        return PgRoles.PG_ROLES.ROLCANLOGIN;
    }

    @Override
    public Field<Boolean> field7() {
        return PgRoles.PG_ROLES.ROLREPLICATION;
    }

    @Override
    public Field<Integer> field8() {
        return PgRoles.PG_ROLES.ROLCONNLIMIT;
    }

    @Override
    public Field<String> field9() {
        return PgRoles.PG_ROLES.ROLPASSWORD;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return PgRoles.PG_ROLES.ROLVALIDUNTIL;
    }

    @Override
    public Field<Boolean> field11() {
        return PgRoles.PG_ROLES.ROLBYPASSRLS;
    }

    @Override
    public Field<String[]> field12() {
        return PgRoles.PG_ROLES.ROLCONFIG;
    }

    @Override
    public Field<Long> field13() {
        return PgRoles.PG_ROLES.OID;
    }

    @Override
    public String component1() {
        return getRolname();
    }

    @Override
    public Boolean component2() {
        return getRolsuper();
    }

    @Override
    public Boolean component3() {
        return getRolinherit();
    }

    @Override
    public Boolean component4() {
        return getRolcreaterole();
    }

    @Override
    public Boolean component5() {
        return getRolcreatedb();
    }

    @Override
    public Boolean component6() {
        return getRolcanlogin();
    }

    @Override
    public Boolean component7() {
        return getRolreplication();
    }

    @Override
    public Integer component8() {
        return getRolconnlimit();
    }

    @Override
    public String component9() {
        return getRolpassword();
    }

    @Override
    public OffsetDateTime component10() {
        return getRolvaliduntil();
    }

    @Override
    public Boolean component11() {
        return getRolbypassrls();
    }

    @Override
    public String[] component12() {
        return getRolconfig();
    }

    @Override
    public Long component13() {
        return getOid();
    }

    @Override
    public String value1() {
        return getRolname();
    }

    @Override
    public Boolean value2() {
        return getRolsuper();
    }

    @Override
    public Boolean value3() {
        return getRolinherit();
    }

    @Override
    public Boolean value4() {
        return getRolcreaterole();
    }

    @Override
    public Boolean value5() {
        return getRolcreatedb();
    }

    @Override
    public Boolean value6() {
        return getRolcanlogin();
    }

    @Override
    public Boolean value7() {
        return getRolreplication();
    }

    @Override
    public Integer value8() {
        return getRolconnlimit();
    }

    @Override
    public String value9() {
        return getRolpassword();
    }

    @Override
    public OffsetDateTime value10() {
        return getRolvaliduntil();
    }

    @Override
    public Boolean value11() {
        return getRolbypassrls();
    }

    @Override
    public String[] value12() {
        return getRolconfig();
    }

    @Override
    public Long value13() {
        return getOid();
    }

    @Override
    public PgRolesRecord value1(String value) {
        setRolname(value);
        return this;
    }

    @Override
    public PgRolesRecord value2(Boolean value) {
        setRolsuper(value);
        return this;
    }

    @Override
    public PgRolesRecord value3(Boolean value) {
        setRolinherit(value);
        return this;
    }

    @Override
    public PgRolesRecord value4(Boolean value) {
        setRolcreaterole(value);
        return this;
    }

    @Override
    public PgRolesRecord value5(Boolean value) {
        setRolcreatedb(value);
        return this;
    }

    @Override
    public PgRolesRecord value6(Boolean value) {
        setRolcanlogin(value);
        return this;
    }

    @Override
    public PgRolesRecord value7(Boolean value) {
        setRolreplication(value);
        return this;
    }

    @Override
    public PgRolesRecord value8(Integer value) {
        setRolconnlimit(value);
        return this;
    }

    @Override
    public PgRolesRecord value9(String value) {
        setRolpassword(value);
        return this;
    }

    @Override
    public PgRolesRecord value10(OffsetDateTime value) {
        setRolvaliduntil(value);
        return this;
    }

    @Override
    public PgRolesRecord value11(Boolean value) {
        setRolbypassrls(value);
        return this;
    }

    @Override
    public PgRolesRecord value12(String[] value) {
        setRolconfig(value);
        return this;
    }

    @Override
    public PgRolesRecord value13(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgRolesRecord values(String value1, Boolean value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7, Integer value8, String value9, OffsetDateTime value10, Boolean value11, String[] value12, Long value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgRolesRecord
     */
    public PgRolesRecord() {
        super(PgRoles.PG_ROLES);
    }

    /**
     * Create a detached, initialised PgRolesRecord
     */
    public PgRolesRecord(String rolname, Boolean rolsuper, Boolean rolinherit, Boolean rolcreaterole, Boolean rolcreatedb, Boolean rolcanlogin, Boolean rolreplication, Integer rolconnlimit, String rolpassword, OffsetDateTime rolvaliduntil, Boolean rolbypassrls, String[] rolconfig, Long oid) {
        super(PgRoles.PG_ROLES);

        setRolname(rolname);
        setRolsuper(rolsuper);
        setRolinherit(rolinherit);
        setRolcreaterole(rolcreaterole);
        setRolcreatedb(rolcreatedb);
        setRolcanlogin(rolcanlogin);
        setRolreplication(rolreplication);
        setRolconnlimit(rolconnlimit);
        setRolpassword(rolpassword);
        setRolvaliduntil(rolvaliduntil);
        setRolbypassrls(rolbypassrls);
        setRolconfig(rolconfig);
        setOid(oid);
        resetChangedOnNotNull();
    }
}
