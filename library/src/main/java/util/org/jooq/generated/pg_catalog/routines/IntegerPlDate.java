/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IntegerPlDate extends AbstractRoutine<LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.integer_pl_date.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDate> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATE, false, false);

    /**
     * The parameter <code>pg_catalog.integer_pl_date._1</code>.
     */
    public static final Parameter<Integer> _1 = Internal.createParameter("_1", SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.integer_pl_date._2</code>.
     */
    public static final Parameter<LocalDate> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true);

    /**
     * Create a new routine call instance
     */
    public IntegerPlDate() {
        super("integer_pl_date", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Integer> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDate value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDate> field) {
        setField(_2, field);
    }
}
