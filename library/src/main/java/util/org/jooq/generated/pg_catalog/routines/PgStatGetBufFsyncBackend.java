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
public class PgStatGetBufFsyncBackend extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_stat_get_buf_fsync_backend.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetBufFsyncBackend() {
        super("pg_stat_get_buf_fsync_backend", PgCatalog.PG_CATALOG, SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
    }
}