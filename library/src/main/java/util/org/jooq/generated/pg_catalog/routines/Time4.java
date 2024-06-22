/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import java.time.LocalTime;
import java.time.OffsetDateTime;

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
public class Time4 extends AbstractRoutine<LocalTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.time.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false);

    /**
     * The parameter <code>pg_catalog.time._1</code>.
     */
    public static final Parameter<OffsetDateTime> _1 = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    /**
     * Create a new routine call instance
     */
    public Time4() {
        super("time", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetDateTime> field) {
        setField(_1, field);
    }
}
