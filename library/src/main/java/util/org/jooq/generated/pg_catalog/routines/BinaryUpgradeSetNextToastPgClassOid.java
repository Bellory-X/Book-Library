/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import org.jooq.Parameter;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BinaryUpgradeSetNextToastPgClassOid extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.binary_upgrade_set_next_toast_pg_class_oid._1</code>.
     */
    public static final Parameter<Long> _1 = Internal.createParameter("_1", SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public BinaryUpgradeSetNextToastPgClassOid() {
        super("binary_upgrade_set_next_toast_pg_class_oid", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }
}
