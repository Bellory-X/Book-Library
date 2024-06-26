/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.generated.pg_catalog.tables.Aclexplode;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AclexplodeRecord extends TableRecordImpl<AclexplodeRecord> implements Record4<Long, Long, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.aclexplode.grantor</code>.
     */
    public void setGrantor(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.grantor</code>.
     */
    public Long getGrantor() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.grantee</code>.
     */
    public void setGrantee(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.grantee</code>.
     */
    public Long getGrantee() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public void setIsGrantable(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public Boolean getIsGrantable() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Aclexplode.ACLEXPLODE.GRANTOR;
    }

    @Override
    public Field<Long> field2() {
        return Aclexplode.ACLEXPLODE.GRANTEE;
    }

    @Override
    public Field<String> field3() {
        return Aclexplode.ACLEXPLODE.PRIVILEGE_TYPE;
    }

    @Override
    public Field<Boolean> field4() {
        return Aclexplode.ACLEXPLODE.IS_GRANTABLE;
    }

    @Override
    public Long component1() {
        return getGrantor();
    }

    @Override
    public Long component2() {
        return getGrantee();
    }

    @Override
    public String component3() {
        return getPrivilegeType();
    }

    @Override
    public Boolean component4() {
        return getIsGrantable();
    }

    @Override
    public Long value1() {
        return getGrantor();
    }

    @Override
    public Long value2() {
        return getGrantee();
    }

    @Override
    public String value3() {
        return getPrivilegeType();
    }

    @Override
    public Boolean value4() {
        return getIsGrantable();
    }

    @Override
    public AclexplodeRecord value1(Long value) {
        setGrantor(value);
        return this;
    }

    @Override
    public AclexplodeRecord value2(Long value) {
        setGrantee(value);
        return this;
    }

    @Override
    public AclexplodeRecord value3(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public AclexplodeRecord value4(Boolean value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public AclexplodeRecord values(Long value1, Long value2, String value3, Boolean value4) {
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
     * Create a detached AclexplodeRecord
     */
    public AclexplodeRecord() {
        super(Aclexplode.ACLEXPLODE);
    }

    /**
     * Create a detached, initialised AclexplodeRecord
     */
    public AclexplodeRecord(Long grantor, Long grantee, String privilegeType, Boolean isGrantable) {
        super(Aclexplode.ACLEXPLODE);

        setGrantor(grantor);
        setGrantee(grantee);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }
}
