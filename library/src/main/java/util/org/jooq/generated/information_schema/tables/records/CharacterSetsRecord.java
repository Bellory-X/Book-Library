/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.generated.information_schema.tables.CharacterSets;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public void setCharacterRepertoire(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public String getCharacterRepertoire() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public void setFormOfUse(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public String getFormOfUse() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public void setDefaultCollateCatalog(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public String getDefaultCollateCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public void setDefaultCollateSchema(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public String getDefaultCollateSchema() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public void setDefaultCollateName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public String getDefaultCollateName() {
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
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field4() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_REPERTOIRE;
    }

    @Override
    public Field<String> field5() {
        return CharacterSets.CHARACTER_SETS.FORM_OF_USE;
    }

    @Override
    public Field<String> field6() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_CATALOG;
    }

    @Override
    public Field<String> field7() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_SCHEMA;
    }

    @Override
    public Field<String> field8() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_NAME;
    }

    @Override
    public String component1() {
        return getCharacterSetCatalog();
    }

    @Override
    public String component2() {
        return getCharacterSetSchema();
    }

    @Override
    public String component3() {
        return getCharacterSetName();
    }

    @Override
    public String component4() {
        return getCharacterRepertoire();
    }

    @Override
    public String component5() {
        return getFormOfUse();
    }

    @Override
    public String component6() {
        return getDefaultCollateCatalog();
    }

    @Override
    public String component7() {
        return getDefaultCollateSchema();
    }

    @Override
    public String component8() {
        return getDefaultCollateName();
    }

    @Override
    public String value1() {
        return getCharacterSetCatalog();
    }

    @Override
    public String value2() {
        return getCharacterSetSchema();
    }

    @Override
    public String value3() {
        return getCharacterSetName();
    }

    @Override
    public String value4() {
        return getCharacterRepertoire();
    }

    @Override
    public String value5() {
        return getFormOfUse();
    }

    @Override
    public String value6() {
        return getDefaultCollateCatalog();
    }

    @Override
    public String value7() {
        return getDefaultCollateSchema();
    }

    @Override
    public String value8() {
        return getDefaultCollateName();
    }

    @Override
    public CharacterSetsRecord value1(String value) {
        setCharacterSetCatalog(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value2(String value) {
        setCharacterSetSchema(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value3(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value4(String value) {
        setCharacterRepertoire(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value5(String value) {
        setFormOfUse(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value6(String value) {
        setDefaultCollateCatalog(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value7(String value) {
        setDefaultCollateSchema(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value8(String value) {
        setDefaultCollateName(value);
        return this;
    }

    @Override
    public CharacterSetsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
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
     * Create a detached CharacterSetsRecord
     */
    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    public CharacterSetsRecord(String characterSetCatalog, String characterSetSchema, String characterSetName, String characterRepertoire, String formOfUse, String defaultCollateCatalog, String defaultCollateSchema, String defaultCollateName) {
        super(CharacterSets.CHARACTER_SETS);

        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCharacterRepertoire(characterRepertoire);
        setFormOfUse(formOfUse);
        setDefaultCollateCatalog(defaultCollateCatalog);
        setDefaultCollateSchema(defaultCollateSchema);
        setDefaultCollateName(defaultCollateName);
        resetChangedOnNotNull();
    }
}
