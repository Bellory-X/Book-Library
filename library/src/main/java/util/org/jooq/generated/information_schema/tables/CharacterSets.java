/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.CharacterSetsRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSets extends TableImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.character_sets</code>
     */
    public static final CharacterSets CHARACTER_SETS = new CharacterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterSetsRecord> getRecordType() {
        return CharacterSetsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_REPERTOIRE = createField(DSL.name("character_repertoire"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.character_sets.form_of_use</code>.
     */
    public final TableField<CharacterSetsRecord, String> FORM_OF_USE = createField(DSL.name("form_of_use"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_CATALOG = createField(DSL.name("default_collate_catalog"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_SCHEMA = createField(DSL.name("default_collate_schema"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_NAME = createField(DSL.name("default_collate_name"), org.jooq.generated.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "character_sets" as  SELECT (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
           (NULL::name)::information_schema.sql_identifier AS character_set_schema,
           (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name,
           (
               CASE
                   WHEN (getdatabaseencoding() = 'UTF8'::name) THEN 'UCS'::name
                   ELSE getdatabaseencoding()
               END)::information_schema.sql_identifier AS character_repertoire,
           (getdatabaseencoding())::information_schema.sql_identifier AS form_of_use,
           (current_database())::information_schema.sql_identifier AS default_collate_catalog,
           (nc.nspname)::information_schema.sql_identifier AS default_collate_schema,
           (c.collname)::information_schema.sql_identifier AS default_collate_name
          FROM (pg_database d
            LEFT JOIN (pg_collation c
            JOIN pg_namespace nc ON ((c.collnamespace = nc.oid))) ON (((d.datcollate = c.collcollate) AND (d.datctype = c.collctype))))
         WHERE (d.datname = current_database())
         ORDER BY (char_length((c.collname)::text)) DESC, c.collname
        LIMIT 1;
        """));
    }

    /**
     * Create an aliased <code>information_schema.character_sets</code> table
     * reference
     */
    public CharacterSets(String alias) {
        this(DSL.name(alias), CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>information_schema.character_sets</code> table
     * reference
     */
    public CharacterSets(Name alias) {
        this(alias, CHARACTER_SETS);
    }

    /**
     * Create a <code>information_schema.character_sets</code> table reference
     */
    public CharacterSets() {
        this(DSL.name("character_sets"), null);
    }

    public <O extends Record> CharacterSets(Table<O> child, ForeignKey<O, CharacterSetsRecord> key) {
        super(child, key, CHARACTER_SETS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CharacterSets as(String alias) {
        return new CharacterSets(DSL.name(alias), this);
    }

    @Override
    public CharacterSets as(Name alias) {
        return new CharacterSets(alias, this);
    }

    @Override
    public CharacterSets as(Table<?> alias) {
        return new CharacterSets(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(String name) {
        return new CharacterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Name name) {
        return new CharacterSets(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Table<?> name) {
        return new CharacterSets(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}