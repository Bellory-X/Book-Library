/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.information_schema.tables.ForeignServers;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignServersRecord extends TableRecordImpl<ForeignServersRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    public void setForeignServerType(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    public String getForeignServerType() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    public void setForeignServerVersion(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    public String getForeignServerVersion() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_NAME;
    }

    @Override
    public Field<String> field3() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    public Field<String> field4() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    public Field<String> field5() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_TYPE;
    }

    @Override
    public Field<String> field6() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_VERSION;
    }

    @Override
    public Field<String> field7() {
        return ForeignServers.FOREIGN_SERVERS.AUTHORIZATION_IDENTIFIER;
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
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String component4() {
        return getForeignDataWrapperName();
    }

    @Override
    public String component5() {
        return getForeignServerType();
    }

    @Override
    public String component6() {
        return getForeignServerVersion();
    }

    @Override
    public String component7() {
        return getAuthorizationIdentifier();
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
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String value4() {
        return getForeignDataWrapperName();
    }

    @Override
    public String value5() {
        return getForeignServerType();
    }

    @Override
    public String value6() {
        return getForeignServerVersion();
    }

    @Override
    public String value7() {
        return getAuthorizationIdentifier();
    }

    @Override
    public ForeignServersRecord value1(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    public ForeignServersRecord value2(String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    public ForeignServersRecord value3(String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    public ForeignServersRecord value4(String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    public ForeignServersRecord value5(String value) {
        setForeignServerType(value);
        return this;
    }

    @Override
    public ForeignServersRecord value6(String value) {
        setForeignServerVersion(value);
        return this;
    }

    @Override
    public ForeignServersRecord value7(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    public ForeignServersRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached ForeignServersRecord
     */
    public ForeignServersRecord() {
        super(ForeignServers.FOREIGN_SERVERS);
    }

    /**
     * Create a detached, initialised ForeignServersRecord
     */
    public ForeignServersRecord(String foreignServerCatalog, String foreignServerName, String foreignDataWrapperCatalog, String foreignDataWrapperName, String foreignServerType, String foreignServerVersion, String authorizationIdentifier) {
        super(ForeignServers.FOREIGN_SERVERS);

        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setForeignServerType(foreignServerType);
        setForeignServerVersion(foreignServerVersion);
        setAuthorizationIdentifier(authorizationIdentifier);
        resetChangedOnNotNull();
    }
}
