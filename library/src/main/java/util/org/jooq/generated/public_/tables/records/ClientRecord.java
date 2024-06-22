/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.public_.tables.records;


import java.time.LocalDate;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.public_.tables.Client;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientRecord extends UpdatableRecordImpl<ClientRecord> implements Record5<UUID, String, String, String, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.client.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.client.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.client.surname</code>.
     */
    public void setSurname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.client.surname</code>.
     */
    public String getSurname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.client.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.client.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.client.patronymic</code>.
     */
    public void setPatronymic(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.client.patronymic</code>.
     */
    public String getPatronymic() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.client.date_of_birthday</code>.
     */
    public void setDateOfBirthday(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.client.date_of_birthday</code>.
     */
    public LocalDate getDateOfBirthday() {
        return (LocalDate) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, String, String, String, LocalDate> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, String, String, String, LocalDate> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Client.CLIENT.ID;
    }

    @Override
    public Field<String> field2() {
        return Client.CLIENT.SURNAME;
    }

    @Override
    public Field<String> field3() {
        return Client.CLIENT.NAME;
    }

    @Override
    public Field<String> field4() {
        return Client.CLIENT.PATRONYMIC;
    }

    @Override
    public Field<LocalDate> field5() {
        return Client.CLIENT.DATE_OF_BIRTHDAY;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getSurname();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getPatronymic();
    }

    @Override
    public LocalDate component5() {
        return getDateOfBirthday();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getSurname();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getPatronymic();
    }

    @Override
    public LocalDate value5() {
        return getDateOfBirthday();
    }

    @Override
    public ClientRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public ClientRecord value2(String value) {
        setSurname(value);
        return this;
    }

    @Override
    public ClientRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ClientRecord value4(String value) {
        setPatronymic(value);
        return this;
    }

    @Override
    public ClientRecord value5(LocalDate value) {
        setDateOfBirthday(value);
        return this;
    }

    @Override
    public ClientRecord values(UUID value1, String value2, String value3, String value4, LocalDate value5) {
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
     * Create a detached ClientRecord
     */
    public ClientRecord() {
        super(Client.CLIENT);
    }

    /**
     * Create a detached, initialised ClientRecord
     */
    public ClientRecord(UUID id, String surname, String name, String patronymic, LocalDate dateOfBirthday) {
        super(Client.CLIENT);

        setId(id);
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setDateOfBirthday(dateOfBirthday);
        resetChangedOnNotNull();
    }
}