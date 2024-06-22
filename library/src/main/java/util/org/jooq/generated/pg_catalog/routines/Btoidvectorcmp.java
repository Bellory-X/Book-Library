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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Btoidvectorcmp extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.btoidvectorcmp.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.btoidvectorcmp._1</code>.
     */
    public static final Parameter<Object[]> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").array(), false, true);

    /**
     * The parameter <code>pg_catalog.btoidvectorcmp._2</code>.
     */
    public static final Parameter<Object[]> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").array(), false, true);

    /**
     * Create a new routine call instance
     */
    public Btoidvectorcmp() {
        super("btoidvectorcmp", PgCatalog.PG_CATALOG, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object[] value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Object[]> field) {
        setField(_2, field);
    }
}
