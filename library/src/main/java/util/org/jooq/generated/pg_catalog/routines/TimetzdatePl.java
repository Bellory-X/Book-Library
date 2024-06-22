/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

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
public class TimetzdatePl extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timetzdate_pl.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.timetzdate_pl._1</code>.
     */
    public static final Parameter<OffsetTime> _1 = Internal.createParameter("_1", SQLDataType.TIMEWITHTIMEZONE(6), false, true);

    /**
     * The parameter <code>pg_catalog.timetzdate_pl._2</code>.
     */
    public static final Parameter<LocalDate> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true);

    /**
     * Create a new routine call instance
     */
    public TimetzdatePl() {
        super("timetzdate_pl", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetTime> field) {
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
