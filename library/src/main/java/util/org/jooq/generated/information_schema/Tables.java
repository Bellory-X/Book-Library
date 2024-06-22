/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.information_schema;


import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.generated.information_schema.tables.AdministrableRoleAuthorizations;
import org.jooq.generated.information_schema.tables.ApplicableRoles;
import org.jooq.generated.information_schema.tables.Attributes;
import org.jooq.generated.information_schema.tables.CharacterSets;
import org.jooq.generated.information_schema.tables.CheckConstraintRoutineUsage;
import org.jooq.generated.information_schema.tables.CheckConstraints;
import org.jooq.generated.information_schema.tables.CollationCharacterSetApplicability;
import org.jooq.generated.information_schema.tables.Collations;
import org.jooq.generated.information_schema.tables.ColumnColumnUsage;
import org.jooq.generated.information_schema.tables.ColumnDomainUsage;
import org.jooq.generated.information_schema.tables.ColumnOptions;
import org.jooq.generated.information_schema.tables.ColumnPrivileges;
import org.jooq.generated.information_schema.tables.ColumnUdtUsage;
import org.jooq.generated.information_schema.tables.Columns;
import org.jooq.generated.information_schema.tables.ConstraintColumnUsage;
import org.jooq.generated.information_schema.tables.ConstraintTableUsage;
import org.jooq.generated.information_schema.tables.DataTypePrivileges;
import org.jooq.generated.information_schema.tables.DomainConstraints;
import org.jooq.generated.information_schema.tables.DomainUdtUsage;
import org.jooq.generated.information_schema.tables.Domains;
import org.jooq.generated.information_schema.tables.ElementTypes;
import org.jooq.generated.information_schema.tables.EnabledRoles;
import org.jooq.generated.information_schema.tables.ForeignDataWrapperOptions;
import org.jooq.generated.information_schema.tables.ForeignDataWrappers;
import org.jooq.generated.information_schema.tables.ForeignServerOptions;
import org.jooq.generated.information_schema.tables.ForeignServers;
import org.jooq.generated.information_schema.tables.ForeignTableOptions;
import org.jooq.generated.information_schema.tables.ForeignTables;
import org.jooq.generated.information_schema.tables.InformationSchemaCatalogName;
import org.jooq.generated.information_schema.tables.KeyColumnUsage;
import org.jooq.generated.information_schema.tables.Parameters;
import org.jooq.generated.information_schema.tables.ReferentialConstraints;
import org.jooq.generated.information_schema.tables.RoleColumnGrants;
import org.jooq.generated.information_schema.tables.RoleRoutineGrants;
import org.jooq.generated.information_schema.tables.RoleTableGrants;
import org.jooq.generated.information_schema.tables.RoleUdtGrants;
import org.jooq.generated.information_schema.tables.RoleUsageGrants;
import org.jooq.generated.information_schema.tables.RoutineColumnUsage;
import org.jooq.generated.information_schema.tables.RoutinePrivileges;
import org.jooq.generated.information_schema.tables.RoutineRoutineUsage;
import org.jooq.generated.information_schema.tables.RoutineSequenceUsage;
import org.jooq.generated.information_schema.tables.RoutineTableUsage;
import org.jooq.generated.information_schema.tables.Routines;
import org.jooq.generated.information_schema.tables.Schemata;
import org.jooq.generated.information_schema.tables.Sequences;
import org.jooq.generated.information_schema.tables.SqlFeatures;
import org.jooq.generated.information_schema.tables.SqlImplementationInfo;
import org.jooq.generated.information_schema.tables.SqlParts;
import org.jooq.generated.information_schema.tables.SqlSizing;
import org.jooq.generated.information_schema.tables.TableConstraints;
import org.jooq.generated.information_schema.tables.TablePrivileges;
import org.jooq.generated.information_schema.tables.Transforms;
import org.jooq.generated.information_schema.tables.TriggeredUpdateColumns;
import org.jooq.generated.information_schema.tables.Triggers;
import org.jooq.generated.information_schema.tables.UdtPrivileges;
import org.jooq.generated.information_schema.tables.UsagePrivileges;
import org.jooq.generated.information_schema.tables.UserDefinedTypes;
import org.jooq.generated.information_schema.tables.UserMappingOptions;
import org.jooq.generated.information_schema.tables.UserMappings;
import org.jooq.generated.information_schema.tables.ViewColumnUsage;
import org.jooq.generated.information_schema.tables.ViewRoutineUsage;
import org.jooq.generated.information_schema.tables.ViewTableUsage;
import org.jooq.generated.information_schema.tables.Views;
import org.jooq.generated.information_schema.tables._PgExpandarray;
import org.jooq.generated.information_schema.tables._PgForeignDataWrappers;
import org.jooq.generated.information_schema.tables._PgForeignServers;
import org.jooq.generated.information_schema.tables._PgForeignTableColumns;
import org.jooq.generated.information_schema.tables._PgForeignTables;
import org.jooq.generated.information_schema.tables._PgUserMappings;
import org.jooq.generated.information_schema.tables.records._PgExpandarrayRecord;


/**
 * Convenience access to all tables in information_schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema._pg_expandarray</code>.
     */
    public static final _PgExpandarray _PG_EXPANDARRAY = _PgExpandarray._PG_EXPANDARRAY;

    /**
     * Call <code>information_schema._pg_expandarray</code>.
     */
    public static Result<_PgExpandarrayRecord> _PG_EXPANDARRAY(
          Configuration configuration
        , Object[] __1
    ) {
        return configuration.dsl().selectFrom(org.jooq.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
              __1
        )).fetch();
    }

    /**
     * Get <code>information_schema._pg_expandarray</code> as a table.
     */
    public static _PgExpandarray _PG_EXPANDARRAY(
          Object[] __1
    ) {
        return org.jooq.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }

    /**
     * Get <code>information_schema._pg_expandarray</code> as a table.
     */
    public static _PgExpandarray _PG_EXPANDARRAY(
          Field<Object[]> __1
    ) {
        return org.jooq.generated.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }

    /**
     * The table <code>information_schema._pg_foreign_data_wrappers</code>.
     */
    public static final _PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema._pg_foreign_servers</code>.
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = _PgForeignServers._PG_FOREIGN_SERVERS;

    /**
     * The table <code>information_schema._pg_foreign_table_columns</code>.
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = _PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS;

    /**
     * The table <code>information_schema._pg_foreign_tables</code>.
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = _PgForeignTables._PG_FOREIGN_TABLES;

    /**
     * The table <code>information_schema._pg_user_mappings</code>.
     */
    public static final _PgUserMappings _PG_USER_MAPPINGS = _PgUserMappings._PG_USER_MAPPINGS;

    /**
     * The table
     * <code>information_schema.administrable_role_authorizations</code>.
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS;

    /**
     * The table <code>information_schema.applicable_roles</code>.
     */
    public static final ApplicableRoles APPLICABLE_ROLES = ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.attributes</code>.
     */
    public static final Attributes ATTRIBUTES = Attributes.ATTRIBUTES;

    /**
     * The table <code>information_schema.character_sets</code>.
     */
    public static final CharacterSets CHARACTER_SETS = CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.check_constraint_routine_usage</code>.
     */
    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.check_constraints</code>.
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table
     * <code>information_schema.collation_character_set_applicability</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.collations</code>.
     */
    public static final Collations COLLATIONS = Collations.COLLATIONS;

    /**
     * The table <code>information_schema.column_column_usage</code>.
     */
    public static final ColumnColumnUsage COLUMN_COLUMN_USAGE = ColumnColumnUsage.COLUMN_COLUMN_USAGE;

    /**
     * The table <code>information_schema.column_domain_usage</code>.
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = ColumnDomainUsage.COLUMN_DOMAIN_USAGE;

    /**
     * The table <code>information_schema.column_options</code>.
     */
    public static final ColumnOptions COLUMN_OPTIONS = ColumnOptions.COLUMN_OPTIONS;

    /**
     * The table <code>information_schema.column_privileges</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.column_udt_usage</code>.
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = ColumnUdtUsage.COLUMN_UDT_USAGE;

    /**
     * The table <code>information_schema.columns</code>.
     */
    public static final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>information_schema.constraint_column_usage</code>.
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;

    /**
     * The table <code>information_schema.constraint_table_usage</code>.
     */
    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = ConstraintTableUsage.CONSTRAINT_TABLE_USAGE;

    /**
     * The table <code>information_schema.data_type_privileges</code>.
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = DataTypePrivileges.DATA_TYPE_PRIVILEGES;

    /**
     * The table <code>information_schema.domain_constraints</code>.
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = DomainConstraints.DOMAIN_CONSTRAINTS;

    /**
     * The table <code>information_schema.domain_udt_usage</code>.
     */
    public static final DomainUdtUsage DOMAIN_UDT_USAGE = DomainUdtUsage.DOMAIN_UDT_USAGE;

    /**
     * The table <code>information_schema.domains</code>.
     */
    public static final Domains DOMAINS = Domains.DOMAINS;

    /**
     * The table <code>information_schema.element_types</code>.
     */
    public static final ElementTypes ELEMENT_TYPES = ElementTypes.ELEMENT_TYPES;

    /**
     * The table <code>information_schema.enabled_roles</code>.
     */
    public static final EnabledRoles ENABLED_ROLES = EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.foreign_data_wrapper_options</code>.
     */
    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_data_wrappers</code>.
     */
    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = ForeignDataWrappers.FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema.foreign_server_options</code>.
     */
    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = ForeignServerOptions.FOREIGN_SERVER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_servers</code>.
     */
    public static final ForeignServers FOREIGN_SERVERS = ForeignServers.FOREIGN_SERVERS;

    /**
     * The table <code>information_schema.foreign_table_options</code>.
     */
    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = ForeignTableOptions.FOREIGN_TABLE_OPTIONS;

    /**
     * The table <code>information_schema.foreign_tables</code>.
     */
    public static final ForeignTables FOREIGN_TABLES = ForeignTables.FOREIGN_TABLES;

    /**
     * The table
     * <code>information_schema.information_schema_catalog_name</code>.
     */
    public static final InformationSchemaCatalogName INFORMATION_SCHEMA_CATALOG_NAME = InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME;

    /**
     * The table <code>information_schema.key_column_usage</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.parameters</code>.
     */
    public static final Parameters PARAMETERS = Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.referential_constraints</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.role_column_grants</code>.
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = RoleColumnGrants.ROLE_COLUMN_GRANTS;

    /**
     * The table <code>information_schema.role_routine_grants</code>.
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = RoleRoutineGrants.ROLE_ROUTINE_GRANTS;

    /**
     * The table <code>information_schema.role_table_grants</code>.
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = RoleTableGrants.ROLE_TABLE_GRANTS;

    /**
     * The table <code>information_schema.role_udt_grants</code>.
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = RoleUdtGrants.ROLE_UDT_GRANTS;

    /**
     * The table <code>information_schema.role_usage_grants</code>.
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = RoleUsageGrants.ROLE_USAGE_GRANTS;

    /**
     * The table <code>information_schema.routine_column_usage</code>.
     */
    public static final RoutineColumnUsage ROUTINE_COLUMN_USAGE = RoutineColumnUsage.ROUTINE_COLUMN_USAGE;

    /**
     * The table <code>information_schema.routine_privileges</code>.
     */
    public static final RoutinePrivileges ROUTINE_PRIVILEGES = RoutinePrivileges.ROUTINE_PRIVILEGES;

    /**
     * The table <code>information_schema.routine_routine_usage</code>.
     */
    public static final RoutineRoutineUsage ROUTINE_ROUTINE_USAGE = RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.routine_sequence_usage</code>.
     */
    public static final RoutineSequenceUsage ROUTINE_SEQUENCE_USAGE = RoutineSequenceUsage.ROUTINE_SEQUENCE_USAGE;

    /**
     * The table <code>information_schema.routine_table_usage</code>.
     */
    public static final RoutineTableUsage ROUTINE_TABLE_USAGE = RoutineTableUsage.ROUTINE_TABLE_USAGE;

    /**
     * The table <code>information_schema.routines</code>.
     */
    public static final Routines ROUTINES = Routines.ROUTINES;

    /**
     * The table <code>information_schema.schemata</code>.
     */
    public static final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.sequences</code>.
     */
    public static final Sequences SEQUENCES = Sequences.SEQUENCES;

    /**
     * The table <code>information_schema.sql_features</code>.
     */
    public static final SqlFeatures SQL_FEATURES = SqlFeatures.SQL_FEATURES;

    /**
     * The table <code>information_schema.sql_implementation_info</code>.
     */
    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = SqlImplementationInfo.SQL_IMPLEMENTATION_INFO;

    /**
     * The table <code>information_schema.sql_parts</code>.
     */
    public static final SqlParts SQL_PARTS = SqlParts.SQL_PARTS;

    /**
     * The table <code>information_schema.sql_sizing</code>.
     */
    public static final SqlSizing SQL_SIZING = SqlSizing.SQL_SIZING;

    /**
     * The table <code>information_schema.table_constraints</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.table_privileges</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.tables</code>.
     */
    public static final org.jooq.generated.information_schema.tables.Tables TABLES = org.jooq.generated.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.transforms</code>.
     */
    public static final Transforms TRANSFORMS = Transforms.TRANSFORMS;

    /**
     * The table <code>information_schema.triggered_update_columns</code>.
     */
    public static final TriggeredUpdateColumns TRIGGERED_UPDATE_COLUMNS = TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS;

    /**
     * The table <code>information_schema.triggers</code>.
     */
    public static final Triggers TRIGGERS = Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.udt_privileges</code>.
     */
    public static final UdtPrivileges UDT_PRIVILEGES = UdtPrivileges.UDT_PRIVILEGES;

    /**
     * The table <code>information_schema.usage_privileges</code>.
     */
    public static final UsagePrivileges USAGE_PRIVILEGES = UsagePrivileges.USAGE_PRIVILEGES;

    /**
     * The table <code>information_schema.user_defined_types</code>.
     */
    public static final UserDefinedTypes USER_DEFINED_TYPES = UserDefinedTypes.USER_DEFINED_TYPES;

    /**
     * The table <code>information_schema.user_mapping_options</code>.
     */
    public static final UserMappingOptions USER_MAPPING_OPTIONS = UserMappingOptions.USER_MAPPING_OPTIONS;

    /**
     * The table <code>information_schema.user_mappings</code>.
     */
    public static final UserMappings USER_MAPPINGS = UserMappings.USER_MAPPINGS;

    /**
     * The table <code>information_schema.view_column_usage</code>.
     */
    public static final ViewColumnUsage VIEW_COLUMN_USAGE = ViewColumnUsage.VIEW_COLUMN_USAGE;

    /**
     * The table <code>information_schema.view_routine_usage</code>.
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.view_table_usage</code>.
     */
    public static final ViewTableUsage VIEW_TABLE_USAGE = ViewTableUsage.VIEW_TABLE_USAGE;

    /**
     * The table <code>information_schema.views</code>.
     */
    public static final Views VIEWS = Views.VIEWS;
}
