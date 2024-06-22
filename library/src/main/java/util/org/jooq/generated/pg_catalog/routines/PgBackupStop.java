/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.pg_catalog.routines;


import org.jooq.Parameter;
import org.jooq.generated.pg_catalog.PgCatalog;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgBackupStop extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_backup_stop.wait_for_archive</code>.
     */
    public static final Parameter<Boolean> WAIT_FOR_ARCHIVE = Internal.createParameter("wait_for_archive", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_backup_stop.labelfile</code>.
     */
    public static final Parameter<String> LABELFILE = Internal.createParameter("labelfile", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_backup_stop.spcmapfile</code>.
     */
    public static final Parameter<String> SPCMAPFILE = Internal.createParameter("spcmapfile", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PgBackupStop() {
        super("pg_backup_stop", PgCatalog.PG_CATALOG);

        addInParameter(WAIT_FOR_ARCHIVE);
        addOutParameter(LSN);
        addOutParameter(LABELFILE);
        addOutParameter(SPCMAPFILE);
    }

    /**
     * Set the <code>wait_for_archive</code> parameter IN value to the routine
     */
    public void setWaitForArchive(Boolean value) {
        setValue(WAIT_FOR_ARCHIVE, value);
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
    public Object getLsn() {
        return get(LSN);
    }

    /**
     * Get the <code>labelfile</code> parameter OUT value from the routine
     */
    public String getLabelfile() {
        return get(LABELFILE);
    }

    /**
     * Get the <code>spcmapfile</code> parameter OUT value from the routine
     */
    public String getSpcmapfile() {
        return get(SPCMAPFILE);
    }
}
