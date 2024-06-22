/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.generated.pg_catalog.tables.PgIndex;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgIndexRecord extends UpdatableRecordImpl<PgIndexRecord> implements Record21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    public void setIndrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    public Long getIndrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    public void setIndnatts(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    public Short getIndnatts() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    public void setIndnkeyatts(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    public Short getIndnkeyatts() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    public void setIndisunique(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    public Boolean getIndisunique() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnullsnotdistinct</code>.
     */
    public void setIndnullsnotdistinct(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnullsnotdistinct</code>.
     */
    public Boolean getIndnullsnotdistinct() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public void setIndisprimary(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public Boolean getIndisprimary() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public void setIndisexclusion(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public Boolean getIndisexclusion() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public void setIndimmediate(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public Boolean getIndimmediate() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public void setIndisclustered(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public Boolean getIndisclustered() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public void setIndisvalid(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public Boolean getIndisvalid() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public void setIndcheckxmin(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public Boolean getIndcheckxmin() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisready</code>.
     */
    public void setIndisready(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisready</code>.
     */
    public Boolean getIndisready() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indislive</code>.
     */
    public void setIndislive(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indislive</code>.
     */
    public Boolean getIndislive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public void setIndisreplident(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public Boolean getIndisreplident() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indkey</code>.
     */
    public void setIndkey(Object[] value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indkey</code>.
     */
    public Object[] getIndkey() {
        return (Object[]) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    public void setIndcollation(Object[] value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    public Object[] getIndcollation() {
        return (Object[]) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indclass</code>.
     */
    public void setIndclass(Object[] value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indclass</code>.
     */
    public Object[] getIndclass() {
        return (Object[]) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indoption</code>.
     */
    public void setIndoption(Object[] value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indoption</code>.
     */
    public Object[] getIndoption() {
        return (Object[]) get(18);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setIndexprs(Object value) {
        set(19, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getIndexprs() {
        return get(19);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setIndpred(Object value) {
        set(20, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getIndpred() {
        return get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgIndex.PG_INDEX.INDEXRELID;
    }

    @Override
    public Field<Long> field2() {
        return PgIndex.PG_INDEX.INDRELID;
    }

    @Override
    public Field<Short> field3() {
        return PgIndex.PG_INDEX.INDNATTS;
    }

    @Override
    public Field<Short> field4() {
        return PgIndex.PG_INDEX.INDNKEYATTS;
    }

    @Override
    public Field<Boolean> field5() {
        return PgIndex.PG_INDEX.INDISUNIQUE;
    }

    @Override
    public Field<Boolean> field6() {
        return PgIndex.PG_INDEX.INDNULLSNOTDISTINCT;
    }

    @Override
    public Field<Boolean> field7() {
        return PgIndex.PG_INDEX.INDISPRIMARY;
    }

    @Override
    public Field<Boolean> field8() {
        return PgIndex.PG_INDEX.INDISEXCLUSION;
    }

    @Override
    public Field<Boolean> field9() {
        return PgIndex.PG_INDEX.INDIMMEDIATE;
    }

    @Override
    public Field<Boolean> field10() {
        return PgIndex.PG_INDEX.INDISCLUSTERED;
    }

    @Override
    public Field<Boolean> field11() {
        return PgIndex.PG_INDEX.INDISVALID;
    }

    @Override
    public Field<Boolean> field12() {
        return PgIndex.PG_INDEX.INDCHECKXMIN;
    }

    @Override
    public Field<Boolean> field13() {
        return PgIndex.PG_INDEX.INDISREADY;
    }

    @Override
    public Field<Boolean> field14() {
        return PgIndex.PG_INDEX.INDISLIVE;
    }

    @Override
    public Field<Boolean> field15() {
        return PgIndex.PG_INDEX.INDISREPLIDENT;
    }

    @Override
    public Field<Object[]> field16() {
        return PgIndex.PG_INDEX.INDKEY;
    }

    @Override
    public Field<Object[]> field17() {
        return PgIndex.PG_INDEX.INDCOLLATION;
    }

    @Override
    public Field<Object[]> field18() {
        return PgIndex.PG_INDEX.INDCLASS;
    }

    @Override
    public Field<Object[]> field19() {
        return PgIndex.PG_INDEX.INDOPTION;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field20() {
        return PgIndex.PG_INDEX.INDEXPRS;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field21() {
        return PgIndex.PG_INDEX.INDPRED;
    }

    @Override
    public Long component1() {
        return getIndexrelid();
    }

    @Override
    public Long component2() {
        return getIndrelid();
    }

    @Override
    public Short component3() {
        return getIndnatts();
    }

    @Override
    public Short component4() {
        return getIndnkeyatts();
    }

    @Override
    public Boolean component5() {
        return getIndisunique();
    }

    @Override
    public Boolean component6() {
        return getIndnullsnotdistinct();
    }

    @Override
    public Boolean component7() {
        return getIndisprimary();
    }

    @Override
    public Boolean component8() {
        return getIndisexclusion();
    }

    @Override
    public Boolean component9() {
        return getIndimmediate();
    }

    @Override
    public Boolean component10() {
        return getIndisclustered();
    }

    @Override
    public Boolean component11() {
        return getIndisvalid();
    }

    @Override
    public Boolean component12() {
        return getIndcheckxmin();
    }

    @Override
    public Boolean component13() {
        return getIndisready();
    }

    @Override
    public Boolean component14() {
        return getIndislive();
    }

    @Override
    public Boolean component15() {
        return getIndisreplident();
    }

    @Override
    public Object[] component16() {
        return getIndkey();
    }

    @Override
    public Object[] component17() {
        return getIndcollation();
    }

    @Override
    public Object[] component18() {
        return getIndclass();
    }

    @Override
    public Object[] component19() {
        return getIndoption();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component20() {
        return getIndexprs();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component21() {
        return getIndpred();
    }

    @Override
    public Long value1() {
        return getIndexrelid();
    }

    @Override
    public Long value2() {
        return getIndrelid();
    }

    @Override
    public Short value3() {
        return getIndnatts();
    }

    @Override
    public Short value4() {
        return getIndnkeyatts();
    }

    @Override
    public Boolean value5() {
        return getIndisunique();
    }

    @Override
    public Boolean value6() {
        return getIndnullsnotdistinct();
    }

    @Override
    public Boolean value7() {
        return getIndisprimary();
    }

    @Override
    public Boolean value8() {
        return getIndisexclusion();
    }

    @Override
    public Boolean value9() {
        return getIndimmediate();
    }

    @Override
    public Boolean value10() {
        return getIndisclustered();
    }

    @Override
    public Boolean value11() {
        return getIndisvalid();
    }

    @Override
    public Boolean value12() {
        return getIndcheckxmin();
    }

    @Override
    public Boolean value13() {
        return getIndisready();
    }

    @Override
    public Boolean value14() {
        return getIndislive();
    }

    @Override
    public Boolean value15() {
        return getIndisreplident();
    }

    @Override
    public Object[] value16() {
        return getIndkey();
    }

    @Override
    public Object[] value17() {
        return getIndcollation();
    }

    @Override
    public Object[] value18() {
        return getIndclass();
    }

    @Override
    public Object[] value19() {
        return getIndoption();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value20() {
        return getIndexprs();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value21() {
        return getIndpred();
    }

    @Override
    public PgIndexRecord value1(Long value) {
        setIndexrelid(value);
        return this;
    }

    @Override
    public PgIndexRecord value2(Long value) {
        setIndrelid(value);
        return this;
    }

    @Override
    public PgIndexRecord value3(Short value) {
        setIndnatts(value);
        return this;
    }

    @Override
    public PgIndexRecord value4(Short value) {
        setIndnkeyatts(value);
        return this;
    }

    @Override
    public PgIndexRecord value5(Boolean value) {
        setIndisunique(value);
        return this;
    }

    @Override
    public PgIndexRecord value6(Boolean value) {
        setIndnullsnotdistinct(value);
        return this;
    }

    @Override
    public PgIndexRecord value7(Boolean value) {
        setIndisprimary(value);
        return this;
    }

    @Override
    public PgIndexRecord value8(Boolean value) {
        setIndisexclusion(value);
        return this;
    }

    @Override
    public PgIndexRecord value9(Boolean value) {
        setIndimmediate(value);
        return this;
    }

    @Override
    public PgIndexRecord value10(Boolean value) {
        setIndisclustered(value);
        return this;
    }

    @Override
    public PgIndexRecord value11(Boolean value) {
        setIndisvalid(value);
        return this;
    }

    @Override
    public PgIndexRecord value12(Boolean value) {
        setIndcheckxmin(value);
        return this;
    }

    @Override
    public PgIndexRecord value13(Boolean value) {
        setIndisready(value);
        return this;
    }

    @Override
    public PgIndexRecord value14(Boolean value) {
        setIndislive(value);
        return this;
    }

    @Override
    public PgIndexRecord value15(Boolean value) {
        setIndisreplident(value);
        return this;
    }

    @Override
    public PgIndexRecord value16(Object[] value) {
        setIndkey(value);
        return this;
    }

    @Override
    public PgIndexRecord value17(Object[] value) {
        setIndcollation(value);
        return this;
    }

    @Override
    public PgIndexRecord value18(Object[] value) {
        setIndclass(value);
        return this;
    }

    @Override
    public PgIndexRecord value19(Object[] value) {
        setIndoption(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgIndexRecord value20(Object value) {
        setIndexprs(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgIndexRecord value21(Object value) {
        setIndpred(value);
        return this;
    }

    @Override
    public PgIndexRecord values(Long value1, Long value2, Short value3, Short value4, Boolean value5, Boolean value6, Boolean value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12, Boolean value13, Boolean value14, Boolean value15, Object[] value16, Object[] value17, Object[] value18, Object[] value19, Object value20, Object value21) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgIndexRecord
     */
    public PgIndexRecord() {
        super(PgIndex.PG_INDEX);
    }

    /**
     * Create a detached, initialised PgIndexRecord
     */
    public PgIndexRecord(Long indexrelid, Long indrelid, Short indnatts, Short indnkeyatts, Boolean indisunique, Boolean indnullsnotdistinct, Boolean indisprimary, Boolean indisexclusion, Boolean indimmediate, Boolean indisclustered, Boolean indisvalid, Boolean indcheckxmin, Boolean indisready, Boolean indislive, Boolean indisreplident, Object[] indkey, Object[] indcollation, Object[] indclass, Object[] indoption, Object indexprs, Object indpred) {
        super(PgIndex.PG_INDEX);

        setIndexrelid(indexrelid);
        setIndrelid(indrelid);
        setIndnatts(indnatts);
        setIndnkeyatts(indnkeyatts);
        setIndisunique(indisunique);
        setIndnullsnotdistinct(indnullsnotdistinct);
        setIndisprimary(indisprimary);
        setIndisexclusion(indisexclusion);
        setIndimmediate(indimmediate);
        setIndisclustered(indisclustered);
        setIndisvalid(indisvalid);
        setIndcheckxmin(indcheckxmin);
        setIndisready(indisready);
        setIndislive(indislive);
        setIndisreplident(indisreplident);
        setIndkey(indkey);
        setIndcollation(indcollation);
        setIndclass(indclass);
        setIndoption(indoption);
        setIndexprs(indexprs);
        setIndpred(indpred);
        resetChangedOnNotNull();
    }
}
