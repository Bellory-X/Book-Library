/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Float83 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.float8.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>pg_catalog.float8._1</code>.
     */
    public static final Parameter<JSONB> _1 = Internal.createParameter("_1", SQLDataType.JSONB, false, true);

    /**
     * Create a new routine call instance
     */
    public Float83() {
        super("float8", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(JSONB value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<JSONB> field) {
        setField(_1, field);
    }
}
