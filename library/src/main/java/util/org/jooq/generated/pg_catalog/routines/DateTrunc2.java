/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DateTrunc2 extends AbstractRoutine<YearToSecond> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.date_trunc.RETURN_VALUE</code>.
     */
    public static final Parameter<YearToSecond> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>pg_catalog.date_trunc._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>pg_catalog.date_trunc._2</code>.
     */
    public static final Parameter<YearToSecond> _2 = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true);

    /**
     * Create a new routine call instance
     */
    public DateTrunc2() {
        super("date_trunc", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(YearToSecond value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<YearToSecond> field) {
        setField(_2, field);
    }
}
