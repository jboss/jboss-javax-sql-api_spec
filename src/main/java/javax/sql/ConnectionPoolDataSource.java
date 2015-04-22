/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.sql;

import java.sql.SQLException;


/**
 * A factory for <code>PooledConnection</code>
 * objects.  An object that implements this interface will typically be
 * registered with a naming service that is based on the
 * Java<sup><font size=-2>TM</font></sup> Naming and Directory Interface
 * (JNDI).
 *
 */

public interface ConnectionPoolDataSource  extends CommonDataSource {

  /**
   * Attempts to establish a physical database connection that can
   * be used as a pooled connection.
   *
   * @return  a <code>PooledConnection</code> object that is a physical
   *         connection to the database that this
   *         <code>ConnectionPoolDataSource</code> object represents
   * @exception SQLException if a database access error occurs
   * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @since 1.4
   */
  PooledConnection getPooledConnection() throws SQLException;

  /**
   * Attempts to establish a physical database connection that can
   * be used as a pooled connection.
   *
   * @param user the database user on whose behalf the connection is being made
   * @param password the user's password
   * @return  a <code>PooledConnection</code> object that is a physical
   *         connection to the database that this
   *         <code>ConnectionPoolDataSource</code> object represents
   * @exception SQLException if a database access error occurs
   * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @since 1.4
   */
  PooledConnection getPooledConnection(String user, String password)
    throws SQLException;
 }

